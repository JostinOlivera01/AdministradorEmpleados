/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import Datos.Empleado;
/**
 *
 * @author josti
 */
public class TestDB {
    Empleado user = new Empleado();
    EmpleadoVA re = new EmpleadoVA();
    String mensaje = "";
    
    
    
    
    
    
    public void insertar(){
        user.setRut("cristian");
        user.setNombre("a");
        user.setApellidop("a");
        user.setApellidom("a");
        user.setTipoem(1);
        user.setTelefono(45);
        user.setContrato("A");
        mensaje = re.agregarEmpleado(user);
        System.out.println(mensaje);
    }
       public void modifiar(){
        user.setRut("cristian");
        user.setNombre("b");
        user.setApellidop("b");
        user.setApellidom("b");
        user.setTipoem(2);
        user.setTelefono(66);
        user.setContrato("B");
        mensaje = re.modificarEmpleado(user);
        System.out.println(mensaje);
    }
    
    
    public static void main(String[] args){
        TestDB test = new TestDB();
//        test.insertar();
        test.modifiar();
    }
    }

