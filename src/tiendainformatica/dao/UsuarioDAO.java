
package tiendainformatica.dao;

import tiendainformatica.db.ConexionDB;
import tiendainformatica.modelo.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {
    
        public Usuario obtenerUsuario(String correo, String contrasena) {
        
        String sql = "SELECT id_usuario, nombre, correo, contrasena" + " FROM usuarios WHERE correo = ? AND contrasena = ?";
        
        try (Connection conexion = ConexionDB.conectar(); PreparedStatement sentencia = conexion.prepareStatement(sql)) {
            
            sentencia.setString(1, correo);
            sentencia.setString(2, contrasena);
            
            try (ResultSet resultado = sentencia.executeQuery()) {
            
                if (resultado.next()) {
                    
                    Usuario usuario = new Usuario(
                            resultado.getInt("id_usuario"),
                            resultado.getString("nombre"),
                            resultado.getString("correo"),
                            resultado.getString("contrasena")
                    );
                    
                    return usuario;
                    
                }
                
            } catch (SQLException e) {
                System.out.println("Error al obtener usuario");
                e.printStackTrace();
            }
            
            return null;
            
        } catch (SQLException e) {
            
            System.out.println("Error al conectarse a la base de datos");
            e.printStackTrace();
            
        }
        
        return null;
        
    }
    
    
}
