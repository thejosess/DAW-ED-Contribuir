package com.biblioteca.modelo;

/**
 * Representa un libro en el sistema de biblioteca
 */
public class Libro {
    private String titulo;
    private String isbn;
    private String autor;
    private int añoPublicacion;
    private boolean disponible;
    private String categoria; // nuevo atributo
    
    // Constructor actualizado
    public Libro(String titulo, String autor, String isbn, int añoPublicacion, String categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.añoPublicacion = añoPublicacion;
        this.disponible = true;
        this.categoria = categoria;
    }
    
    // Getters y Setters
    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    public int getAñoPublicacion() { return añoPublicacion; }
    public void setAñoPublicacion(int añoPublicacion) { this.añoPublicacion = añoPublicacion; }

    public boolean isDisponible() { return disponible; }
    public void setDisponible(boolean disponible) { this.disponible = disponible; }
    
    // toString actualizado
    @Override
    public String toString() {
        return String.format(
            "Libro: %s | Autor: %s | ISBN: %s | Año: %d | Categoría: %s | Disponible: %s",
            titulo, autor, isbn, añoPublicacion, categoria, disponible ? "Sí" : "No"
        );
    }
}
