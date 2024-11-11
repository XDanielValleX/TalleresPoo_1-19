package Ejercicio3;

public class Evitar {
    private String mensaje = "Mensaje original";


    public static void cambiarMensaje() {
        //mensaje = "Nuevo mensaje"; // Error: no se puede hacer referencia a un atributo de instancia desde un contexto estático
    }

    public static void main(String[] args) {
        cambiarMensaje(); 
    }

    /*
public class Ejemplo {
   
    private static String mensaje = "Mensaje original";
   
    public static void cambiarMensaje() {
        mensaje = "Nuevo mensaje";
    }
    public static void main(String[] args) {
        cambiarMensaje(); 
        System.out.println("Mensaje: " + mensaje);
    }
}
 */
}
