/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
*/

package com.mycompany.ejercicio1poo;

import Entidades.Libro;

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
 
        Libro l1 = new Libro();
        l1.cargarLibro();
        System.out.println(l1.toString());
    }
}
