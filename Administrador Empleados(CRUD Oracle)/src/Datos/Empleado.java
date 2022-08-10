/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author josti
 */
public class Empleado {
    
    private String rut;
    private String nombre;
    private String apellidop;
    private String apellidom;
    private int tipoem;
    private int telefono;
    private String contrato;

    public Empleado() {
    }

    public Empleado(String rut, String nombre, String apellidop, String apellidom, int tipoem, int telefono, String contrato) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellidop = apellidop;
        this.apellidom = apellidom;
        this.tipoem = tipoem;
        this.telefono = telefono;
        this.contrato = contrato;
    }


    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidop() {
        return apellidop;
    }

    public void setApellidop(String apellidop) {
        this.apellidop = apellidop;
    }

    public String getApellidom() {
        return apellidom;
    }

    public void setApellidom(String apellidom) {
        this.apellidom = apellidom;
    }

    public int getTipoem() {
        return tipoem;
    }

    public void setTipoem(int tipoem) {
        this.tipoem = tipoem;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }
    
    
    
    
    
    
    
}
