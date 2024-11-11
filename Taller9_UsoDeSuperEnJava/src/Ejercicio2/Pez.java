package Taller9Poo.Ejercicio2;

public class Pez extends Animal {

    private String tipoDeAgua;


    public Pez(String especie, String tipoDeAgua) {
        super(especie); 
        this.tipoDeAgua = tipoDeAgua;
    }


    public void mostrarDetalles() {
        mostrarEspecie(); 
        System.out.println("Tipo de Agua: " + tipoDeAgua);
    }
}
