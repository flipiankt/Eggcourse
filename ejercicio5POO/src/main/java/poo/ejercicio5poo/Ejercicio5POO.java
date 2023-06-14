/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
*/

package poo.ejercicio5poo;

import poo.ejercicio5poo.Servicios.Cuenta;

/**
 *
 * @author francyhoyos
 */
public class Ejercicio5POO {
    
    public static void main(String[] args) {
        Cuenta c1= new Cuenta();
        c1.crearCuenta();
        c1.consultarSaldo();
        c1.consultarDatos();
        c1.extraccionRapida(100);
        c1.consultarDatos();
        c1.retirar(200);
        c1.consultarSaldo();
        
    }
}
