package co.edu.uniquindio.proyectofinal.model;

import co.edu.uniquindio.proyectofinal.model.builder.ProductoBuilder;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Producto implements Cloneable{
    private String idProducto;
    private String nombre;
    private String imagen;
    private String categoria;
    private double precio;
    private EstadoProducto estadoProducto;
    private LocalDateTime fechaHoraPublicacion;
    private List<Comentario> comentarios;
    private Vendedor vendedor;
    private int meGustas;


    public Producto(String idProducto, String nombre, String imagen, String categoria, double precio, EstadoProducto estadoProducto, LocalDateTime fechaHoraPublicacion, List<Comentario> comentarios, Vendedor vendedor) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.imagen = imagen;
        this.categoria = categoria;
        this.precio = precio;
        this.estadoProducto = estadoProducto;
        this.fechaHoraPublicacion = fechaHoraPublicacion;
        this.comentarios = new ArrayList<>();
        this.vendedor = vendedor;
        this.meGustas = 0;
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

    public Vendedor getVendedor() { return vendedor; }

    public void setVendedor(Vendedor vendedor) { this.vendedor = vendedor; }

    public int getMeGustas() { return meGustas; }

    public void setMeGustas(int meGustas) { this.meGustas = meGustas; }

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

    public void incrementarMeGustas() {
        this.meGustas++;
    }

    public void reiniciarMeGustas() {
        this.meGustas = 0;
    }

    // Implementación del método clone()
    @Override
    public Producto clone() {
        try {
            return (Producto) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Error al clonar el producto", e);
        }
    }

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
                ", vendedor=" + vendedor +
                ", meGustas=" + meGustas +
                '}';
    }
}
