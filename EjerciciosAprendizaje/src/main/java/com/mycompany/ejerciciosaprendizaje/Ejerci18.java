/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
*/
package com.mycompany.ejerciciosaprendizaje;
import java.util.Scanner;
import java.util.Random;
/**
 *Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
 * traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se
 * obtiene cambiando sus filas por columnas (o viceversa).
 * @author francyhoyos
 */
public class Ejerci18 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer =new Scanner (System.in);
        int [][] matriz = new int [4][4];
        int [][] matrizTras = new int [4][4];
        matriz=rellenarMatriz(matriz,4,4);
        printMatriz(matriz,4,4);
        matrizTras=trasponer(matriz,4,4);
        printMatriz(matrizTras,4,4);
        
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
    
    public static int[] [] trasponer(int [][] matriz, int tamano1, int tamano2) {
        int [][] matriz2 = new int [tamano1][tamano2];
        int [][] matriz3 = new int [tamano1][tamano2];
        matriz2=matriz;
        
        for(int i=0; i<tamano1;i++){
            for(int j=0; j<tamano2;j++){
                matriz3[i][j]=matriz2[j][i];
            }
        }
        return matriz3;
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
