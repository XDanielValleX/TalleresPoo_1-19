package Ejercicio3;

public class ReportePDF implements GeneradorReporte {
    @Override
    public void generarReporte(String datos) {
        System.out.println("Generando reporte en PDF con datos: " + datos);
    }
}
