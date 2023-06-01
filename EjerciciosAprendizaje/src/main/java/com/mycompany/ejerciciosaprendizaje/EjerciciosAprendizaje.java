/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
*/

package com.mycompany.ejerciciosaprendizaje;
import java.util.Scanner;
/**
 *Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
 * dos. El programa deberá después mostrar el resultado de la suma
 * @author francyhoyos
 */
public class EjerciciosAprendizaje {
    
    public static void main(String[] args) {
        Scanner leer =new Scanner (System.in);
        System.out.println("Ingrese un valor entero");
        int num1 = leer.nextInt();
        
        System.out.println("Ingrese un valor entero");
        
        int num2 = leer.nextInt();
        
        System.out.println("la suma es "+(num1+num2));
    }
}
