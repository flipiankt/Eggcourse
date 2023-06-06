/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
*/
package com.mycompany.ejerciciosaprendizaje;

import java.util.Random;
import java.util.Scanner;

/**
 *Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
 * 3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
 * dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3
 * que se pueden formar en la matriz M, desplazándose por filas o columnas, existe al
 * menos una que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la
 * columna de la matriz M en la cual empieza el primer elemento de la submatriz P.
 * Ejemplo:
 * @author francyhoyos
 */
public class Ejerci21 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] matriz = new int [4][4];
        int [][] matriz1 = new int[3][3];
        matriz=rellenarMatriz(matriz,4,4);
        printMatriz(matriz,4,4);
        matriz1=rellenarMatriz(matriz1,3,3);
        printMatriz(matriz1,3,3);
        dentroMatriz(matriz,matriz1,4,3);
    }
    public static int[] [] rellenarMatriz(int [][] matriz, int tamano1, int tamano2) {
        Random random = new Random();
        
        for(int i=0; i<tamano1;i++){
            for(int j=0; j<tamano2;j++){
                int numeroAleatorio = random.nextInt(5);
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
    public static void dentroMatriz(int [][] matriz,int[][] matriz1, int tamano1, int tamano2) {
        boolean coincide = true;
        int pos1=0, pos2=0;
        
        for (int i = 0; i < tamano1-tamano2; i++) {
            
            for (int j = 0; j < tamano1-tamano2; j++) {
                if (matriz[i][j]==matriz1[0][0]){
                    pos1=i;
                    pos2=j;
                    int cont1=0,cont2=0;
                    for(int k=i;k<pos1+tamano2;k++){
                        for(int l=j;l<pos2+tamano2;l++){
                            coincide=coincide & ((matriz[k][l]==matriz1[cont1][cont2]));
                            System.out.println("evalua "+matriz[k][l]+ " y "+matriz1[cont1][cont2]);
                        }
                    }
                }
            }
        }
        if(coincide==true ){
            System.out.println("la matriz esta dentro de la otra en la posicion"+pos1+" "+pos2);
        }
        
        
    }
    public static int[] [] rellenarMatrizManual(int [][] matriz, int tamano1, int tamano2) {
        Scanner leer =new Scanner (System.in);
        int numero;
        
        for(int i=0; i<tamano1;i++){
            
            for(int j=0; j<tamano2;j++){
                do{
                    System.out.println("Ingrese un valor entre 1 y 9 para la posición ("+i+" ),("+j+" )");
                    numero=leer.nextInt();
                    matriz[i][j]=numero;
                }while(numero<0 || numero>11);
            }
            
        }
        return matriz;
    }
    
}
