/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
*/

package com.mycompany.ejercicio1poo;

import Entidades.Libro;
import Servicios.LibroServicios;

/**
 *Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
 * Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
 * constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
 * luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
 * numero de páginas.
 * @author francyhoyos
 */
public class Ejercicio1POO {
    
    public static void main(String[] args) {
        
        LibroServicios libroS = new LibroServicios();
        
        libroS.cargarLibro();
        System.out.println(libroS.toString());
    }
}
