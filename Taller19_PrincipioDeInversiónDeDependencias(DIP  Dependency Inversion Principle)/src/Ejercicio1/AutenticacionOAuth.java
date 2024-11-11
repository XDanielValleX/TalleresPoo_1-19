package Ejercicio1;

public class AutenticacionOAuth implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String contrasena) {
        // Lógica simple para autenticación OAuth
        return "usuarioOAuth".equals(usuario) && "5678".equals(contrasena);
    }
}
