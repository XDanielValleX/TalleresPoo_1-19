package Ejercicio2;

public class AlmacenamientoLocal implements Almacenamiento {
    @Override
    public void guardarArchivo(String nombre, String contenido) {
        System.out.println("Guardando archivo en almacenamiento local: " + nombre);
    }

    @Override
    public String recuperarArchivo(String nombre) {
        return "Contenido del archivo en almacenamiento local: " + nombre;
    }
}