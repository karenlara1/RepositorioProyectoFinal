package co.edu.uniquindio.proyectofinal.model.builder;

public class Vendedor extends Persona{

    protected Vendedor (VendedorBuilder builder){
        super(builder);
    }

    public static class VendedorBuilder extends PersonaBuilder {

        @Override
        public Vendedor build(){
            return new Vendedor(this);
        }
    }

    public static VendedorBuilder builder(){
        return new VendedorBuilder();
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cedula='" + cedula + '\'' +
                ", direccion='" + direccion + '\'' +
                ", usuario=" + usuario +
                '}';

    }
}
