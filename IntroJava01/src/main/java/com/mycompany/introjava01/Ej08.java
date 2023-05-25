/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.introjava01;
import java.util.Scanner;
/**
 *Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se
pedirá de nuevo hasta que la nota sea correcta.
 * @author francyhoyos
 */
public class Ej08 {
 public static void main(String[] args) {
        
        Scanner leer =new Scanner (System.in);
        
        int nota;
        
        System.out.println("Ingrese una nota");
        nota = leer.nextInt();
        
        while (nota<0 || nota>10){
            System.out.println("ingrese una nota entre 0 y 10");
            nota = leer.nextInt();
        }
       
        
    }
}
