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
    String nombre;
    int edad;
    String curso;
    
    public Estudiante() {
        nombre = "Sin nombre";
        edad = 0;
        curso = "Sin asignar";
    }

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = "Sin asignar";
    }
    
    public Estudiante(String nombre, int edad, String curso) { 
        this(nombre, edad);
        this.curso = curso;
    }
    
    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", curso='" + curso + '\'' +
                '}';
    }
}
