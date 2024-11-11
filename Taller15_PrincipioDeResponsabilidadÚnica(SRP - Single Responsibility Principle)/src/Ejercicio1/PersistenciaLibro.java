package Ejercicio1;

public class PersistenciaLibro {
    public void guardar(Libro libro) {
        System.out.println("Guardando el libro en la base de datos...");
        // Simulación de guardado en base de datos
        System.out.println("Libro guardado: " + libro.getTitulo() + " - ISBN: " + libro.getIsbn());
    }
}
