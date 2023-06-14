/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
*/

package poo.ejercicio2poo;

import Circunferencia.Circunferencia;

/**
 *Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. A continuación, se deben crear los siguientes métodos:
 * a) Método constructor que inicialice el radio pasado como parámetro.
 * b) Métodos get y set para el atributo radio de la clase Circunferencia.
 * c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del objeto.
 * d) Método area(): para calcular el área de la circunferencia (𝐀𝐫𝐞𝐚 = 𝛑 ∗ 𝐫𝐚𝐝𝐢𝐨𝟐).
 * e) Método perimetro(): para calcular el perímetro (𝐏𝐞𝐫𝐢𝐦𝐞𝐭𝐫𝐨 = 𝟐 ∗ 𝛑 ∗ 𝐫𝐚𝐝𝐢𝐨).
 * @author francyhoyos
 */
public class Ejercicio2POO {
    
    public static void main(String[] args) {
        
        Circunferencia c1 = new Circunferencia(2);
        System.out.println(c1.toString());
        c1.crearCircunferencia();
        System.out.println(c1.toString());
        c1.perimetro();
        c1.area();
        
        
    }
}
