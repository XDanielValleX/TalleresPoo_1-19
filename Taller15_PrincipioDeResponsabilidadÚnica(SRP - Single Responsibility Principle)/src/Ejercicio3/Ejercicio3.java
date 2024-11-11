package Ejercicio3;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Crear un objeto Usuario
        Usuario usuario = new Usuario("usuarioEjemplo", "password123");

        // Crear servicios de autenticación y validación
        AutenticacionService autenticacionService = new AutenticacionService();
        ValidacionService validacionService = new ValidacionService();

        // Validar la contraseña
        if (validacionService.validarContrasena(usuario.getContrasena())) {
            System.out.println("Contraseña válida.");
        } else {
            System.out.println("Contraseña no cumple los criterios de seguridad.");
        }

        // Autenticar al usuario
        if (autenticacionService.autenticar(usuario, "usuarioEjemplo", "password123")) {
            System.out.println("Autenticación exitosa.");
        } else {
            System.out.println("Error de autenticación.");
        }
    }
}
