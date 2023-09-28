/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
*/

package poo.ejercicio6poo;

import Entidades.Cafetera;

/**
 *
 * @author francyhoyos
 */
public class Ejercicio6POO {
    
    public static void main(String[] args) {
        
        Cafetera cafeterita = new Cafetera();
        cafeterita.crearCafetera();
        System.out.println(cafeterita.toString());
        cafeterita.servirTaza(10);
        System.out.println(cafeterita.toString());
    }
}
