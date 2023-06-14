/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicioextra;
import java.util.Scanner;
/**
 *
 * @author francyhoyos
 */
public class Ejercicio24Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer =new Scanner (System.in);
        
        System.out.println("Ingrese un numero");
        int numero = leer.nextInt();
        System.out.println(fibonacci(numero));
    }
       public static int fibonacci(int numero) {
         int fibo=0;

        switch (numero) {
            case 1:
                fibo=1;
                break;
            case 0:
                fibo=0;
                break;
            default:
                fibo=fibonacci(numero-1)+fibonacci(numero-2);
                break;
        }

            return fibo; 
        }
       
    } 

