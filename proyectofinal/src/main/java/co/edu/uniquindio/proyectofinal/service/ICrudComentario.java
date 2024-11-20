package co.edu.uniquindio.proyectofinal.service;

import co.edu.uniquindio.proyectofinal.model.Comentario;
import co.edu.uniquindio.proyectofinal.model.Producto;

import java.util.List;

public interface ICrudComentario {
    boolean crearComentario(Comentario newComentario);
    boolean eliminarComentario(Comentario newComentario);
    boolean actualizarComentario(Comentario comentario, String contenido);
    Comentario buscarComentarioPorContenido(String contenido);
    boolean verificarComentarioExistente(String contenido);
}
