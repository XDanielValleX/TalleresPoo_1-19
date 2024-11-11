package Ejercicio2;

public class EtiquetaProducto {
    
    private Producto producto;

    public EtiquetaProducto(Producto producto) {
        this.producto = producto;
    }

    public String generarEtiqueta() {
        CalculadoraPrecio calculadora = new CalculadoraPrecio();
        double precioFinal = calculadora.calcularPrecioFinal(producto);
        return "Producto: " + producto.getNombre() + ", Precio: $" + precioFinal;
    }
}
