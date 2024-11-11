package Taller18Poo.Ejercicio3;

public class Camion implements Conduccion, TransporteMercancia{
    @Override
    public void conducir() {
        System.out.println("El camión está siendo conducido.");
    }

    @Override
    public void cargarMercancia() {
        System.out.println("Cargando mercancía en el camión.");
    }
}
