package co.edu.uniquindio.proyectofinal.model.builder;

public class AdministradorBuilder extends Persona{

    protected AdministradorBuilder(AdministradorBuilder builder) {
        super(builder);
    }

    public static class AdministradorBuilder extends PersonaBuilder {

        @Override
        public co.edu.uniquindio.proyectofinal.model.builder.AdministradorBuilder build() {
            return new co.edu.uniquindio.proyectofinal.model.builder.AdministradorBuilder(this);
        }
    }

    public static AdministradorBuilder builder() {
        return new AdministradorBuilder();
    }
}
