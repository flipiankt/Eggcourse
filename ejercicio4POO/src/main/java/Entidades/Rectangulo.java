/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package Entidades;

import java.util.Scanner;

/**
 *Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base y un atributo privado altura.
 * La clase incluirá un método para crear el rectángulo con los datos del Rectángulo dados por el usuario.
 * También incluirá un método para calcular la superficie del rectángulo y un método para calcular el perímetro del rectángulo.
 * Por último, tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura.
 * Se deberán además definir los métodos getters, setters y constructores correspondientes.
 * Superficie = base * altura / Perímetro = (base + altura) * 2.
 * @author francyhoyos
 */
public class Rectangulo {
    private int base;
    private int altura;
    
    public Rectangulo() {
    }
    
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public int getBase() {
        return base;
    }
    
    public int getAltura() {
        return altura;
    }
    
    public void setBase(int base) {
        this.base = base;
    }
    
    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    
    public void crearRectangulo(){
        Scanner leer =new Scanner (System.in);
        System.out.println("Ingrese la base");
        this.base=leer.nextInt();
        System.out.println("Ingrese la altura");
        this.altura=leer.nextInt();
    }
    
    public void area(){
        System.out.println("el area es "+(base*altura));
    }
    
    public void perimetro(){
        System.out.println("el perimetro es "+(base+altura)*2);
    }
    
    public void dibujo(){
        for (int i = 0; i < base; i++) {
            for (int j = 0; j < altura; j++) {
                if (i==0 || i==base-1 || j==0 || j==altura-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
