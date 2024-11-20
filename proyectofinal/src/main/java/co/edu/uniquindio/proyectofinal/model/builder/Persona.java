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

    protected Persona (PersonaBuilder<?> builder) {
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
    public static class PersonaBuilder <T extends PersonaBuilder<T>> {

        protected String nombre;
        protected String apellido;
        protected String cedula;
        protected String direccion;
        protected Usuario usuario;

        public T nombre (String nombre){
            this.nombre= nombre;
            return (T) this;
        }

        public PersonaBuilder apellido (String apellido) {
            this.apellido = apellido;
            return (T) this;
        }

        public T cedula (String cedula){
            this.cedula = cedula;
            return (T) this;
        }

        public T direccion (String direccion){
            this.direccion = direccion;
            return (T) this;
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

