package co.edu.uniquindio.proyectofinal.mapping.dto;

import co.edu.uniquindio.proyectofinal.model.Vendedor;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record ComentarioDto(
        String contenido,
        Vendedor autor,
        LocalDateTime fechaHora
) {
}
