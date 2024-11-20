package co.edu.uniquindio.proyectofinal.model.builder;

public class AdministradorBuilder extends Persona{

    protected AdministradorBuilder(administradorBuilder builder) {
        super(builder);
    }

    public static class administradorBuilder extends PersonaBuilder {

        @Override
        public co.edu.uniquindio.proyectofinal.model.builder.AdministradorBuilder build() {
            return new co.edu.uniquindio.proyectofinal.model.builder.AdministradorBuilder(this);
        }
    }

    public static administradorBuilder builder() {
        return new administradorBuilder();
    }
}
