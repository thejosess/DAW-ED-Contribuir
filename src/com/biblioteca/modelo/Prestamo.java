package com.biblioteca.modelo;

import java.time.LocalDate;

/**
 * Representa un préstamo de libro
 */
public class Prestamo {
    private Libro libro;
    private String usuario;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    private boolean activo;

    // NUEVOS CAMPOS
    private LocalDate fechaLimite;
    private boolean renovado;

    public Prestamo(Libro libro, String usuario) {
        this.libro = libro;
        this.usuario = usuario;
        this.fechaPrestamo = LocalDate.now();
        this.fechaDevolucion = null;
        this.activo = true;

        this.fechaLimite = fechaPrestamo.plusDays(7);
        this.renovado = false;
    }

    public Libro getLibro() {
        return libro;
    }

    public String getUsuario() {
        return usuario;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public boolean isActivo() {
        return activo;
    }

    public LocalDate getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(LocalDate fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public boolean isRenovado() {
        return renovado;
    }

    public void setRenovado(boolean renovado) {
        this.renovado = renovado;
    }

    public void finalizar() {
        this.activo = false;
        this.fechaDevolucion = LocalDate.now();
    }

    @Override
    public String toString() {
        return String.format(
                "Usuario: %s | Libro: %s | Fecha préstamo: %s | Fecha límite: %s | Estado: %s",
                usuario, libro.getTitulo(), fechaPrestamo, fechaLimite, activo ? "Activo" : "Finalizado"
        );
    }
}
