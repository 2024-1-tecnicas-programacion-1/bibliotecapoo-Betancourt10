package com.mycompany.bibliotecapoo;
import java.util.*; 

public class Principal {

    //O(1)
    public static void main(String[] args) {
        Scanner biblioteca = new Scanner(System.in);
        Biblioteca miBiblioteca = new Biblioteca();
        System.out.println("Hola, bievenid@ a la biblioteca.");

        boolean continuar = true; 
        //O(1)
        do {
            System.out.println("Seleccione una opción. ");
            System.out.println("1. Ingresar libro.");
            System.out.println("2. Mostrar todos los libros.");
            System.out.println("3. Buscar libro.");
            System.out.println("4. Marcar libro como leído.");
            System.out.println("5. Mostrar libros no leídos.");
            System.out.println("6. Salir.");

            int opciones = biblioteca.nextInt();
            biblioteca.nextLine(); 
            //O(1)
            switch (opciones) {
                case 1:
                    System.out.println("Por favor ingrese el titulo del libro: ");
                    String titulo = biblioteca.nextLine();
                    System.out.println("Ingrese el autor del libro: ");
                    String autor = biblioteca.nextLine();
                    System.out.println("Ingrese el género literario del libro: ");
                    String genero = biblioteca.nextLine();
                    System.out.println("Ingrese el año de publicación del libro: ");
                    int anoPublicacion = biblioteca.nextInt();

                    boolean leido = false;

                    Libro libroUsuario = new Libro(titulo, autor, anoPublicacion, genero, leido);
                    miBiblioteca.registrarLibro(libroUsuario);
                    break;
                case 2:
                    miBiblioteca.mostrarLibros();

                    break;
                case 3:
                    System.out.println("Ingrese su palabra de búsqueda: ");
                    String busqueda = biblioteca.nextLine();
                    miBiblioteca.buscarLibro(busqueda);
                    break;
                case 4:
                    System.out.println("Ingrese el título del libro que desea marcar como leído: ");
                    String tituloMarcado = biblioteca.nextLine();

                    Libro libroAMarcar = miBiblioteca.buscarLibro(tituloMarcado);

                    if (libroAMarcar != null) {
                        libroAMarcar.marcarLeido();
                        System.out.println("El libro " + tituloMarcado + " se ha marcado como leído.");
                    } else {
                        System.out.println("No se encontró el libro " + tituloMarcado + ".");
                    }
                    break;
                case 5:
                    miBiblioteca.mostrarLibrosNoLeidos();
                    break;
                case 6:
                    continuar = false;
                    System.out.println("Hasta luego, que tenga un buen día.");

                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (continuar);
        biblioteca.close();
    }

}