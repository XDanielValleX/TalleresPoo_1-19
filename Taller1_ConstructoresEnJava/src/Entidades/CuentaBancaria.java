/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author daniel
 */
public class CuentaBancaria {
    String numeroCuenta;
    double saldo;
    String tipoCuenta;
    
    //Predeterminado
    public CuentaBancaria() {
        numeroCuenta = "Desconocida";
        saldo = 0.0;
        tipoCuenta = "Sin Especificar";
    }

    //Parametrizado
    public CuentaBancaria(String numeroCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
    }

    //Sobrecargado
    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }
    
    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "numeroCuenta='" + numeroCuenta + '\'' +
                ", saldo=" + saldo +
                ", tipoCuenta='" + tipoCuenta + '\'' +
                '}';
    }
}
