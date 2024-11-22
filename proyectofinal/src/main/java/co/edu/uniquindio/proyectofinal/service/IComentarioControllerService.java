package co.edu.uniquindio.proyectofinal.service;

import co.edu.uniquindio.proyectofinal.mapping.dto.ComentarioDto;

import java.util.List;

public interface IComentarioControllerService {
    List<ComentarioDto> getComentariosDto();
    boolean agregarComentario(ComentarioDto comentarioDto);
    boolean actualizarComentario(String contenido, ComentarioDto comentarioDto);
    boolean eliminarComentarios(String contenido);
}
