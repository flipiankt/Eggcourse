/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.introjava01;
import java.util.Scanner;
/**
 *Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar
el resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
Nota: recordar el uso de la sentencia break.
 * @author francyhoyos
 */
public class Ej09 {
    public static void main(String[] args) {
        
        Scanner leer =new Scanner (System.in);
        
        int num, sum, cont;
        cont=0;
        sum=0;
        
        do{
            System.out.println("ingrese un número");
            num= leer.nextInt();
            cont=cont+1;
            if (num==0){
                System.out.println("Se capturó el numero cero");
                break;
            }else if (num>0){
                sum=sum+num;
                          }
        
                    
        }while(cont<20);
        
         System.out.println(sum);   
    }
}
    

