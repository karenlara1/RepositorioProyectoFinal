package co.edu.uniquindio.proyectofinal.model.builder;

import co.edu.uniquindio.proyectofinal.model.Comentario;
import co.edu.uniquindio.proyectofinal.model.Producto;
import co.edu.uniquindio.proyectofinal.model.Vendedor;

import java.time.LocalDateTime;
import java.util.List;

public class ComentarioBuilder {
    protected String contenido;
    protected Vendedor autor;
    protected Producto producto;
    protected LocalDateTime fechaHora;
    protected List<Vendedor> meGustas;

    public ComentarioBuilder contenido(String contenido) {
        this.contenido = contenido;
        return this;
    }

    public ComentarioBuilder autor(Vendedor autor) {
        this.autor = autor;
        return this;
    }

    public ComentarioBuilder producto(Producto producto) {
        this.producto = producto;
        return this;
    }

    public ComentarioBuilder fechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
        return this;
    }

    public ComentarioBuilder meGustas(List<Vendedor> meGustas) {
        this.meGustas = meGustas;
        return this;
    }

    public Comentario build() { return new Comentario(contenido, autor, producto, fechaHora, meGustas); }
}
