/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_2;

/**
 *
 * @author daniel
 */
public class Vehiculo {
    protected String tipo;
    protected String marca;

    public Vehiculo(String tipo, String marca) {
        this.tipo = tipo;
        this.marca = marca;
    }

    protected void mostrarDetalles() {
        System.out.println("Tipo: " + tipo + ", Marca: " + marca);
    }
}
