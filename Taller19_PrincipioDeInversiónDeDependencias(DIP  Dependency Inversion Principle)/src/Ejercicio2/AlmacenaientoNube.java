package Ejercicio2;

public class AlmacenaientoNube implements Almacenamiento {
    @Override
    public void guardarArchivo(String nombre, String contenido) {
        System.out.println("Guardando archivo en la nube: " + nombre);
    }

    @Override
    public String recuperarArchivo(String nombre) {
        return "Contenido del archivo en la nube: " + nombre;
    }
}