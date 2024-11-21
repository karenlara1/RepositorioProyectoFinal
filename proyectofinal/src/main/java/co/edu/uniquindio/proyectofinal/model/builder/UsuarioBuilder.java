package co.edu.uniquindio.proyectofinal.model.builder;

import co.edu.uniquindio.proyectofinal.model.Usuario;

public class UsuarioBuilder {
    protected String usuario;
    protected String contrasena;
    protected Persona persona;

    public UsuarioBuilder usuario(String usuario) {
        this.usuario = usuario;
        return this;
    }

    public UsuarioBuilder contrasena(String contrasena) {
        this.contrasena = contrasena;
        return this;
    }

    public UsuarioBuilder persona(Persona persona) {
        this.persona = persona;
        return this;
    }

    public Usuario build() { return new Usuario(usuario, contrasena, persona); }
}

