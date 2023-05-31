/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package com.mycompany.introjava01;
import java.util.Scanner;
/**
 *Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y
 *define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
 * Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus compañeros de equipo
 * @author francyhoyos
 */
public class Ej13 {
    public static void main (String[] args) {
        Scanner leer =new Scanner (System.in);
        
        String [] equipo = new String [5];
        
        for (int j = 0; j < 5; j ++) {
            System.out.print("Ingrese el nombre "+j);
            String val = leer.nextLine();
            equipo[j]=val;
            
        }
        
        
        for (int i = 0; i < 5; i++) {
            System.out.println(equipo[i]);
        }
        
    }
}
