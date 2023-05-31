/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package com.mycompany.introjava01;
import java.util.Scanner;
/**
 *Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
 * que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del
 * segundo, sino informe que no lo son.
 * @author francyhoyos
 */
public class Ej11 {
    public static void main(String[] args) {
        Scanner leer =new Scanner (System.in);
        
        
        System.out.println("Ingrese un numero");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        multi(num1,num2);
    }
    
    public static void multi(int num1,int num2) {
        if (num1 % num2 == 0) {
            System.out.println(num1 + " es múltiplo de " + num2);
        } else {
            System.out.println(num1 + " no es múltiplo de " + num2);
        }
        
        
    }
    
    
    
}