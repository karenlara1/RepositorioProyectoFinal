package co.edu.uniquindio.proyectofinal.model;

import co.edu.uniquindio.proyectofinal.model.builder.Vendedor;

import java.time.LocalDateTime;

public class Comentario {
    private String contenido;
    private Vendedor autor; // Referencia a la clase Vendedor
    private Producto producto; // Producto asociado al comentario
    private LocalDateTime fechaHora; // Fecha y hora del comentario

    public Comentario(String contenido, Vendedor autor, Producto producto, LocalDateTime fechaHora) {
        this.contenido = contenido;
        this.autor = autor;
        this.producto = producto;
        this.fechaHora = fechaHora;
    }

    // Getters y Setters
    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Vendedor getAutor() {
        return autor;
    }

    public void setAutor(Vendedor autor) {
        this.autor = autor;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }
}



