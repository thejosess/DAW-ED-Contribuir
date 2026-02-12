package com.biblioteca;


import com.biblioteca.modelo.Libro;
import java.util.ArrayList;
import java.util.Scanner;

public class BibliotecaApp {
    private ArrayList<Libro> listaLibros;

    public BibliotecaApp() {
        listaLibros = new ArrayList<>();
    }

    // Muestra el menú principal
    public void mostrarMenu() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Sistema Biblioteca ---");
            System.out.println("1. Agregar libro");
            System.out.println("2. Mostrar todos los libros");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    agregarLibro();
                    break;
                case 2:
                    mostrarLibros();
                    break;
                case 3:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 3);
    }

    // Método actualizado para agregar libro con categoría
    public void agregarLibro() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Título: ");
        String titulo = sc.nextLine();
        
        System.out.print("Autor: ");
        String autor = sc.nextLine();
        
        System.out.print("ISBN: ");
        String isbn = sc.nextLine();
        
        System.out.print("Año de publicación: ");
        int año = sc.nextInt();
        sc.nextLine(); // limpiar buffer
        
        System.out.print("Categoría: ");
        String categoria = sc.nextLine(); // ← nuevo
        
        // Crear el libro con la categoría
        Libro libro = new Libro(titulo, autor, isbn, año, categoria);
        
        listaLibros.add(libro);
        System.out.println("Libro agregado correctamente!");
    }

    // Mostrar todos los libros
    public void mostrarLibros() {
        if (listaLibros.isEmpty()) {
            System.out.println("No hay libros registrados.");
        } else {
            System.out.println("\n--- Lista de Libros ---");
            for (Libro libro : listaLibros) {
                System.out.println(libro);
            }
        }
    }

    public static void main(String[] args) {
        BibliotecaApp app = new BibliotecaApp();
        app.mostrarMenu();
    }
}
