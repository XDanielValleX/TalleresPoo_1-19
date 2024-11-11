package Ejercicio2;

public class Ejercicio2 {
    public static void main(String[] args) {
        Producto producto = new Producto("Laptop", 1000.0, 0.15);

        CalculadoraPrecio calculadora = new CalculadoraPrecio();
        System.out.println("Precio final: $" + calculadora.calcularPrecioFinal(producto));

        EtiquetaProducto etiqueta = new EtiquetaProducto(producto);
        System.out.println(etiqueta.generarEtiqueta());
    }
}
