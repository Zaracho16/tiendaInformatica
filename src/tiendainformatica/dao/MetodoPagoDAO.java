
package tiendainformatica.dao;

import tiendainformatica.db.ConexionDB;
import tiendainformatica.modelo.MetodoPago;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MetodoPagoDAO {

    public List<MetodoPago> listarMetodosPago() {

        List<MetodoPago> lista = new ArrayList<>();

        String sql = "SELECT id_metodo_pago, nombre "
                   + "FROM metodos_pago "
                   + "ORDER BY id_metodo_pago";

        try (Connection con = ConexionDB.conectar();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {

                MetodoPago metodo = new MetodoPago(
                        rs.getInt("id_metodo_pago"),
                        rs.getString("nombre")
                );

                lista.add(metodo);
            }

        } catch (SQLException e) {
            System.out.println("Error al listar métodos de pago: "
                    + e.getMessage());
        }

        return lista;
    }
}