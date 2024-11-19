package co.edu.uniquindio.proyectofinal.mapping.dto;

import co.edu.uniquindio.proyectofinal.model.EstadoProducto;

public record ProductoDto(
        String nombre,
        String imagen,
        String categoria,
        double precio,
        EstadoProducto estadoProducto,



) {
}
