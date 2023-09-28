/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package Entidades;

import java.util.Scanner;

/**
 *Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos: numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las operaciones asociadas a dicha clase son:
 * a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
 * b) Agregar los métodos getters y setters correspondientes
 * c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
 * d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar y se la sumara a saldo actual.
 * e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el saldo actual en 0.
 * f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
 * g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
 * h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 *
 * @author francyhoyos
 */
public class Cuenta {
    private int numeroCuenta;
    private int dni;
    private int saldo;
    
    public Cuenta() {
    }
    
    public Cuenta(int numeroCuenta, int dni, int saldo) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldo = saldo;
    }
    
    public int getNumeroCuenta() {
        return numeroCuenta;
    }
    
    public int getDni() {
        return dni;
    }
    
    public int getSaldo() {
        return saldo;
    }
    
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    
    public void setDni(int dni) {
        this.dni = dni;
    }
    
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    public void crearCuenta(){
        Scanner leer =new Scanner (System.in);
        System.out.println("Ingrese el numero de cuenta");
        this.numeroCuenta=leer.nextInt();
        System.out.println("    i   ngrese su DNI");
        this.dni=leer.nextInt();
        System.out.println("Ingrese su saldo");
        this.saldo=leer.nextInt();
        
    }
    
    public int ingresar(int ingreso){
        saldo +=ingreso;
        return saldo;
    }
    
    public int retirar(int retiro){
        if (retiro>saldo) {
            saldo=0;
        }else{
            saldo -=retiro;
            
        }
        return saldo;
    }
    
    public int extraccionRapida(int retiro){
        if (retiro<(saldo*0.2)) {
            saldo-=retiro;
            
        } else{
            System.out.println("no se puede retirar");
        }
        return saldo;
    }
    
    public void consultarSaldo(){
        System.out.println("El saldo es "+saldo);
    }
    
    public void consultarDatos(){
        System.out.println("El  numero de cuenta es "+numeroCuenta);
        System.out.println("El DNI ES "+dni);
        System.out.println("El saldo es "+saldo);
    }
}
