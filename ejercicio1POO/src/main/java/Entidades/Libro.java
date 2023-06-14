/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package Entidades;

import java.util.Scanner;

/**
 * *Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
 * Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
 * constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
 * luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
 * numero de páginas.
 * @author francyhoyos
 */
public class Libro {
    public int isbn;
    public String titulo;
    public String autor;
    public int numeroPaginas;
    
    public Libro() {
    }
    
    public Libro(int isbn, String titulo, String autor, int numeroPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }
    
    public void cargarLibro(){
        Scanner leer =new Scanner (System.in);
            System.out.println("Ingrese el autor");
        this.autor=leer.next();
        System.out.println("Ingrese ISBN");
        this.isbn= leer.nextInt();
        System.out.println("Ingrese titulo");
        this.titulo=leer.next();
        System.out.println("Ingrese el numero de paginas");
        this.numeroPaginas=leer.nextInt();
}

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", numeroPaginas=" + numeroPaginas + '}';
    }
    
}
