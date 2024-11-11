package Entidades;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author daniel
 */
public class Libro {
    String titulo;
    String autor;
    String numeroPaginas;
    
    public Libro() {
        titulo = "Sin titulo";
        autor = "Sin Autor";
        numeroPaginas = "Sin Especificar";
    }
    
    public Libro(String titulo, String autor, String numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numeroPaginas='" + numeroPaginas + '\'' +
                '}';
    }
    
}
