package co.edu.uniquindio.proyectofinal.model;

import co.edu.uniquindio.proyectofinal.model.builder.VendedorBuilder;

import java.time.LocalDateTime;

public class Comentario {
    private String contenido;
    private VendedorBuilder autor; // Referencia a la clase vendedorBuilder
    private Producto producto; // Producto asociado al comentario
    private LocalDateTime fechaHora; // Fecha y hora del comentario

    public Comentario(String contenido, VendedorBuilder autor, Producto producto, LocalDateTime fechaHora) {
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

    public VendedorBuilder getAutor() {
        return autor;
    }

    public void setAutor(VendedorBuilder autor) {
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



