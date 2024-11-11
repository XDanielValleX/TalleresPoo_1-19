package Ejercicio3;

public class CanalPush extends CanalMensaje{

    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando notificación push: " + mensaje);
        // Lógica para enviar una notificación push
    }
    
}
