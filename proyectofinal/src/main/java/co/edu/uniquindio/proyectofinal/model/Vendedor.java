package co.edu.uniquindio.proyectofinal.model;

import co.edu.uniquindio.proyectofinal.model.builder.Persona;
import co.edu.uniquindio.proyectofinal.model.builder.ProductoBuilder;

import java.util.List;

public class Vendedor extends Persona {

    private List<Producto> productos;
    private List<Vendedor> aliados;
    public Vendedor(PersonaBuilder builder) {
        super(builder);
        this.productos = productos;
        this.aliados = aliados;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public static ProductoBuilder builder() { return new ProductoBuilder(); }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public List<Vendedor> getAliados() {
        return aliados;
    }

    public void setAliados(List<Vendedor> aliados) {
        this.aliados = aliados;
    }

    public boolean agregarAliado(Vendedor aliado) {
        if (!aliados.contains(aliado) && !this.equals(aliado)) {
            aliados.add(aliado);
            aliado.getAliados().add(this); // Relación bidireccional
            return true;
        }
        return false;
    }

    public boolean eliminarAliado(Vendedor aliado) {
        if (aliados.contains(aliado)) {
            aliados.remove(aliado);
            aliado.getAliados().remove(this); // Romper relación bidireccional
            return true;
        }
        return false;
    }
}
