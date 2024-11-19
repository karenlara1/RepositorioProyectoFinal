package co.edu.uniquindio.proyectofinal.model.builder;

import co.edu.uniquindio.proyectofinal.model.Comentario;
import co.edu.uniquindio.proyectofinal.model.EstadoProducto;
import co.edu.uniquindio.proyectofinal.model.Producto;

import java.time.LocalDateTime;
import java.util.List;

public class ProductoBuilder {
    protected String nombre;
    protected String imagen;
    protected String categoria;
    protected double precio;
    protected EstadoProducto estadoProducto;
    protected LocalDateTime fechaPublicacion;
    protected List<Comentario> comentarios;

    public ProductoBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public ProductoBuilder imagen(String imagen) {
        this.imagen = imagen;
        return this;
    }

    public ProductoBuilder categoria(String categoria) {
        this.categoria = categoria;
        return this;
    }

    public ProductoBuilder precio(double precio) {
        this.precio = precio;
        return this;
    }

    public ProductoBuilder estadoProducto(EstadoProducto estadoProducto) {
        this.estadoProducto = estadoProducto;
        return this;
    }

    public ProductoBuilder fechaPublicacion(LocalDateTime fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
        return this;
    }

    public ProductoBuilder comentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
        return this;
    }

    public Producto build(){ return new Producto(nombre, imagen, categoria, precio, estadoProducto, fechaPublicacion, comentarios); }
}
