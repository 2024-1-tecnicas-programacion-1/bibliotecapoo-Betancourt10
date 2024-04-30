package com.mycompany.bibliotecapoo;

public class Libro {

    private String titulo;
    private String autor;
    private int anoPublicacion;
    private String genero;
    private boolean leido;

    //O(1)
    public Libro(String titulo, String autor, int anoPublicacion, String genero, boolean leido) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacion = anoPublicacion;
        this.genero = genero;
        this.leido = false;
    }

    //O(1)
    public String mostrarInformacion() {
        return "Titulo: " + titulo + ", Autor: " + autor + ", Año de publicación: " + anoPublicacion + ", Género: " + genero;//O(1)
    }

    //O(1)
    public void marcarLeido() {
        leido = true;

    }

    //O(1)
    public boolean isLeido() {
        return leido;
    }

    //O(1)
    public boolean esAntiguo() {
        if (anoPublicacion < 1974) {
            return true;
        }
        return false;
    }

    //O(1)
    public String getTitulo() {
        return titulo;
    }

    //O(1)
    public String getAutor() {
        return autor;
    }

    //O(1)
    public String getGenero() {
        return genero;

    }
}