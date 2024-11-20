package co.edu.uniquindio.proyectofinal.mapping.dto;

import co.edu.uniquindio.proyectofinal.model.Comentario;
import co.edu.uniquindio.proyectofinal.model.EstadoProducto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public record ProductoDto(
        String idProducto,
        String nombre,
        String imagen,
        String categoria,
        double precio,
        EstadoProducto estadoProducto,
        LocalDateTime fechaHoraPublicacion,
        List<Comentario> comentarios
) {
}
