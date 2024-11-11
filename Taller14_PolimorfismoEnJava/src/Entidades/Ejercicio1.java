package Entidades;

class Figura {
    public void calcularArea() {
        System.out.println("Calculando el área de una figura.");
    }
}

class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        double area = Math.PI * radio * radio;
        System.out.println("Área del círculo: " + area);
    }
}

class Rectangulo extends Figura {
    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public void calcularArea() {
        double area = ancho * alto;
        System.out.println("Área del rectángulo: " + area);
    }
}


public class Ejercicio1 {
    public static void main(String[] args) {
        Figura circulo = new Circulo(3.5);
        Figura rectangulo = new Rectangulo(4.0, 5.0);

        // Uso del polimorfismo para calcular el área de diferentes figuras
        circulo.calcularArea();
        rectangulo.calcularArea();
    }
}
