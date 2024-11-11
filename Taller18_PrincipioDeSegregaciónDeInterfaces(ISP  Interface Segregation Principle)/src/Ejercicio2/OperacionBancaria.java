package Taller18Poo.Ejercicio2;

public interface OperacionBancaria {
    void transferir(double monto);
    void retirar(double monto);
    void pagarFactura(String servicio, double monto);
}
