package com.mycompany.bibliotecapoo;
import java.util.*; 

public class Biblioteca {

    private LinkedList<Libro> libros;
    
    //O(1)
    public Biblioteca() {
        this.libros = new LinkedList<>();
    }
    
    //O(1)
    public void registrarLibro(Libro libroNuevo) {
        libros.add(libroNuevo);
    }

    //O(N)
    public Libro buscarLibro(String palabraBusqueda) {
        for (int i = 0; i < libros.size(); i++) {
            Libro libroVisitado = libros.get(i);
            if (libroVisitado.getTitulo().equals(palabraBusqueda) || libroVisitado.getAutor().equals(palabraBusqueda) || libroVisitado.getGenero().equals(palabraBusqueda)) {
                System.out.println(libroVisitado.mostrarInformacion());
                return libroVisitado;
            }
        }
        return null;
    }
    
    //O(N)
    public String mostrarLibros() {
        for (int i = 0; i < libros.size(); i++) {
            Libro libro = libros.get(i);
            System.out.println(libro.mostrarInformacion());
        }
        return libros.toString();
    }

    //O(N)
    public String mostrarLibrosNoLeidos() {
        LinkedList<Libro> librosNoLeidos = new LinkedList<>();
        for (int i = 0; i < libros.size(); i++) {
            Libro libroBuscado = libros.get(i);
            if (libroBuscado.isLeido()==false) {
                librosNoLeidos.add(libroBuscado);
                System.out.println(libroBuscado.mostrarInformacion());
            } 
        }
        if (librosNoLeidos.isEmpty()) {
            System.out.println("No hay libros sin leer.");
        }
        return "Nombre del libro mal escrito.";
    }

}