/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
*/
package com.mycompany.ejerciciosaprendizaje;
import java.util.Scanner;

/**
 *Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
 * suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
 * permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
 * El programa deberá comprobar que los números introducidos son correctos, es decir,
 * están entre el 1 y el 9.
 * @author francyhoyos
 */
public class Ejerci20 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer =new Scanner (System.in);
        int [][] matriz = new int [3][3];
        matriz=rellenarMatrizManual(matriz,3,3);
        printMatriz(matriz,3,3);
        matrizMagica(matriz,3,3);
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
                }while(numero<1 || numero>9);
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
    
    public static void matrizMagica(int [][] matriz, int tamano1, int tamano2) {
        int referencia=0, sumFilas=0, sumColum=0, sumDiag=0, sumInver=0;
        boolean magica=true;
        
        for(int i=0; i<tamano1;i++){
            
            for(int j=0; j<tamano2;j++){
                if(i==0){
                    referencia=referencia+matriz[i][j];
                }
                if(i==j){
                    sumDiag=sumDiag+matriz[i][j];
                    sumInver=sumInver+matriz[i][2-j];
                }
                
                sumFilas=sumFilas+matriz[i][j];
                sumColum=sumColum+matriz[j][i];
            }
            
            
            if(sumFilas==referencia && sumColum == referencia){
                magica=magica && true;
            }
            sumFilas=0;
            sumColum=0;
        }
        System.out.println("la suma de la inversa "+sumInver+" "+referencia);
        if (sumDiag==referencia && sumInver==referencia){
            magica=magica && true;
        }
        System.out.println("La matriz es magica "+magica);
    }
}

