/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package Entidades;

import java.util.Scanner;

/**
 *Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
 * cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos:
 *  Constructor predeterminado o vacío
 *  Constructor con la capacidad máxima y la cantidad actual
 * Métodos getters y setters.
 *  Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
 * máxima.
 *  Método servirTaza(int): se pide el tamaño de una taza vacía,
 * el método recibe el tamaño de la taza y simula la acción de servir la taza con la capacidad indicada.
 * Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede.
 * El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.
 *  Método vaciarCafetera(): pone la cantidad de café actual en cero.
 *  Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
 * recibe y se añade a la cafetera la cantidad de café indicada.
 *
 * @author francyhoyos
 */
public class Cafetera {
    private int capacidadMaxima;
    private int cantidadActual;
    
    public Cafetera() {
    }
    
    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }
    
    public void crearCafetera(){
        Scanner leer =new Scanner (System.in);
        System.out.println("Ingrese la capacidad Maxima");
        this.capacidadMaxima=leer.nextInt();
        System.out.println("Ingrese la cantidad actual");
        this.cantidadActual=leer.nextInt();
    }
    
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }
    
    public int getCantidadActual() {
        return cantidadActual;
    }
    
    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }
    
    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    public void llenarCafetera(){
        cantidadActual=capacidadMaxima;
    }
    
    public void servirTaza(int taza){
        if (cantidadActual>taza) {
            cantidadActual-=taza;
        }else{
            
            System.out.println("No se lleno toda se llenó"+cantidadActual);
            cantidadActual-=taza;
            
        }
    }
    
    public void vaciarCafetera(){
        cantidadActual=0;
    }
    
    public void agregarCafe(int cafe){
        cantidadActual+=cafe;
    }
    
    
    @Override
    public String toString() {
        return "Cafetera{" + "capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual + '}';
    }
    
    
}
