/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package Entidades;

import java.util.Scanner;

/**
 *Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. A continuación, se deben crear los siguientes métodos:
 * a) Método constructor que inicialice el radio pasado como parámetro.
 * b) Métodos get y set para el atributo radio de la clase Circunferencia.
 * c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del objeto.
 * d) Método area(): para calcular el área de la circunferencia (𝐀𝐫𝐞𝐚 = 𝛑 ∗ 𝐫𝐚𝐝𝐢𝐨𝟐).
 * e) Método perimetro(): para calcular el perímetro (𝐏𝐞𝐫𝐢𝐦𝐞𝐭𝐫𝐨 = 𝟐 ∗ 𝛑 ∗ 𝐫𝐚𝐝𝐢𝐨).
 * @author francyhoyos
 */
public class Circunferencia {
    
    private double radio;
    
    public Circunferencia(double radio) {
        this.radio = radio;
    }
    
    public double getRadio() {
        return radio;
    }
    
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
    public void area(){
        double pi = Math.PI;
        System.out.println("el area es "+pi*radio*radio);
        
    }
    
    public void perimetro(){
        double pi = Math.PI;
        System.out.println("el perimetro es "+2*pi*radio);
    }
    
    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + '}';
    }
    
}
