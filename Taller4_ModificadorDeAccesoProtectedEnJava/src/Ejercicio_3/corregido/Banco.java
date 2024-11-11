/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_3.corregido;

/**
 *
 * @author daniel
 */
public class Banco {

    private double saldo;

    public Banco(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double obtenerSaldo() {
        return saldo;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("\nSu deposito fue exitoso. Su saldo es de: $" + saldo + "\n");
        } else {
            System.out.println("\n//// Cantidad a depositar debe ser positiva ////\n");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("\nSu retiro fue exitoso. Su nuevo saldo es de: $\n" + saldo);
        } else {
            System.out.println("\n//// Cantidad no valida o insuficiente ////\n");
        }
    }
    
    public void mostrarSaldo() {
        System.out.println("\nSaldo actual: $" + saldo + "\n");
    }
}
