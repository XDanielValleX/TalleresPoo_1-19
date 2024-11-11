package Entidades;
abstract class Empleado {
    protected String nombre;
    protected double salarioBase;

    // Constructor para inicializar el nombre y el salario base
    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    // Método abstracto para calcular el salario
    public abstract double calcularSalario();

    // Método para mostrar los detalles del empleado
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario Total: " + calcularSalario());
    }
}

// Clase derivada Gerente
class Gerente extends Empleado {
    private double bonificacion;

    // Constructor para inicializar nombre, salario base y bonificación
    public Gerente(String nombre, double salarioBase, double bonificacion) {
        super(nombre, salarioBase);
        this.bonificacion = bonificacion;
    }

    // Implementación del método calcularSalario para un gerente
    @Override
    public double calcularSalario() {
        return salarioBase + bonificacion;
    }
}

// Clase derivada Vendedor
class Vendedor extends Empleado {
    private double comision;
    private int ventasRealizadas;

    // Constructor para inicializar nombre, salario base, comisión y ventas realizadas
    public Vendedor(String nombre, double salarioBase, double comision, int ventasRealizadas) {
        super(nombre, salarioBase);
        this.comision = comision;
        this.ventasRealizadas = ventasRealizadas;
    }

    // Implementación del método calcularSalario para un vendedor
    @Override
    public double calcularSalario() {
        return salarioBase + (comision * ventasRealizadas);
    }
}
public class Ejercicio2 {
    public static void main(String[] args) {
        // Crear un objeto de tipo Gerente y mostrar sus detalles
        Empleado gerente = new Gerente("Carlos", 3000, 1000);
        gerente.mostrarDetalles();

        // Crear un objeto de tipo Vendedor y mostrar sus detalles
        Empleado vendedor = new Vendedor("Ana", 1500, 200, 10);
        vendedor.mostrarDetalles();
    }
}
