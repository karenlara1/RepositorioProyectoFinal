package co.edu.uniquindio.proyectofinal.model.builder;

public class Administrador extends Persona{

    protected Administrador(AdministradorBuilder builder) {
        super(builder);
    }

    public static class AdministradorBuilder extends PersonaBuilder<AdministradorBuilder>{

        @Override
        public Administrador build() {
            return new Administrador(this);
        }
    }

    public static AdministradorBuilder builder() {
        return new AdministradorBuilder();
    }
}
