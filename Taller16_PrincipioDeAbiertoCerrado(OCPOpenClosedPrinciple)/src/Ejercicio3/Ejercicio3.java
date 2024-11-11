package Ejercicio3;

public class Ejercicio3 {
    public static void main(String[] args) {
        String mensaje = "Este es el mensaje de prueba.";

        // Instancias para cada canal de mensajes
        CanalMensaje canalEmail = new CanalEmail();
        CanalMensaje canalSMS = new CanalSMS();
        CanalMensaje canalPush = new CanalPush();

        // Instancia del gestor de mensajes
        GestorMensajes gestor = new GestorMensajes();

        // Enviar mensajes a través de diferentes canales
        gestor.enviarMensaje(canalEmail, mensaje);
        gestor.enviarMensaje(canalSMS, mensaje);
        gestor.enviarMensaje(canalPush, mensaje);
    }
}

