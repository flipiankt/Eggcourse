/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package com.mycompany.introjava01;
import java.util.Scanner;
/**
 *
 * @author francyhoyos
 */
public class Ej11 {
    public static void main(String[] args) {
        Scanner leer =new Scanner (System.in);
        
        int num1= 5;
        int num2 = 7;
        System.out.println("La suma de ambos es "+sumar(num1,num2));
        
        //mejor, así aunque es lo mismo
        int retorno = sumar(num1,num2);
        System.out.println("La suma de ambos es "+sumar(num1,num2));
    }
    public static int sumar(int num1, int num2) {
        int suma;
        suma=num1+num2;
        return suma;
    }
}
