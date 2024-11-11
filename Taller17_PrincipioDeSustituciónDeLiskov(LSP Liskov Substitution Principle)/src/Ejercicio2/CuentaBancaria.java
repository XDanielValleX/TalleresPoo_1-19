package Taller17Poo.Ejercicio2;

public class CuentaBancaria {
    protected double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void consultarSaldo() {
        System.out.println("Saldo de la cuenta: $" + saldo);
    }

    public void depositar(double monto) {
        saldo += monto;
        System.out.println("Depósito realizado. Nuevo saldo: $" + saldo);
    }
}
