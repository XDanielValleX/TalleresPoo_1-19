package Entidades;

class Vehiculo {
    public void mover() {
        System.out.println("El vehículo se está moviendo.");
    }
}

class Coche extends Vehiculo {
    
    @Override
    public void mover() {
        System.out.println("El coche está avanzando en la carretera.");
    }
}

class Bicicleta extends Vehiculo {
    
    @Override
    public void mover() {
        System.out.println("La bicicleta se está desplazando por el camino.");
    }
}
public class Ejercicio3 {
    public static void main(String[] args) {
        Vehiculo coche = new Coche();
        Vehiculo bicicleta = new Bicicleta();

        // Uso del polimorfismo para invocar el método mover en diferentes tipos de Vehículo
        coche.mover();
        bicicleta.mover();
    }
}
