package Ejercicio1;

public class GestorAutenticacion {
    private ServicioAutenticacion servicio;

    public GestorAutenticacion(ServicioAutenticacion servicio) {
        this.servicio = servicio;
    }

    public boolean iniciarSesion(String usuario, String contrasena) {
        return servicio.autenticar(usuario, contrasena);
    }
}
