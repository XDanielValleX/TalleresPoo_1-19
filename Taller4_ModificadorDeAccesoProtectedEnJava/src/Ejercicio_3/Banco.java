/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_3;

/**
 *
 * @author daniel
 */
public class Banco {
    protected double saldo;
    
    public Banco(double saldo) {
        this.saldo = saldo;
    }

    protected double obtenerSaldo() {
        return saldo;
    }
}
