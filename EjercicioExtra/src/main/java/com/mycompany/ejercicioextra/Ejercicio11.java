/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
*/
package com.mycompany.ejercicioextra;
import java.util.Scanner;
/**
 *Escribir un programa que lea un número entero y devuelva el número de dígitos que
 * componen ese número. Por ejemplo, si introducimos el número 12345, el programa
 * deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el
 * operador de división. Nota: recordar que las variables de tipo entero truncan los
 * números o resultados.
 * @author francyhoyos
 */
public class Ejercicio11 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer =new Scanner (System.in);
        System.out.println("Ingrese un numero entero");
        int numero = leer.nextInt();
        String numeroStr= String.valueOf(numero);
        System.out.println("La cantidad de digitos es "+numeroStr.length());
    }
    
}
