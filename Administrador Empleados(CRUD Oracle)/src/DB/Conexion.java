/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author josti
 */
public class Conexion {
    private static Connection conn = null;
    private static String login = "prueba3";
    private static String clave = "prueba3";
    private static String url = "jdbc:oracle:thin:@localhost:1521/XE"; 
    
    
    public static Connection getConnection(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection(url,login,clave);
            conn.setAutoCommit(false);
            if (conn != null) {
                System.out.println("Conexion Exitosa");
            }else{
                System.out.println("GGGG");
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Conexion erronea " + e.getMessage());
        }
        return conn;
    }
    
    
    public void desconexion(){
        try {
            conn.close();
              System.out.println("Desconectado");
        } catch (Exception e) {
            System.out.println("ERROR AL DESONECTAR" + e.getMessage());
        }
    }
    
    
    public static void main(String[] args){
       Conexion c = new Conexion();
        c.getConnection();
    }
    
}
