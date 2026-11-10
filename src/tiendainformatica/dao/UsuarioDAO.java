
package tiendainformatica.dao;

import tiendainformatica.db.ConexionDB;
import tiendainformatica.modelo.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.mindrot.jbcrypt.BCrypt;

public class UsuarioDAO {
    
        public Usuario obtenerUsuario(String correo, String contrasena) {
        
        String sql = "SELECT id, nombre, correo, contrasena" + " FROM usuario WHERE correo = ?";
        
        try (Connection conexion = ConexionDB.conectar(); PreparedStatement sentencia = conexion.prepareStatement(sql)) {
            
            sentencia.setString(1, correo);
            
            try (ResultSet resultado = sentencia.executeQuery()) {
            
                if (resultado.next()) {
                    
                    String passwordHash = resultado.getString("password");
                    
                    if(BCrypt.checkpw(contrasena, passwordHash)) {
                        
                        Usuario usuario = new Usuario(
                                resultado.getInt("id"),
                                resultado.getString("nombre"),
                                resultado.getString("correo"),
                                resultado.getString("contrasena")
                        );
                        
                        return usuario;
                        
                    }
                    
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
