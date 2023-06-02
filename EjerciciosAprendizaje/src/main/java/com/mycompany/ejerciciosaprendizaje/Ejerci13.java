/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
*/
package com.mycompany.ejerciciosaprendizaje;
import java.util.Scanner;
/**
 *Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
 * cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
 * * * * *
 * *
 *
 * 46
 *
 * *
 * * * *
 * @author francyhoyos
 */
public class Ejerci13 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer =new Scanner (System.in);
        
        System.out.println("Ingrese el tamaño del cuadrado");
        int tamano = leer.nextInt();
        
        for (int i=0;i<tamano;i++){
            for (int j=0;j<(tamano);j++){
                if(i==0 || j==0 || i==(tamano-1) || j==(tamano-1)){
                    System.out.print("*");
                    
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println("");
        }
    }
}

