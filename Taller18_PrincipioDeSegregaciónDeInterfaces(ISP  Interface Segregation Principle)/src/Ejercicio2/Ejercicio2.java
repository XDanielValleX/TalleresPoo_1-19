package Taller18Poo.Ejercicio2;

public class Ejercicio2 {
    public static void main(String[] args) {
        Retiro cajero = new Cajero();
        Transferencia bancoOnline = new Bancolombia();
        PagoFactura pagoOnline = new Bancolombia();

        cajero.retirar(500);
        bancoOnline.transferir(200);
        pagoOnline.pagarFactura("Electricidad", 100);
    }
}
