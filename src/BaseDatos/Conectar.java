package BaseDatos;



import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author werner
 */

public  class Conectar {
 
    
    public static  Connection conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://127.0.0.1/Estadistica","root","01234");
           // JOptionPane.showMessageDialog(null, "Conexion realizada correctamente");
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
            return null;          
    }
}//Finaliza la clase
