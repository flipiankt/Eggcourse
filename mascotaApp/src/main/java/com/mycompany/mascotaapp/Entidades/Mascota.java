/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package com.mycompany.mascotaapp.Entidades;

/**
 *
 * @author francyhoyos
 */
public class Mascota {
    private String nombre;
    private String apodo;
    //conejo, gato,perro, loro
    private String tipo;
    private String color;
    private int edad;
    private boolean cola;
    private String raza;
    private int energia;
    
    
    public Mascota(){
        this.energia=1000;
    }
    
    public Mascota(String nombre, String apodo, String tipo) {
        this.nombre = nombre;
        this.apodo = apodo;
        
        if(tipo.equals("perro" )||tipo.equals("gato" )||tipo.equals("conejo" )||tipo.equals("loro" ) ){
            this.tipo = tipo;
        }
        this.energia=1000;
    }
    
    public Mascota(String nombre, String apodo, String tipo, String color, int edad, boolean cola, String raza) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.color = color;
        this.edad = edad;
        this.cola = cola;
        this.raza = raza;
        this.energia=1000;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApodo(String apodo){
        this.apodo = apodo;
    }
    
    public void setCola(boolean cola) {
        this.cola = cola;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApodo() {
        return apodo;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public String getColor() {
        return color;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public boolean isCola() {
        return cola;
    }
    
    public String getRaza() {
        return raza;
    }
    
    /**
     * Funcion metodo pasear
     * @param energiaRestar
     * @return energia
     */
    public int pasear(int energiaRestar){
        energia-= energiaRestar;
        return energia;
    }
    /**
     * Funcion destinada a pasear
     * @param energiaRestar
     * @param vueltas
     * @return energia
     */
        public int pasear(int energiaRestar, int vueltas){
            for (int  i = 0;  i < vueltas;  i++) {
                 energia-= energiaRestar;
            }
       
        return energia;
    }
    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", color=" + color + ", edad=" + edad + ", cola=" + cola + ", raza=" + raza + ", energia=" + energia + '}';
    }
    
    
}

