package Entidades;

interface Volador {
    void volar();
}

interface Nadador {
    void nadar();
}

class Pato implements Volador, Nadador {
    
    private String nombre;

    public Pato(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void volar() {
        System.out.println(nombre + " está volando.");
    }

    @Override
    public void nadar() {
        System.out.println(nombre + " está nadando en el agua.");
    }
}

public class Ejercicio2 {
    public static void main(String[] args) {
        Pato pato = new Pato("Donald");

        // Llamada a los métodos de las interfaces
        pato.volar();
        pato.nadar();
    }
}
