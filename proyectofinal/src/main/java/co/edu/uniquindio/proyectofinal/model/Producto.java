package co.edu.uniquindio.proyectofinal.model;

import java.time.LocalDateTime;

public class Producto {

    private String nombre;
    private String imagen;
    private String descripcion;
    private String categoria;
    private EstadoProducto estado;
    private LocalDateTime fechaPublicacion;

    public Producto(String nombre, String imagen, String descripcion, String categoria,
                    EstadoProducto estado, LocalDateTime fechaPublicacion){

        this.nombre = nombre;
        this.imagen = imagen;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.estado = estado;
        this.fechaPublicacion = fechaPublicacion;
    }

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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public EstadoProducto getEstado() {
        return estado;
    }

    public void setEstado(EstadoProducto estado) {
        this.estado = estado;
    }

    public LocalDateTime getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDateTime fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
}
