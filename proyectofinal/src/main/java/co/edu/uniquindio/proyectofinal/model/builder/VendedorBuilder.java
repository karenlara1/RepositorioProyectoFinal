package co.edu.uniquindio.proyectofinal.model.builder;

public class VendedorBuilder extends Persona{

    protected VendedorBuilder(vendedorBuilder builder){
        super(builder);
    }

    public static class vendedorBuilder extends PersonaBuilder {

        @Override
        public co.edu.uniquindio.proyectofinal.model.builder.VendedorBuilder build(){
            return new co.edu.uniquindio.proyectofinal.model.builder.VendedorBuilder(this);
        }
    }

    public static vendedorBuilder builder(){
        return new vendedorBuilder();
    }

    @Override
    public String toString() {
        return "vendedorBuilder{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cedula='" + cedula + '\'' +
                ", direccion='" + direccion + '\'' +
                ", usuario=" + usuario +
                '}';

    }
}
