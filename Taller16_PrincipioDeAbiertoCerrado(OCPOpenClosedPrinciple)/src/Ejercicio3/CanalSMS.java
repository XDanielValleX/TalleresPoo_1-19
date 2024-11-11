package Ejercicio3;

public class CanalSMS extends CanalMensaje {

    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando SMS: " + mensaje);
        // Lógica para enviar un SMS
    }
    
}
