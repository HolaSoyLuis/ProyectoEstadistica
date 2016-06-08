/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Principal;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author werner
 */

public class Conexion {
    Connection conn = null;
    static final String CONTROLADOR = "com.mysql.jdbc.Driver";
     static final String URL_BASEDATOS = "jdbc:mysql://localhost /estadistica";
    public static Connection ConnectDB(){
       try{
           Class.forName( CONTROLADOR );

 // establece la conexión a la base de datos 
           Connection conn = DriverManager.getConnection( URL_BASEDATOS, "root", "01234" );
           JOptionPane.showMessageDialog(null, "Conexion establecida");
           return conn;
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
       return null;
    }
    
}
