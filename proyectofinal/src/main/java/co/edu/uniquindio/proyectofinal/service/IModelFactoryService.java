package co.edu.uniquindio.proyectofinal.service;

import co.edu.uniquindio.proyectofinal.mapping.dto.UsuarioDto;

public interface IModelFactoryService {
    List<UsuarioDto> getUsuariosDto();
    boolean agregarUsuario(UsuarioDto usuario);
    boolean eliminarUsuario(UsuarioDto usuario);
    boolean actualizarUsuario(UsuarioDto usuario);
}
