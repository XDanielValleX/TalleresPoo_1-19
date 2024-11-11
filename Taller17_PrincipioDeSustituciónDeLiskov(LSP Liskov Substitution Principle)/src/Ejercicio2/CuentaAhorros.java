package Taller17Poo.Ejercicio2;

public class CuentaAhorros extends CuentaBancaria {

    public CuentaAhorros(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo de la cuenta de ahorros: $" + saldo);
    }

    public void generarIntereses(double tasa) {
        double interes = saldo * tasa / 100;
        saldo += interes;
        System.out.println("Interés generado: $" + interes + ". Nuevo saldo: $" + saldo);
    }
}