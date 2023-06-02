/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
*/
package com.mycompany.ejerciciosaprendizaje;
import java.util.Scanner;
import java.util.Random;
/**
 *Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
 * de 2 dígitos, etcétera (hasta 5 dígitos).
 * @author francyhoyos
 */
public class Ejerci17 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer =new Scanner (System.in);
        
        System.out.println("Ingrese el tamaño del vector");
        int tamano = leer.nextInt();
        
        int []vector=new int [tamano];
        
        int cont1=0, cont2=0, cont3=0, cont4=0, cont5=0;
        
        vector=rellenarVector(vector, tamano);
        
        for(int i=0; i<tamano;i++){
            int valor = vector[i];
            String numeroString = String.valueOf(valor);
            switch(numeroString.length()){
                case 1 -> cont1=cont1+1;
                case 2 -> cont2=cont2+1;
                case 3 -> cont3=cont3+1;
                case 4 -> cont4=cont4+1;
                case 5 -> cont5=cont5+1;
            }
        }
        System.out.println("La cantidad de numeros con 1 digito son "+cont1);
        System.out.println("La cantidad de numeros con 2 digito son "+cont2);
        System.out.println("La cantidad de numeros con 3 digito son "+cont3);
        System.out.println("La cantidad de numeros con 4 digito son "+cont4);
        System.out.println("La cantidad de numeros con 5 digito son "+cont5);
        
        printVector(vector);
        
    }
    public static void printVector(int [] vector) {
        
        System.out.print("Vector: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
        
    }
    
    public static int[] rellenarVector(int [] vector, int tamano) {
        Random random = new Random();
        for(int i=0; i<tamano;i++){
            int numeroAleatorio = random.nextInt(19890);
            vector[i]=numeroAleatorio;
        }
        return vector;
    }
}
