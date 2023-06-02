/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
*/
package com.mycompany.ejerciciosaprendizaje;
import java.util.Scanner;
import java.util.Random;
/**
 *Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida
 * al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
 * numero y si se encuentra repetido
 * @author francyhoyos
 */
public class Ejerci16 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer =new Scanner (System.in);
        Random random = new Random();
        
        System.out.println("Ingrese el tamaño del vector");
        int tamano = leer.nextInt();
        
        int [] vector = new int [tamano];
        
        System.out.println("Ingrese un numero para buscar");
        int numero = leer.nextInt();
        
        int posicion=0;
        boolean repetido=false;
        
        for (int i=0;i<tamano;i++){
            int numeroAleatorio = random.nextInt(10);
            vector[i]=numeroAleatorio;
            
            if(vector[i]==numero){
                posicion=i;
                repetido=repetido || true;
                
            }
        }
        System.out.println("el valor esta repetido en la posicion "+posicion+" y se encuentra repetido "+repetido);
        print(vector);
    }
    
    public static void print(int [] vector) {
        
        System.out.print("Vector: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
        
    }
}
