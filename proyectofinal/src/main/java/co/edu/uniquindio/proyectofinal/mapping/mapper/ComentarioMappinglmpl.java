package co.edu.uniquindio.proyectofinal.mapping.mapper;

import co.edu.uniquindio.proyectofinal.mapping.dto.ComentarioDto;
import co.edu.uniquindio.proyectofinal.model.Comentario;
import co.edu.uniquindio.proyectofinal.service.IComentarioMapping;

import java.util.ArrayList;
import java.util.List;

public class ComentarioMappinglmpl implements IComentarioMapping {
    @Override
    public List<ComentarioDto> getComentariosDto(List<Comentario> comentarios) {
        if (comentarios == null) {
            return null;
        }

        List<ComentarioDto> comentariosDto = new ArrayList<>();
        for (Comentario comentario : comentarios) {
            comentariosDto.add(comentarioToComentarioDto(comentario));
        }

        return comentariosDto;
    }

    @Override
    public ComentarioDto comentarioToComentarioDto(Comentario comentario) {
        return new ComentarioDto(
                comentario.getContenido(),
                comentario.getAutor(),
                comentario.getFechaHora()

        );
    }

    @Override
    public Comentario comentarioDtoToComentario(ComentarioDto comentarioDto) {
        return Comentario.builder()
                .contenido(comentarioDto.contenido())
                .autor(comentarioDto.autor())
                .fechaHora(comentarioDto.fechaHora())
                .build();
    }

}


