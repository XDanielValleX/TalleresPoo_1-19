package Ejercicio3;

public class ValidacionService {
    public boolean validarContrasena(String contrasena) {
        return contrasena.length() >= 8 && contrasena.matches(".*\\d.*"); // Al menos 8 caracteres y un número
    }
}
