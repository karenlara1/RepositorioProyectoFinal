package co.edu.uniquindio.proyectofinal.model.builder;

import co.edu.uniquindio.proyectofinal.model.Usuario;

public class Persona {

    /*
        Se deben crear los atributos protegidos para que las clases que hereden puedan acceder
        directamente
         */
    protected String nombre;
    protected String apellido;
    protected String cedula;
    protected String direccion;
    protected Usuario usuario;

    protected Persona (PersonaBuilder builder) {
        this.nombre = builder.nombre;
        this.apellido = builder.apellido;
        this.cedula = builder.cedula;
        this.direccion = builder.direccion;
        this.usuario =  builder.usuario;
    }

    public Usuario getUsuario(){
        return usuario;
    }

    public void setUsuario (Usuario usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCedula() { return cedula; }

    public String getDireccion() { return direccion; }

    /**
     * Se crea el Builder estatico
     */
    public static class PersonaBuilder {

        protected String nombre;
        protected String apellido;
        protected String cedula;
        protected String direccion;
        protected Usuario usuario;

        public PersonaBuilder nombre (String nombre){
            this.nombre= nombre;
            return this;
        }

        public PersonaBuilder apellido (String apellido) {
            this.apellido = apellido;
            return this;
        }

        public PersonaBuilder cedula (String cedula){
            this.cedula = cedula;
            return this;
        }

        public PersonaBuilder direccion (String direccion){
            this.direccion = direccion;
            return this;
        }

        public Persona build(){
            return new Persona(this);
        }

        @Override
        public String toString() {
            return "Persona{" +
                    "nombre='" + nombre + '\'' +
                    ", apellido='" + apellido + '\'' +
                    ", cedula='" + cedula + '\'' +
                    ", direccion='" + direccion + '\'' +
                    (usuario != null ? ", usuario=" + usuario.getUsuario() : "") +
                    '}';
        }


    }

}

