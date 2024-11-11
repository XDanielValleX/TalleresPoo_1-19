/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author daniel
 */
public class Coche {
    private String marca;
    private String modelo;
    private double velocidadMaxima;

    public Coche() {
    }
    
    public Coche(String marca, String modelo, double velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    // Get
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void acelerar(double incremento) {
        if (incremento > 0) {
            velocidadMaxima += incremento;
            System.out.println("Velocidad maxima incrementada a: " + velocidadMaxima);
        } else {
            System.out.println("\n//// La velocidad debe ser positiva ////\n");
        }
    }
}
