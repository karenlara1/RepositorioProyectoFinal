package co.edu.uniquindio.proyectofinal.model.builder;

import co.edu.uniquindio.proyectofinal.model.Comentario;
import co.edu.uniquindio.proyectofinal.model.EstadoProducto;
import co.edu.uniquindio.proyectofinal.model.Producto;
import co.edu.uniquindio.proyectofinal.model.Vendedor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ProductoBuilder implements Cloneable {
    protected String idProducto;
    protected String nombre;
    protected String imagen;
    protected String categoria;
    protected double precio;
    protected EstadoProducto estadoProducto;
    protected LocalDateTime fechaPublicacion;
    protected List<Comentario> comentarios;
    protected Vendedor vendedor;

    public ProductoBuilder idProducto(String idProducto) {
        this.idProducto = idProducto;
        return this;
    }
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

    public ProductoBuilder vendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
        return this;
    }

    public Producto build(){ return new Producto(idProducto, nombre, imagen, categoria, precio, estadoProducto, fechaPublicacion, comentarios, vendedor); }

    // Implementación del método clone() para el patrón Prototype
    @Override
    public ProductoBuilder clone() {
        try {
            ProductoBuilder cloned = (ProductoBuilder) super.clone();
            // Clonar listas y objetos para evitar referencias compartidas
            cloned.comentarios = this.comentarios != null ? new ArrayList<>(this.comentarios) : null;
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Error al clonar el ProductoBuilder", e);
        }
    }
}
