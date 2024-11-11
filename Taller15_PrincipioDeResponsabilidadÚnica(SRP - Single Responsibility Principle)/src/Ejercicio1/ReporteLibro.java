package Ejercicio1;

public class ReporteLibro {
    private Libro libro;

    public ReporteLibro(Libro libro) {
        this.libro = libro;
    }

    public String generarReporte() {
        return "Reporte del libro: " + libro.getTitulo() + " escrito por " + libro.getAutor() + ". ISBN: " + libro.getIsbn();
    }
}
