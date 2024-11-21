package co.edu.uniquindio.proyectofinal.model;

import co.edu.uniquindio.proyectofinal.model.builder.Persona;
import co.edu.uniquindio.proyectofinal.model.builder.ProductoBuilder;
import co.edu.uniquindio.proyectofinal.model.builder.UsuarioBuilder;

public class Usuario {

    private String usuario;
    private String contrasena;
    private Persona persona;
    private boolean autenticado;

    public Usuario(String usuario, String contrasena, Persona persona){
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.persona = persona;
        this.autenticado = false;
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


    public void add(Vendedor contacto) {
    }

    //Método para autenticar usuario dadas las credenciales
    public boolean autenticar(String usuarioIngresado, String contrasenaIngresada) {
        if (this.usuario.equals(usuarioIngresado) && this.contrasena.equals(contrasenaIngresada)) {
            this.autenticado = true; // Se autentica correctamente
            return true;
        } else {
            this.autenticado = false; // Falla en la autenticación
            return false;
        }
    }

    // Método para verificar si el usuario está autenticado
    public boolean estaAutenticado() {
        return this.autenticado;
    }

    // Método para cerrar sesión
    public void cerrarSesion() {
        this.autenticado = false;
    }
}