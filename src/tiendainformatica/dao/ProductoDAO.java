
package tiendainformatica.dao;

import tiendainformatica.db.ConexionDB;
import tiendainformatica.modelo.Producto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ProductoDAO {
    
    public boolean guardarProducto(Producto producto) {
        
        String sql = "INSERT INTO productos"
                + "(nombre, descripcion, precio, stock, id_categoria)"
                + "VALUES (?, ?, ?, ?, ?)";
        
        
        try (Connection con = ConexionDB.conectar(); PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setString(1, producto.getNombre());
            ps.setString(2, producto.getDescripcion());
            ps.setBigDecimal(3, producto.getPrecio());
            ps.setInt(4, producto.getStock());
            ps.setInt(5, producto.getIdCategoria());
            
            return ps.executeUpdate() > 0;
            
        } catch (SQLException e) {
            
            System.out.println("Error al guardar producto: " + e.getMessage());
            
            return false;
            
        }
          
    }
    
    public List<Producto> listarProductos() {

        List<Producto> lista = new ArrayList<>();

        String sql = "SELECT p.id_producto, p.nombre, p.descripcion, "
                + "p.precio, p.stock, p.id_categoria, c.nombre AS nombre_categoria "
                + "FROM productos p "
                + "INNER JOIN categorias c ON p.id_categoria = c.id_categoria "
                + "ORDER BY p.id_producto";

        try (Connection con = ConexionDB.conectar(); PreparedStatement ps = con.prepareStatement(sql);
                
            ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {

                Producto producto = new Producto(
                        rs.getInt("id_producto"),
                        rs.getString("nombre"),
                        rs.getString("descripcion"),
                        rs.getBigDecimal("precio"),
                        rs.getInt("stock"),
                        rs.getInt("id_categoria"),
                        rs.getString("nombre_categoria")
                );

                lista.add(producto);
            }

        } catch (SQLException e) {
            System.out.println("Error al listar productos: " + e.getMessage());
        }

        return lista;
    }
    
}
