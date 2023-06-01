/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
*/
package com.mycompany.ejerciciosaprendizaje;
import java.util.Scanner;
/**
 *Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
 * dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
 * fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que
 * ser X y el último tiene que ser una O.
 * Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
 * especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia
 * distinta de FDE, que no respete el formato se considera incorrecta.
 * Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas
 * e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
 * siguientes funciones de Java Substring(), Length(), equals().
 * @author francyhoyos
 */
public class Ejerci12 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer =new Scanner (System.in);
        int contCor=0,contInco=0;
        String frase;
        do{
            System.out.println("Ingrese una cadena con el formato de 5 caracteres inciando por X y terminand en 0, para salir &&&&&");
            frase=leer.next();
            
            if ((frase.length()==5) &&( (frase.substring(0, 1)).equals("X")) && (( frase.substring(frase.length()-1, frase.length())).equals("0")) ){
                contCor=contCor+1;
            }else{
                contInco=contInco+1;
            }
            
        }while( !frase.equals("&&&&&"));
        System.out.println("cantidad de correctos "+contCor);
        System.out.println("cantidad de incorrectos "+contInco);
    }
}

