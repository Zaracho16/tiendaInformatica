
package tiendainformatica.dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import tiendainformatica.db.ConexionDB;
import java.util.List;
import tiendainformatica.modelo.DetalleVenta;


public class VentaDAO {
    
    public String generarNumeroFactura() {
        
        String sql = "SELECT MAX(id_venta) FROM ventas";
        
        try (Connection con = ConexionDB.conectar(); PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery() ) {
            
            if (rs.next()) {
                
                int ultimoId = rs.getInt(1);
                
                int siguienteNumero = ultimoId + 1;
                
                return String.format("V-%06d", siguienteNumero);
                
            }
            
        } catch (SQLException e) {
            
            System.out.println("Error al generar numero de factura" + e.getMessage());
            
        }
        
        return null;
   
    }
    
    
    public int registrarVenta(Connection con, String numeroFactura, int idCliente, int idUsuario, int idMetodoPago) throws SQLException {

        String sql = "INSERT INTO ventas "
                   + "(numero_factura, id_cliente, id_usuario, id_metodo_pago) "
                   + "VALUES (?, ?, ?, ?)";

        try (PreparedStatement ps = con.prepareStatement(
                sql, PreparedStatement.RETURN_GENERATED_KEYS)) {

            ps.setString(1, numeroFactura);
            ps.setInt(2, idCliente);
            ps.setInt(3, idUsuario);
            ps.setInt(4, idMetodoPago);

            ps.executeUpdate();

            try (ResultSet rs = ps.getGeneratedKeys()) {

                if (rs.next()) {
                    return rs.getInt(1);
                }
            }
        }

        throw new SQLException("No se pudo obtener el ID de la venta.");
    }
    
    public void registrarDetalleVenta(Connection con, int idVenta, int idProducto, int cantidad, BigDecimal precioUnitario) throws SQLException {

        String sql = "INSERT INTO detalle_venta "
                   + "(id_venta, id_producto, cantidad, precio_unitario) "
                   + "VALUES (?, ?, ?, ?)";

        try (PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, idVenta);
            ps.setInt(2, idProducto);
            ps.setInt(3, cantidad);
            ps.setBigDecimal(4, precioUnitario);

            ps.executeUpdate();
        }
    }
    
    
    public void descontarStock(Connection con, int idProducto, int cantidad) throws SQLException {

        String sql = "UPDATE productos "
                   + "SET stock = stock - ? "
                   + "WHERE id_producto = ? AND stock >= ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, cantidad);
            ps.setInt(2, idProducto);
            ps.setInt(3, cantidad);

            int filas = ps.executeUpdate();

            if (filas == 0) {
                throw new SQLException(
                        "Stock insuficiente para el producto ID: " + idProducto
                );
            }
        }
    }
    
    
    public void registrarVentaCompleta(
            String numeroFactura,
            int idCliente,
            int idUsuario,
            int idMetodoPago,
            List<DetalleVenta> detalles) throws SQLException {

        try (Connection con = ConexionDB.conectar()) {

            con.setAutoCommit(false);

            try {
              
                int idVenta = registrarVenta(
                        con,
                        numeroFactura,
                        idCliente,
                        idUsuario,
                        idMetodoPago
                );

              
                for (DetalleVenta detalle : detalles) {

                    registrarDetalleVenta(
                            con,
                            idVenta,
                            detalle.getIdProducto(),
                            detalle.getCantidad(),
                            detalle.getPrecioUnitario()
                    );

                    descontarStock(
                            con,
                            detalle.getIdProducto(),
                            detalle.getCantidad()
                    );
                }

               
                con.commit();

            } catch (SQLException e) {

                con.rollback();
                throw e;
                
            }
        }
    }
    
}
