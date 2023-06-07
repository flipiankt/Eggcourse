/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
*/
package com.mycompany.ejercicioextra;
import java.util.Scanner;
/**
 *Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
 * usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 * @author francyhoyos
 */
public class Ejercicio1 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer =new Scanner (System.in);
        System.out.println("Ingrese el tiempo en minutos");
        int minutos = leer.nextInt();
        int dia=minutos/(60*24);
        double horas=(1600/60-dia*24);
        System.out.println(""+dia+" "+horas);
        
    }
    
}
