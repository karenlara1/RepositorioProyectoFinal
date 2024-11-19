package co.edu.uniquindio.proyectofinal.service;

import co.edu.uniquindio.proyectofinal.mapping.dto.ComentarioDto;
import co.edu.uniquindio.proyectofinal.model.Comentario;

import java.util.List;

public interface IComentarioMapping {
    List<ComentarioDto> getComentariosDto(List<Comentario> comentarios);
    ComentarioDto comentarioToComentarioDto(Comentario comentario);
    Comentario comentarioDtoToComentario(ComentarioDto comentario);
}
