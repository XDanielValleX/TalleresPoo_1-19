package Ejercicio2;

public class Ejercicio2 {

    public static void main(String[] args) {
        String contenido = "Este es el contenido del documento.";

        // Crear un documento en formato PDF
        Documento documentoPDF = new DocumentoPDF();

        // Crear un documento en formato Word
        Documento documentoWord = new DocumentoWord();

        // Crear un documento en formato Excel
        Documento documentoExcel = new DocumentoExcel();

        // Crear un gestor de documentos
        GestorDocumento gestorDocumento = new GestorDocumento();

        // Exportar en formato PDF
        gestorDocumento.exportarDocumento(documentoPDF, contenido);

        // Exportar en formato Word
        gestorDocumento.exportarDocumento(documentoWord, contenido);

        // Exportar en formato Excel
        gestorDocumento.exportarDocumento(documentoExcel, contenido);
    }
}
