/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
*/
package com.mycompany.ejerciciosaprendizaje;
import java.util.Scanner;
/**
 *Escribir un programa que lea un número entero por teclado y muestre por pantalla el
 * doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
 * Math.sqrt().
 * @author francyhoyos
 */
public class Ejerci5 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer =new Scanner (System.in);
        System.out.println("Ingrese un numero entero");
        double num1=leer.nextInt();
        double doble = Math.pow(num1, 2);
        double triple = Math.pow(num1,3);
        double raiz= Math.sqrt(num1);
        System.out.println("el doble de "+num1+" es "+doble);
        System.out.println("el triple de "+num1+" es "+triple);
        System.out.println("la raiz  de "+num1+" es "+raiz);
    }
    
}
