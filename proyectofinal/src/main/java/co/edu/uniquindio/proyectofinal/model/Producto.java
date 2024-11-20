package co.edu.uniquindio.proyectofinal.model;

import co.edu.uniquindio.proyectofinal.model.builder.ProductoBuilder;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Producto {
    private String idProducto;
    private String nombre;
    private String imagen;
    private String categoria;
    private double precio;
    private EstadoProducto estadoProducto;
    private LocalDateTime fechaHoraPublicacion;
    private List<Comentario> comentarios;


    public Producto(String idProducto, String nombre, String imagen, String categoria, double precio, EstadoProducto estadoProducto, LocalDateTime fechaHoraPublicacion, List<Comentario> comentarios) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.imagen = imagen;
        this.categoria = categoria;
        this.precio = precio;
        this.estadoProducto = estadoProducto;
        this.fechaHoraPublicacion = fechaHoraPublicacion;
        this.comentarios = new ArrayList<>();
    }

    public static ProductoBuilder builder() {
        return new ProductoBuilder();
    }

    public String getIdProducto() { return idProducto; }

    public void setIdProducto(String idProducto) { this.idProducto = idProducto; }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public EstadoProducto getEstadoProducto() {
        return estadoProducto;
    }

    public void setEstadoProducto(EstadoProducto estadoProducto) {
        this.estadoProducto = estadoProducto;
    }

    public LocalDateTime getFechaHoraPublicacion() {
        return fechaHoraPublicacion;
    }

    public void setFechaHoraPublicacion(LocalDateTime fechaPublicacion) {
        this.fechaHoraPublicacion = fechaHoraPublicacion;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void agregarComentario(Comentario comentario) {
        this.comentarios.add(comentario);
    }

    public void cambiarEstado(){}

    @Override
    public String toString() {
        return "Producto{" +
                "idProducto='" + idProducto + '\'' +
                ", nombre='" + nombre + '\'' +
                ", imagen='" + imagen + '\'' +
                ", categoria='" + categoria + '\'' +
                ", precio=" + precio +
                ", estadoProducto=" + estadoProducto +
                ", fechaHoraPublicacion=" + fechaHoraPublicacion +
                ", comentarios=" + comentarios +
                '}';
    }
}
