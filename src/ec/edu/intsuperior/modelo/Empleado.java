/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.intsuperior.modelo;

import java.util.Date;

/**
 *
 * @author xavi
 */
public class Empleado extends Persona {
    
    private Double sueldoBruto;


 public Empleado() {
    }
public Empleado(Double sueldoBruto, String cedula, String nombre1, String nombre2, String apellido1, String apellido2, Date fechaNacimiento, String direccion, String telefono, String email) {
        super(cedula, nombre1, nombre2, apellido1, apellido2, fechaNacimiento, direccion, telefono, email);
        this.sueldoBruto = sueldoBruto;
 
}
public Double getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(Double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }




}
