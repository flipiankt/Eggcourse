/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package com.mycompany.introjava01;

import java.util.Scanner;
/**
 *Define una variable de tipo boolean, double y char. Guarda información en ellas a través del Scanner.
 * @author francyhoyos
 */
public class Ej05 {
    public static void main(String[] args) {
        
        Scanner leer =new Scanner (System.in);
        
        System.out.println("Eres mujer, True or False");
        boolean edad = leer.nextBoolean();
        
        System.out.println("Ingresa tu salario");
        double salario = leer.nextDouble();
        
        System.out.println("Ingresa tu letra incial");
        char letr = leer.next().charAt(0);
        
    }
}
