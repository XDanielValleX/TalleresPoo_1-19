package Ejercicio3;

public class CanalEmail extends CanalMensaje {
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando correo electrónico: " + mensaje);
        // Lógica para enviar un correo electrónico
    }
}
