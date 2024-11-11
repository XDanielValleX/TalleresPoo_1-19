package Ejercicio2;

public class Estudiante {

    private String nombre;
    private int edad;


    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }


    public Estudiante() {
        this("Desconocido", 0); 
    }


    public void mostrarDetalles() {
        System.out.println("Nombre del estudiante: " + nombre);
        System.out.println("Edad del estudiante: " + edad);
    }
}
