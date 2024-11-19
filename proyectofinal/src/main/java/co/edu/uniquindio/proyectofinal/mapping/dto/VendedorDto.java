package co.edu.uniquindio.proyectofinal.mapping.dto;

import co.edu.uniquindio.proyectofinal.model.Producto;
import co.edu.uniquindio.proyectofinal.model.Usuario;

import java.util.List;

public record VendedorDto(
        String nombre,
        String apellido,
        Usuario usuario,
        List<Producto> productos
) {
}
