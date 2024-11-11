package Ejercicio1;

public class Ejercicio1 {
    public static void main(String[] args) {
        ServicioAutenticacion authLocal = new AutenticacionLocal();
        GestorAutenticacion gestor = new GestorAutenticacion(authLocal);
        
        if (gestor.iniciarSesion("usuarioLocal", "1234")) {
            System.out.println("Autenticación local exitosa.");
        } else {
            System.out.println("Autenticación local fallida.");
        }
    }
}
