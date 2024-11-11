/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_2.Principal;

import Ejercicio_2.Vehiculo;

/**
 *
 * @author daniel
 */
public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Moto", "Yamaha");
       // System.out.println(vehiculo.marca); // Error Marca tiene acceso protegido
    }
}
