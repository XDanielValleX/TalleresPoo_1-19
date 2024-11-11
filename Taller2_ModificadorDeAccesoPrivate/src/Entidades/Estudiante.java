/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author daniel
 */
public class Estudiante {
    private String nombre;
    private int edad;
    private double notaPromedio;

    public Estudiante() {
    }

    public Estudiante(String nombre, int edad, double notaPromedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaPromedio = notaPromedio;
    }
    
    // Get y Set con validaciones
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        } else {
            System.out.println("\n//// La edad debe ser mayor que 0 ////\n");
        }
    }

    public double getNotaPromedio() {
        return notaPromedio;
    }

    public void setNotaPromedio(double notaPromedio) {
        if (notaPromedio >= 0 && notaPromedio <= 10) {
            this.notaPromedio = notaPromedio;
        } else {
            System.out.println("\n//// La nota promedio debe estar entre 0 y 10 ////\n");
        }
    }
}
