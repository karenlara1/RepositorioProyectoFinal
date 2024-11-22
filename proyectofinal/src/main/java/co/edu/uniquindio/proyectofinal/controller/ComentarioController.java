package co.edu.uniquindio.proyectofinal.controller;

import co.edu.uniquindio.proyectofinal.factory.ModelFactory;
import co.edu.uniquindio.proyectofinal.mapping.dto.ComentarioDto;
import co.edu.uniquindio.proyectofinal.service.IComentarioControllerService;

import java.util.List;

public class ComentarioController implements IComentarioControllerService {
    ModelFactory modelFactory;

    public ComentarioController() { modelFactory = ModelFactory.getInstance(); }

    @Override
    public List<ComentarioDto> getComentariosDto() { return modelFactory.getComentariosDto(); }

    @Override
    public boolean agregarComentario(ComentarioDto comentarioDto) { return modelFactory.agregarComentario(comentarioDto); }

    @Override
    public boolean eliminarComentarios(String contenido) { return modelFactory.eliminarComentarios(contenido); }

    @Override
    public boolean actualizarComentario(String contenido, ComentarioDto comentarioDto) { return modelFactory.actualizarComentario(contenido, comentarioDto); }

}
