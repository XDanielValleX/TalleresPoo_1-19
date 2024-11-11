package Entidades;
abstract class Figura {
    // Método abstracto para calcular el área
    public abstract double calcularArea();

    // Método para mostrar el área, llamando al método calcularArea()
    public void mostrarArea() {
        System.out.println("El área es: " + calcularArea());
    }
}

// Clase derivada Circulo
class Circulo extends Figura {
    private double radio;

    // Constructor para inicializar el radio
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Implementación del método calcularArea para un círculo
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}

// Clase derivada Rectangulo
class Rectangulo extends Figura {
    private double ancho;
    private double alto;

    // Constructor para inicializar ancho y alto
    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    // Implementación del método calcularArea para un rectángulo
    @Override
    public double calcularArea() {
        return ancho * alto;
    }
}

public class Ejercicio1 {
    public static void main(String[] args) {
        Figura circulo = new Circulo(5);
        circulo.mostrarArea();

        // Crear un objeto de tipo Rectangulo y mostrar su área
        Figura rectangulo = new Rectangulo(4, 6);
        rectangulo.mostrarArea();
    }
    
}