package Ejercicio2;

public class Ejercicio2 {
    public static void main(String[] args) {
        Almacenamiento almacenamiento = new AlmacenamientoLocal();
        GestorArchivos gestorArchivos = new GestorArchivos(almacenamiento);
        
        gestorArchivos.guardar("miArchivo.txt", "Contenido del archivo.");
        System.out.println(gestorArchivos.recuperar("miArchivo.txt"));
    }
}
