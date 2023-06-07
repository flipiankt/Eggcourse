/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
*/
package com.mycompany.ejercicioextra;
import java.util.Scanner;
import java.util.Random;
/**
 *Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
 * que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
 * 20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
 * será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
 * rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
 * por pantalla la sopa de letras creada.
 * Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
 * de Java substring(), Length() y Math.random().
 * @author francyhoyos
 */
public class Ejercicio23 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        sopaLetras();
    }
    public static void sopaLetras() {
        Random random = new Random();
        Scanner leer =new Scanner (System.in);
        String palabra;
        String [][] sopa= new String [20][20];
        
        for(int i=0; i<5;i++){
            do{
                System.out.println("Ingrese una palabra de entre 3 y 5 letras");
                palabra=leer.nextLine();
            }while(palabra.length()<3  | palabra.length()>5);
            
            int numeroAleatorio = random.nextInt(19);
            
            for(int j=0; j<palabra.length();j++){
                
                sopa[numeroAleatorio][j]=palabra.substring(j, j+1);
                
            }
            
        }
        sopa=rellenarMatrizNum(sopa,20,20);
        printMatriz(sopa,20,20);
        
    }
    
    public static String[] [] rellenarMatrizNum(String [][] matriz, int tamano1, int tamano2) {
        Random random = new Random();
        String [][] matriz2 = new String [tamano1][tamano2];
        matriz2=matriz;
        for(int i=0; i<tamano1;i++){
            for(int j=0; j<tamano2;j++){
                if (matriz[i][j]== null){
                    String numeroAleatorio = String.valueOf(random.nextInt(9));
                    matriz2[i][j]=numeroAleatorio;
                }
            }
            
        }
        return matriz2;
    }
    public static void printMatriz(String [][] matriz, int tamano1, int tamano2) {
        
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
