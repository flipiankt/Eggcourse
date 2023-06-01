/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
*/
package com.mycompany.ejerciciosaprendizaje;
import java.util.Scanner;
/**
 *Realizar un programa que pida dos números enteros positivos por teclado y muestre por
 * pantalla el siguiente menú:
 *
 * El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
 * pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
 * opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del
 * programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está
 * seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale
 * del programa, caso contrario se vuelve a mostrar el menú.
 * @author francyhoyos
 */
public class Ejerci11 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer =new Scanner (System.in);
        System.out.println("Ingrese un numero entero");
        int num1=leer.nextInt();
        System.out.println("Ingrese un numero entero");
        int num2=leer.nextInt();
        int salida;
        do{
            System.out.println("""
                                                   MENU
                                           1. Sumar
                                           2. Restar
                                           3. Multiplicar
                                           4. Dividir
                                           5. Salir
                                           Elija opci\u00f3n:""");
            int num3=leer.nextInt();
            salida =multi(num3, num1, num2);
            
        }while(salida!=-1 );
        
        
    }
    public static int multi(int num3, int num1, int num2) {
        Scanner leer =new Scanner (System.in);
        int salid=0;
        
        switch (num3){
            case 1:
                salid=num1+num2;
                System.out.println("La suma es "+salid);
                
                break;
            case 2:
                salid=num1-num2;
                System.out.println("La resta es "+salid);
                
                break;
            case 3:
                salid=num1*num2;
                System.out.println("La multiplicaicon es "+salid);
                
                break;
            case 4:
                salid=num1/num2;
                System.out.println("La division es "+salid);
                
                break;
            case 5:
                System.out.println("desea salir S o N? "+salid);
                String sal = leer.next();
                if (sal.equals("S")){
                    salid=-1;
                    break;
                };
                
        }
        return salid;
    }
    
    
    
}

