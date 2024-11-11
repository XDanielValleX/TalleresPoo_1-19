package Ejercicio1;

public class Ejercicio1 {
    public static void main(String[] args) {
        Libro libro = new Libro("Cien Años de Soledad", "Gabriel García Márquez", "978-3-16-148410-0");
        
        ReporteLibro reporteLibro = new ReporteLibro(libro);
        System.out.println(reporteLibro.generarReporte());

        PersistenciaLibro persistenciaLibro = new PersistenciaLibro();
        persistenciaLibro.guardar(libro);
    }
}
