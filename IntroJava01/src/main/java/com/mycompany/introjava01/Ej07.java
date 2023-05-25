/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.introjava01;
import java.util.Scanner;
/**
 *Considera que estás desarrollando una web para una empresa que fabrica motores (suponemos
que se trata del tipo de motor de una bomba para mover fluidos). Definir una variable tipoMotor
y permitir que el usuario ingrese un valor entre 1 y 4. El programa debe mostrar lo siguiente:
 * @author francyhoyos
 */
public class Ej07 {
    public static void main(String[] args) {
        
        Scanner leer =new Scanner (System.in);
        
        int tipoMotor;
        
        System.out.println("Ingrese una opcion de motor del 1 al 4");
        tipoMotor = leer.nextInt();
        
        switch (tipoMotor){
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigón");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("No existe un valor valido para el tipo de bomba");
                break;
        }
        
        
    }
}
