package BaseDatos;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author werner
 */
public class Parametros extends Conectar {

   public Connection conn = null;
   public ResultSet rs = null;
   public PreparedStatement pst=null;
  
    
    public Parametros() {
        conn=Parametros.conexion();
    }
    
    public void prepararConexion(String sql) throws SQLException{
        pst = conn.prepareStatement(sql);
        
    }//Finaliza metodo que prepara la conexion
    
    public void ejecutar() throws SQLException{
        rs = pst.executeQuery();
    }
    
    
    
}
