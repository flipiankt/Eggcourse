/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.introjava01;

import java.util.Scanner;

/**
 *Implementar un programa que le pida dos números enteros a usuario y determine si ambos o alguno de ellos es mayor a 25.
 * @author francyhoyos
 */
public class Ej06 {
    public static void main(String[] args) {
        
        Scanner leer =new Scanner (System.in);
        
        System.out.println("Ingrese un valor entero");
        int num1 = leer.nextInt();
        
        System.out.println("Ingrese un valor entero");
        
        int num2 = leer.nextInt();
        
        if (num1>25 && num2>25){
            System.out.println("Los números son mayores a 25");
        }else if (num1>25){
            System.out.println("numero 1 es mayor a 25");
        } else {
            System.out.println("ninguno es mayor a 25");
        }
        
    }
}
