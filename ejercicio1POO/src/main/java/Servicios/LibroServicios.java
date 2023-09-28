/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package Servicios;
import Entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author francyhoyos
 */
public class LibroServicios {
    
    private Libro libro;
    
    public Libro cargarLibro(){
        Scanner leer =new Scanner (System.in);
        System.out.println("Ingrese el autor");
        String autor=leer.next();
        System.out.println("Ingrese ISBN");
        int isbn= leer.nextInt();
        System.out.println("Ingrese titulo");
        String titulo=leer.next();
        System.out.println("Ingrese el numero de paginas");
        int numeroPaginas=leer.nextInt();
        
        this.libro  = new Libro(isbn, titulo, autor, numeroPaginas);
        
        return libro;
    }


    
}
