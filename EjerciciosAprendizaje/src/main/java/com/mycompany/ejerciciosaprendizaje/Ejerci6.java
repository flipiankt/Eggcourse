/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
*/
package com.mycompany.ejerciciosaprendizaje;
import java.util.Scanner;
/**
 *Crear un programa que dado un numero determine si es par o impar.
 * @author francyhoyos
 */
public class Ejerci6 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer =new Scanner (System.in);
        System.out.println("Ingrese un numero entero");
        int num1=leer.nextInt();
        if(num1%2==0){
            System.out.println("es par");
        }else{
            System.out.println("es impar");
        }
    }
    
}
