package Ejercicio2;

public class DocumentoExcel extends Documento {
    @Override
    public void exportar(String contenido) {
        System.out.println("Exportando contenido a Excel: " + contenido);
        // Aquí iría la lógica para generar un archivo Excel
    }
}
