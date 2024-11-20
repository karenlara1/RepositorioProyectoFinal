package co.edu.uniquindio.proyectofinal.model;

import co.edu.uniquindio.proyectofinal.model.builder.ComentarioBuilder;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Comentario {
    private String contenido;
    private Vendedor autor;
    private Producto producto;
    private LocalDateTime fechaHora;
    private List<Vendedor> meGustas;


    public Comentario(String contenido, Vendedor autor, Producto producto, LocalDateTime fechaHora, List<Vendedor> meGustas) {
        this.contenido = contenido;
        this.autor = autor;
        this.producto = producto;
        this.fechaHora = fechaHora;
        this.meGustas = new ArrayList<>();
    }

    public static ComentarioBuilder builder(){
        return new ComentarioBuilder();
    }

    // Getters y Setters
    public String getContenido() { return contenido; }
    public void setContenido(String contenido) { this.contenido = contenido; }

    public Vendedor getAutor() { return autor; }
    public void setAutor(Vendedor autor) { this.autor = autor; }

    public Producto getProducto() { return producto; }
    public void setProducto(Producto producto) { this.producto = producto; }

    public LocalDateTime getFechaHora() { return fechaHora; }
    public void setFechaHora(LocalDateTime fechaHora) { this.fechaHora = fechaHora; }

    public List<Vendedor> getMeGustas() { return meGustas; }
    public void agregarMeGusta(Vendedor vendedor) {
        if (!meGustas.contains(vendedor)) {
            meGustas.add(vendedor);
        }
    }

    @Override
    public String toString() {
        return "Comentario{" +
                "contenido='" + contenido + '\'' +
                ", autor=" + autor.getNombre() +
                ", fechaHora=" + fechaHora +
                '}';
    }
}



