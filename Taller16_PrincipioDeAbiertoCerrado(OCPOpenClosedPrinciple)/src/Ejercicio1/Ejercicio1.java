package Ejercicio1;

public class Ejercicio1 {
    public static void main(String[] args) {
        double precioOriginal = 100.0;

        // Crear un descuento porcentual del 20%
        Descuento descuentoPorcentaje = new DescuentoPorcentaje(20);
        
        // Crear un descuento fijo de $15
        Descuento descuentoFijo = new DescuentoFijo(15);

        // Crear gestor de descuento
        GestorDescuento gestorDescuento = new GestorDescuento();

        // Aplicar el descuento porcentual
        double precioConDescuentoPorcentaje = gestorDescuento.aplicarDescuento(descuentoPorcentaje, precioOriginal);
        System.out.println("Precio con descuento porcentual: " + precioConDescuentoPorcentaje);

        // Aplicar el descuento fijo
        double precioConDescuentoFijo = gestorDescuento.aplicarDescuento(descuentoFijo, precioOriginal);
        System.out.println("Precio con descuento fijo: " + precioConDescuentoFijo);
    }
}
