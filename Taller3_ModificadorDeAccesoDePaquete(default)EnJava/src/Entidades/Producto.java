/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author daniel
 */

class Producto {
    String nombre;
    double precio;
    int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    
    void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Precio: " + precio + ", Stock: " + stock);
    }
}

class Main {
    public static void main(String[] args) {
        // Objeto Producto
        Producto producto = new Producto("Laptop", 1200.00, 10);
        producto.mostrarInfo();
    }
}
