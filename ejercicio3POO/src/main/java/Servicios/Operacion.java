/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package Servicios;

import java.util.Scanner;

/**
 * * Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2. A continuación, se deben crear los siguientes métodos:
 *a) Método constructor con todos los atributos pasados por parámetro.
 * b) Metodo constructor sin los atributos pasados por parámetro.
 * c) Métodos get y set.
 * d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
 * e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
 * f) Método restar(): calcular la resta de los números y devolver el resultado al main
 * g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si no, se hace la multiplicación y se devuelve el resultado al main
 * h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar una división por cero, el método devuelve 0 y se le informa al usuario el error se le informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
 * @author francyhoyos
 */
public class Operacion {
    private int numero1;
    private int numero2;

    public Operacion() {
    }
    
    
    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    public int getNumero1() {
        return numero1;
    }
    
    public int getNumero2() {
        return numero2;
    }
    
    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }
    
    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    public void crearOperacion(){
        Scanner leer =new Scanner (System.in);
        System.out.println("Ingrese el número 1");
        this.numero1 = leer.nextInt();
        System.out.println("Ingrese el número 2");
        this.numero2 = leer.nextInt();
        
    }
    
    public void suma(){
        System.out.println("La suma de los numeros es "+(numero1+numero2));
    }
    
    public void resta(){
        System.out.println("La resta de los numeros es "+(numero1-numero2));
    }
    
    public void multiplicacion(){
        if (numero1!=0 & numero2!=0){
            System.out.println("La multiplicacion es "+(numero1*numero2));
        }else{
            System.out.println("0 , es un error");
        }
    }
    
    public void division(){
        if (numero1!=0 & numero2!=0){
            System.out.println("La division es "+(numero1/numero2));
        }else{
            System.out.println("0 , es un error");
        }
    }

    @Override
    public String toString() {
        return "Operacion{" + "numero1=" + numero1 + ", numero2=" + numero2 + '}';
    }
    
}

