/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package com.mycompany.mascotaapp.Entidades;

import java.util.Date;

/**
 *
 * @author francyhoyos
 */
public class Usuario {
    public String nombre;
    public String apellido;
    public int dni;
    public Date nacimiento;
    public String pais;

    public Usuario() {
    }
    
    public Usuario (String nombre,String apellido, int dni, Date nacimiento, String pais){
        this.nombre=nombre;
        this.apellido=apellido;
        this.dni=dni;
        this.nacimiento=nacimiento;
        this.pais=pais;
    }
    
}
