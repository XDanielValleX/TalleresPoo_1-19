package Taller17Poo.Ejercicio2;

public class Ejercicio2 {
    public static void main(String[] args) {
        CuentaBancaria cuentaNormal = new CuentaBancaria(1000);
        CuentaBancaria cuentaAhorros = new CuentaAhorros(2000);

        cuentaNormal.consultarSaldo(); // Muestra: "Saldo de la cuenta: $1000"
        cuentaAhorros.consultarSaldo(); // Muestra: "Saldo de la cuenta de ahorros: $2000"

        cuentaNormal.depositar(500); // Muestra: "Depósito realizado. Nuevo saldo: $1500"
        cuentaAhorros.depositar(500); // Muestra: "Depósito realizado. Nuevo saldo: $2500"

        CuentaAhorros cuentaAhorros1 = new CuentaAhorros(2000);
        cuentaAhorros1.generarIntereses(5);  
}

}
