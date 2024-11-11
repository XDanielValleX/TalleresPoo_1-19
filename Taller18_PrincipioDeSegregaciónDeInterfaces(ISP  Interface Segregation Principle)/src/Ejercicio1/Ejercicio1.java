package Ejercicio1;

public class Ejercicio1 {
    public static void main(String[] args) {
        Reparacion taller = new Taller();
        Limpieza servicioLimpieza = new ServicioDeLimpieza();

        taller.reparar();
        servicioLimpieza.limpiar();
    }
}
