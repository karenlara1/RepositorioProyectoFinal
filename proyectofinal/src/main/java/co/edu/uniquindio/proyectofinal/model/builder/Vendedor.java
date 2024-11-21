package co.edu.uniquindio.proyectofinal.model.builder;

import co.edu.uniquindio.proyectofinal.model.Producto;

import java.util.List;

public class Vendedor extends Persona {

    private Vendedor(VendedorBuilder builder) {
        super(builder);
    }

    public static class VendedorBuilder extends PersonaBuilder {

        @Override
        protected VendedorBuilder thisBuilder() {
            return this;
        }

        public Vendedor build() {
            return new Vendedor(this);
        }
    }
}
