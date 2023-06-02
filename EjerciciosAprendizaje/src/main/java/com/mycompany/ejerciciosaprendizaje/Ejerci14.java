/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
*/
package com.mycompany.ejerciciosaprendizaje;
import java.util.Scanner;
/**
 *Crea una aplicación que a través de una función nos convierta una cantidad de euros
 * introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
 * función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
 * una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
 * (void).
 * El cambio de divisas es:
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 €
 * @author francyhoyos
 */
public class Ejerci14 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer =new Scanner (System.in);
        
        System.out.println("Ingrese la cantidad en euros");
        double cantidad = leer.nextDouble();
        System.out.println("""
                                   Ingresa la moneda a la que quieres convertir, puede ser dolares, yenes, libras El cambio de divisas es:
                                   * 0.86 libras es un 1 \u20ac
                                   * 1.28611 $ es un 1 \u20ac
                                   * 129.852 yenes es un 1 \u20ac""");
        String convertir = leer.next();
        conversor(cantidad,convertir);
        
    }
    
    public static void conversor(double cantidad, String convertir) {
        double retorno,valor;
        String moneda = convertir.toLowerCase();
        
        switch (moneda){
            case "dolares":
                valor = cantidad * 1.2811 ;
                System.out.println("El valor de "+cantidad+" euros en dolares"+valor);
                break;
            case "yenes":
                valor = cantidad * 129.852 ;
                System.out.println("El valor de "+cantidad+" euros en yenes "+valor);
                break;
            case "libras":
                valor = cantidad * 0.86 ;
                System.out.println("El valor de "+cantidad+" euros en libras "+valor);
                break;
        }
        
        
        
        
    }
    
}
