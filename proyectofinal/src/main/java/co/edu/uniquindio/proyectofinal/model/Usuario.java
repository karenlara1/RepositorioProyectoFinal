package co.edu.uniquindio.proyectofinal.model;

import co.edu.uniquindio.proyectofinal.model.builder.Persona;
import co.edu.uniquindio.proyectofinal.model.builder.ProductoBuilder;
import co.edu.uniquindio.proyectofinal.model.builder.UsuarioBuilder;

public class Usuario {

    private String usuario;
    private String contrasena;
    private Persona persona;

    public Usuario(String usuario, String contrasena, Persona persona){
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.persona = persona;
    }

    public static UsuarioBuilder builder(){ return new UsuarioBuilder(); }

    public String getUsuario(){
        return usuario;
    }

    public String getContrasena(){
        return contrasena;
    }

    public Persona getPersona(){
        return persona;
    }

    public void setPersona (Persona persona){
        this.persona = persona;
        if (persona != null && persona.getUsuario() != this) {
            persona.setUsuario (this);
        }

    }

    public String toString(){

        return "Usuario{" +
                "username='" + usuario + '\'' +
                ", password='" + contrasena + '\'' +
                (persona != null ? ", persona=" + persona.getNombre() + " " + persona.getApellido() : "") +
                '}';
    }

}