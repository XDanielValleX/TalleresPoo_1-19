package Entidades;

interface Nadador{
    void Nadar();
}

interface Respirador{
    void Respirar();
}

class Pez implements Nadador, Respirador{
    
    @Override
    public void Nadar(){
        System.out.println("Nadaremos nadaremos en el mar, el mar, el mar.");
    }

    @Override
    public void Respirar(){
        System.out.println("Estoy respirando");
    }
}
public class Ejercicio2 {
    public static void main(String[] args) {
        Pez pez1 = new Pez();
        pez1.Respirar();
        pez1.Nadar();
    }
}
