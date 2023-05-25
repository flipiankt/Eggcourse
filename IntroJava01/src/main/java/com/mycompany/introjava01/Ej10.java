/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package com.mycompany.introjava01;
import java.util.Scanner;
/**
 *Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
 * ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
 * 5 *****
 * 3 ***
 * 11 ***********
 * 2 **
 * @author francyhoyos
 */
public class Ej10 {
    public static void main(String[] args) {
        
        int num;
        String letra = "*";
        
        Scanner leer =new Scanner (System.in);
        
        for (int i=0; i<4;i++){
            
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            System.out.print(num);
            for (int j = 0; j<num; j++) {
                System.out.print(letra);
            }
            System.out.println(" ");
            
        }
        
        
    }
}

