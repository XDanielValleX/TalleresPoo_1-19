/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import java.util.Scanner;
import Entidades.CuentaBancaria;
import Entidades.Estudiante;
import Entidades.Libro;
/**
 *
 * @author daniel
 */

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Objeto de la clase Libro
        System.out.println("\nIngrese los detalles del libro:\n");
        System.out.println("- Titulo:");
        System.out.print("||");
        String titulo = scanner.nextLine();
        
        System.out.println("\n- Autor:");
        System.out.print("||");
        String autor = scanner.nextLine();
        
        System.out.println("\n- Numero de paginas:");
        System.out.print("||");
        String numeroPaginas = scanner.nextLine();
        
        
        Libro libro = new Libro(titulo, autor, numeroPaginas);
        System.out.println("\nDetalles del libro:\n" + libro);

        // Objeto de la clase CuentaBancaria
        System.out.println("\nIngrese los detalles de la cuenta bancaria:\n");
        System.out.println("- Numero de cuenta:");
        System.out.print("||");
        String numeroCuenta = scanner.nextLine();
        
        System.out.println("\n- Tipo de cuenta:");
        System.out.print("||");
        String tipoCuenta = scanner.nextLine();
        
        System.out.println("\n- Saldo inicial:");
        System.out.print("||");
        double saldo = scanner.nextDouble();
        scanner.nextLine();

        CuentaBancaria cuentaBancaria = new CuentaBancaria(numeroCuenta, saldo, 
                tipoCuenta);
        System.out.println("\nDetalles de la cuenta bancaria:\n" + 
                cuentaBancaria);

        // Objeto de la clase Estudiante
        System.out.println("\nIngrese los detalles del estudiante:\n");
        System.out.println("- Nombre:");
        System.out.print("||");
        String nombre = scanner.nextLine();
        
        System.out.println("\n- Edad:");
        System.out.print("||");
        int edad = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("\n- Curso:");
        System.out.print("||");
        String curso = scanner.nextLine();
        
        Estudiante estudiante = new Estudiante(nombre, edad, curso);
        System.out.println("\nDetalles del estudiante:\n" + estudiante);

        scanner.close();
    }
}
