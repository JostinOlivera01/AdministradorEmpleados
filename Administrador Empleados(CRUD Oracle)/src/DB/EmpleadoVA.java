/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import Datos.Empleado;
import java.sql.Connection;
import javax.swing.JTable;

/**
 *
 * @author josti
 */
public class EmpleadoVA {
    
     EmpleadoDAO dao = new EmpleadoDAO();
         private String mensaje = "";
         
         
         
        public String agregarEmpleado(Empleado usu){
        Connection conn =  Conexion.getConnection();
        try {
            mensaje = dao.agregarEmpleado(conn, usu);
        } catch (Exception e) {
            mensaje = mensaje + " " + e.getMessage();
        }finally{
            try {
                if(conn != null){
                    conn.close();
                }
            } catch (Exception e) {
                mensaje = mensaje + " " + e.getMessage();
            }
            return mensaje;
        }
        }
        
        public String eliminarEmpleado(String usu){
        Connection conn =  Conexion.getConnection();
        try {
            mensaje = dao.eliminarEmpleado(conn, usu);
        } catch (Exception e) {
            mensaje = mensaje + " " + e.getMessage();
        }finally{
            try {
                if(conn != null){
                    conn.close();
                }
            } catch (Exception e) {
                mensaje = mensaje + " " + e.getMessage();
            }
            return mensaje;
        }
        }
    
          public String modificarEmpleado(Empleado usu){
        Connection conn =  Conexion.getConnection();
        try {
            mensaje = dao.modificarEmpleado(conn, usu);
        } catch (Exception e) {
            mensaje = mensaje + " " + e.getMessage();
        }finally{
            try {
                if(conn != null){
                    conn.close();
                }
            } catch (Exception e) {
                mensaje = mensaje + " " + e.getMessage();
            }
            return mensaje;
        }
        }
          
          public void listarEmpleado(JTable tabla){
              Connection conn =  Conexion.getConnection();
              dao.listarEmpleado(conn, tabla);
              try {
                  conn.close();
              } catch (Exception e) {
              }
              
          }    
    
}
