/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import Datos.Empleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author josti
 */
public class EmpleadoDAO {
     private String mensaje = "";
    
    
    
    public String agregarEmpleado(Connection con, Empleado user){
        PreparedStatement pst = null;
        String sql =  "INSERT INTO EMPLEADO(RUN_DV, NOMBRES, APELLIDO_PAT, APELLIDO_MAT, TIPO_EMPLEADO, TELEFONO, CONTRATO_INDEFINIDO) VALUES(?,?,?,?,?,?,?)"; 
        try {
           pst = con.prepareStatement(sql);
            pst.setString(1, user.getRut());
            pst.setString(2, user.getNombre());
            pst.setString(3, user.getApellidop());
            pst.setString(4, user.getApellidom());
            pst.setInt(5, user.getTipoem());
            pst.setInt(6, user.getTelefono());
            pst.setString(7, user.getContrato());
            mensaje = "GUARDADO";
            pst.execute();
            pst.close();
        } catch (SQLException e) {
            
            mensaje = "ERROR GG" + e.getMessage();
            
        }
        return mensaje;
    }
    
        public String eliminarEmpleado(Connection con, String us){
        PreparedStatement pst = null;
        String sql =  "DELETE FROM Empleado WHERE RUN_DV= ?"; 
        try {
           pst = con.prepareStatement(sql);
            pst.setString(1, us);
            mensaje = "ELIMINADOO";
            pst.execute();
            pst.close();
        } catch (SQLException e) {
            
            mensaje = "ERROR GG" + e.getMessage();
            
        }
        return mensaje;
    }
        
        
        public String modificarEmpleado(Connection con, Empleado user){
        PreparedStatement pst = null;
        String sql =  "UPDATE EMPLEADO SET RUN_DV = ?, NOMBRES = ?, APELLIDO_PAT = ?, APELLIDO_MAT = ?, TIPO_EMPLEADO = ?, TELEFONO = ?, CONTRATO_INDEFINIDO = ? WHERE RUN_DV = ?" ; 
        try {
           pst = con.prepareStatement(sql);
            pst.setString(1, user.getRut());
            pst.setString(2, user.getNombre());
            pst.setString(3, user.getApellidop());
            pst.setString(4, user.getApellidom());
            pst.setInt(5, user.getTipoem());
            pst.setInt(6, user.getTelefono());
            pst.setString(7, user.getContrato());
             pst.setString(8, user.getRut());
            mensaje = "MODIFICADO";
            pst.execute();
            pst.close();
        } catch (SQLException e) {
            
            mensaje = "ERROR GG" + e.getMessage();
            
        }
        return mensaje;
    }
        
        
        
        public void listarEmpleado(Connection con, JTable tabla){
            DefaultTableModel model;
            String [] columnas = {"RUN_DV", "NOMBRES", "APELLIDO_PAT", "APELLIDO_MAT", "TIPO_EMPLEADO", "TELEFONO", "CONTRATO_INDEFINIDO"};
            model = new DefaultTableModel(null, columnas);
            
            String sql = "Select * From EMPLEADO order by RUN_DV";
            //CREAR PARA GUARDAR DATOS
            String [] filas = new String[7];
            Statement st = null;
            ResultSet rs = null;
            try {
                //CONEXION 
                st = con.createStatement();
                //RESULTADO DE LA CONSULTA
                rs = st.executeQuery(sql);
                
                while (rs.next()){
                    for (int i = 0; i < 7; i++){
                        //RECORRE LA AARAY FILA Y GUARDA LOS DATOS DE LA CONSULTA
                    filas[i] = rs.getString(i+1);
                }
                    //GUARDA DATOS EN LAS FILAS 
                  model.addRow(filas);
                    
                }
                //POBLAMOS LA TABLA
                tabla.setModel(model);
            } catch (Exception e) {
                
                JOptionPane.showMessageDialog(null, "No se puede ver");
                
            }
            
        
        }
}
