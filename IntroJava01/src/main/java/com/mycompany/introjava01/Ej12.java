/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.introjava01;
import java.util.Scanner;
/**
 *
 * @author francyhoyos
 */
public class Ej12 {
    public static void main(String[] args) {
        Scanner leer =new Scanner (System.in);
        
        
        System.out.println("Ingrese una frase terminada en punto");
        String frase = leer.next();
        
        for (int i = 0; i<frase.length(); i++) {
            char caracter = frase.charAt(i);
            String cadena = String.valueOf(caracter);
            String retorn = jer(cadena);
            
            System.out.println(retorn);
        }
        
    }
    
    public static String jer(String caracter) {
        String salid = caracter;
        switch (caracter){
            case "a" -> salid="@";
            case "e" -> salid="#";
            case "i" -> salid="#";
            case "o" -> salid="%";
            case "u" -> salid="*";
            
        }
        return salid;
    }
    
    
    
}

    


