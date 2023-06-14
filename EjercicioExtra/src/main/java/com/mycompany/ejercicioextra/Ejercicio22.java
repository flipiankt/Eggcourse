/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
*/
package com.mycompany.ejercicioextra;
import java.util.Scanner;
import java.util.Random;
/**
 *Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
 * muestre la suma de sus elementos.
 * @author francyhoyos
 */
public class Ejercicio22 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer =new Scanner (System.in);
        System.out.println("Ingrese el tamaño i de la matriz");
        int tamano1 = leer.nextInt();
        System.out.println("Ingrese el tamaño j de la matriz");
        int tamano2 = leer.nextInt();
        int [][]matriz = new int [tamano1][tamano2];
        matriz=rellenarMatriz(matriz,tamano1,tamano2);
        printMatriz(matriz,tamano1,tamano2);
    }
    
    public static int[] [] rellenarMatriz(int [][] matriz, int tamano1, int tamano2) {
        Random random = new Random();
        
        for(int i=0; i<tamano1;i++){
            for(int j=0; j<tamano2;j++){
                int numeroAleatorio = random.nextInt(10);
                matriz[i][j]=numeroAleatorio;
            }
        }
        return matriz;
    }
    public static void printMatriz(int [][] matriz, int tamano1, int tamano2) {
        
        System.out.println("Matriz: ");
        for (int i = 0; i < tamano1; i++) {
            for (int j = 0; j < tamano2; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println();
        
    }
}

