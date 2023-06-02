/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
*/
package com.mycompany.ejerciciosaprendizaje;
//import java.util.Scanner;

/**
 *Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
 * muestre por pantalla en orden descendente.
 * @author francyhoyos
 */
public class Ejerci15 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner leer =new Scanner (System.in);
        int val=0;
        int [] vector = new int [5];
        
        for (int j = 0; j < 5; j ++) {
            vector[j]=val;
            val=val+1;
            
        }
        for (int i = 4; i > 0; i --) {
            System.out.println(vector[i]);
        }
        
    }
    
}
