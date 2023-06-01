/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
*/
package com.mycompany.ejerciciosaprendizaje;
import java.util.Scanner;
/**
 *Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
 * solicite números al usuario hasta que la suma de los números introducidos supere el
 * límite inicial.
 * @author francyhoyos
 */
public class Ejerci10 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer =new Scanner (System.in);
        System.out.println("Ingrese un valor limite positivo");
        int val=leer.nextInt();
        int num;
        do{
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
        }while(num<=val);
    }
    
}
