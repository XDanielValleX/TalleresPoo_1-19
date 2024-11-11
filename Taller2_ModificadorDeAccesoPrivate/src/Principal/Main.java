/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import Entidades.Coche;
import Entidades.Estudiante;

/**
 *
 * @author daniel
 */
public class Main {
    public static void main(String[] args) {
        
        // Instancia de la Estudiante
        Estudiante estudiante = new Estudiante("Daniel", 20, 8.5);

        estudiante.setEdad(25);
        estudiante.setNotaPromedio(9.0);

        // Acceso traves de los getters
        System.out.println("- Datos del Estudiante");
        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Edad: " + estudiante.getEdad());
        System.out.println("Nota Promedio: " + estudiante.getNotaPromedio() + "\n");
        
        
        // Instancia de Coche
        Coche coche = new Coche("Toyota", "Corolla", 180);
        
        // Acceso traves de los getters
        System.out.println("- Datos del Coche");
        System.out.println("Marca: " + coche.getMarca());
        System.out.println("Modelo: " + coche.getModelo());
        System.out.println("Velocidad Maxima: " + coche.getVelocidadMaxima());
        
        // Incrementando la velocidad maxima con un valor positivo y uno negativo
        coche.acelerar(20);
        coche.acelerar(-10);
        
        // Error al acceder a las propiedades directamente (Estan privadas)
        // System.out.println(coche.marca);  // marca tiene  acceso privado
        // System.out.println(coche.modelo); // modelo tiene  acceso privado
        // System.out.println(coche.velocidadMaxima); // velocidadMaxima tiene  acceso privado
    }
}
