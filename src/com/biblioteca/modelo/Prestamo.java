package com.biblioteca.modelo;

import java.time.LocalDate;

/**
 * Representa un préstamo de libro
 */
public class Prestamo {
    private Libro libro;
    private String usuario;
    private LocalDate fechaPrestamo;
    private LocalDate fechaLimite;
    private LocalDate fechaDevolucion;
    private boolean activo;

    public Prestamo(Libro libro, String usuario) {
        this.libro = libro;
        this.usuario = usuario;
        this.fechaPrestamo = LocalDate.now();
        this.fechaLimite = this.fechaPrestamo.plusDays(15); //Plazo
        this.fechaDevolucion = null;
        this.activo = true;
    }

    public LocalDate getFechaLimite() {
        return fechaLimite;
    }
    
    public Libro getLibro() {
        return libro;
    }
    
    public void setLibro(Libro libro) {
        this.libro = libro;
    }
    
    public String getUsuario() {
        return usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }
    
    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }
    
    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }
    
    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
    
    public boolean isActivo() {
        return activo;
    }
    
    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    public void finalizar() {
        this.activo = false;
        this.fechaDevolucion = LocalDate.now();
    }
    
    @Override
    public String toString() {
        return String.format("Usuario: %s | Libro: %s | Fecha préstamo: %s | Estado: %s",
                usuario, libro.getTitulo(), fechaPrestamo, activo ? "Activo" : "Finalizado");
    }
}
