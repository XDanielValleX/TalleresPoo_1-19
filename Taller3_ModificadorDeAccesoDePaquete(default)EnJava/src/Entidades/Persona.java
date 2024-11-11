/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author daniel
 */
public class Persona {

    private String nombre;
    int edad;

    // get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    class PruebaPersona {

        public static void main(String[] args) {
            Persona persona = new Persona();

            // Acceso al atributo nombre a traves de los metodos
            persona.setNombre("Juan");
            System.out.println(persona.getNombre()); 

            // Acceso directo al atributo edad
            persona.edad = 30;
            System.out.println("Edad: " + persona.edad);
        }
    }

}
