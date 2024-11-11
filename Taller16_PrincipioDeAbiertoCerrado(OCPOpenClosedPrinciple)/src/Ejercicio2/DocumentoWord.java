package Ejercicio2;

public class DocumentoWord extends Documento {
    @Override
    public void exportar(String contenido) {
        System.out.println("Exportando contenido a Word: " + contenido);
        // Aquí iría la lógica para generar un archivo Word
    }
}
