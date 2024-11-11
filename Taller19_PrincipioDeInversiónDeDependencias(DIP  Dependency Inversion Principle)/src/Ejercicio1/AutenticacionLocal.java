package Ejercicio1;

public class AutenticacionLocal implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String contrasena) {
        // Lógica simple para autenticación local
        return "usuarioLocal".equals(usuario) && "1234".equals(contrasena);
    }
}
