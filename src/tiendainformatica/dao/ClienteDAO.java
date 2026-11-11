
package tiendainformatica.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import tiendainformatica.db.ConexionDB;
import tiendainformatica.modelo.Cliente;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

public class ClienteDAO {
    
    public boolean guardarCliente(Cliente cliente) {
        
        String sql = "INSERT INTO clientes " 
                + "(nombre, apellido, documento, telefono, correo, direccion)"
                + "VALUES (?, ?, ?, ?, ?, ?)";
        
        try (Connection con = ConexionDB.conectar(); PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getApellido());
            ps.setString(3, cliente.getDocumento());
            ps.setString(4, cliente.getTelefono());
            ps.setString(5, cliente.getCorreo());
            ps.setString(6, cliente.getDireccion());
            
            return ps.executeUpdate() > 0;
            
        } catch(SQLException e) {
            
            System.out.println("Error al guardar cliente: " + e.getMessage());
            
            return false;
            
        }
            
    }
    
    
    public List<Cliente> listarClientes() {

        List<Cliente> lista = new ArrayList<>();

        String sql = "SELECT * FROM clientes ORDER BY id_cliente";

        try (Connection con = ConexionDB.conectar();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {

                Cliente cliente = new Cliente(
                        rs.getInt("id_cliente"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getString("documento"),
                        rs.getString("telefono"),
                        rs.getString("correo"),
                        rs.getString("direccion")
                );

                lista.add(cliente);
            }

        } catch (SQLException e) {
            System.out.println("Error al listar clientes: " + e.getMessage());
        }

        return lista;
    }

    
}
