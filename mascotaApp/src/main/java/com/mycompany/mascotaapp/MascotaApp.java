/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
*/

package com.mycompany.mascotaapp;

import com.mycompany.mascotaapp.Entidades.Mascota;
import java.util.Scanner;
/**
 *
 * @author francyhoyos
 */
public class MascotaApp {
    
    public static void main(String[] args) {
        Scanner leer =new Scanner (System.in);
        System.out.println("Hello World!");
        
        Mascota m1 = new Mascota("chiquito",leer.next(),"perro");
        
        m1.setNombre("lolo");
        m1.pasear(100);
        System.out.println(m1.toString());
    }
}
