/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejerciciosaprendizaje;

import java.util.Random;
/**
 *Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que
una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada
de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
* 
 * @author francyhoyos
 */
public class Ejerci19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
       double [][] matriz = new double [4][4];
       double [][] matrizTras = new double [4][4];
        matriz=rellenarMatriz(matriz,4,4);
        printMatriz(matriz,4,4);
        matrizTras=trasponer(matriz,4,4);
        printMatriz(matrizTras,4,4);
        antiSim(matriz ,matrizTras, 4,4 );
        
    }
    
    public static double[] [] rellenarMatriz(double [][] matriz, int tamano1, int tamano2) {
        Random random = new Random();
        
        for(int i=0; i<tamano1;i++){
            for(int j=0; j<tamano2;j++){
                int numeroAleatorio = random.nextInt(10);
                matriz[i][j]=numeroAleatorio;
            }
        }
        return matriz;
    }
    
    public static double[] [] trasponer(double [][] matriz, int tamano1, int tamano2) {
        double [][] matriz2 = new double [tamano1][tamano2];
        double [][] matriz3 = new double [tamano1][tamano2];
        matriz2=matriz;
        
        for(int i=0; i<tamano1;i++){
            for(int j=0; j<tamano2;j++){
                matriz3[i][j]=matriz2[j][i];
            }
        }
        return matriz3;
    }
    
        public static void antiSim(double [][] matriz,double [] [] matriz2, int tamano1, int tamano2) {
        boolean comprobacion=true;
        for(int i=0; i<tamano1;i++){
            for(int j=0; j<tamano2;j++){ 
                if(matriz[i][j]==-(matriz2[j][i])){
                    comprobacion=comprobacion && true;
                }else{
                    comprobacion=comprobacion && false;
                }
            }
        }
            System.out.println("La matriz es anti simetrica "+comprobacion);
 
    }
    
    
    public static void printMatriz(double [][] matriz, int tamano1, int tamano2) {
        
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


