package co.edu.uniquindio.proyectofinal.model.builder;

import co.edu.uniquindio.proyectofinal.model.Producto;

import java.util.List;

public class Vendedor extends Persona {
    private List<Producto> productos;
    private Vendedor(VendedorBuilder builder) {
        super(builder);
        this.productos = productos;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
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
