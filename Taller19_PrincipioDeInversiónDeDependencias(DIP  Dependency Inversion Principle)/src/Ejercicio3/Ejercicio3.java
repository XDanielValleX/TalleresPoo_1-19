package Ejercicio3;

public class Ejercicio3 {
    public static void main(String[] args) {
        GeneradorReporte reportePDF = new ReportePDF();
        GestorReportes gestorReportes = new GestorReportes(reportePDF);
        
        gestorReportes.generar("Datos del reporte.");
    }
}
