package Taller18Poo.Ejercicio2;

public class Cajero implements Retiro{

    @Override
    public void retirar(double monto) {
        System.out.println("Retirando " + monto + " del cajero.");
    }
    
}
