/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package Servicios;

import Entidades.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author francyhoyos
 */
public class CircunferenciaServicios {
    private Circunferencia circunferencia;
    
    public Circunferencia crearCircunferencia(){
        Scanner leer =new Scanner (System.in);
        System.out.println("Ingrese el radio ");
        double radio = leer.nextDouble();
        
         this.circunferencia  = new Circunferencia(radio);
        
        return circunferencia;
    }
    

}
