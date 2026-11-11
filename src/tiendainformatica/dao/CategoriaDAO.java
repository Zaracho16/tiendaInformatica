
package tiendainformatica.dao;

import tiendainformatica.db.ConexionDB;
import tiendainformatica.modelo.Categoria;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoriaDAO {
     // Guardar una categoría
    public boolean guardarCategoria(Categoria categoria) {

        String sql = "INSERT INTO categorias (nombre, descripcion) VALUES (?, ?)";

        try (Connection conexion = ConexionDB.conectar();
             PreparedStatement sentencia = conexion.prepareStatement(sql)) {

            sentencia.setString(1, categoria.getNombre());

            if (categoria.getDescripcion() == null ||
                categoria.getDescripcion().trim().isEmpty()) {

                sentencia.setNull(2, java.sql.Types.VARCHAR);

            } else {
                sentencia.setString(2, categoria.getDescripcion());
            }

            sentencia.executeUpdate();
            return true;

        } catch (SQLException e) {
            if ("23505".equals(e.getSQLState())) {
                System.out.println("Ya existe una categoría con ese nombre.");
            } else {
                e.printStackTrace();
            }

            return false;
        }
    }

    // Listar todas las categorías
    public List<Categoria> listarCategorias() {

        List<Categoria> lista = new ArrayList<>();

        String sql = "SELECT id_categoria, nombre, descripcion "
                   + "FROM categorias ORDER BY id_categoria";

        try (Connection conexion = ConexionDB.conectar();
             PreparedStatement sentencia = conexion.prepareStatement(sql);
             ResultSet resultado = sentencia.executeQuery()) {

            while (resultado.next()) {

                Categoria categoria = new Categoria(
                    resultado.getInt("id_categoria"),
                    resultado.getString("nombre"),
                    resultado.getString("descripcion")
                );

                lista.add(categoria);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }
}
