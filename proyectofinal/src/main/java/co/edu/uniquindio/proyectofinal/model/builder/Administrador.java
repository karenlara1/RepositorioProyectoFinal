package co.edu.uniquindio.proyectofinal.model.builder;

public class Administrador extends Persona {

    private Administrador(AdministradorBuilder builder) {
        super(builder);
    }

    public static class AdministradorBuilder extends PersonaBuilder {

        @Override
        protected AdministradorBuilder thisBuilder() {
            return this;
        }

        public Administrador build() {
            return new Administrador(this);
        }
    }
}
