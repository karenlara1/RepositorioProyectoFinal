package co.edu.uniquindio.proyectofinal.service.proxy;

import co.edu.uniquindio.proyectofinal.model.Producto;
import co.edu.uniquindio.proyectofinal.model.Vendedor;

import java.util.List;

public class VendedorReal implements IVendedor {
    private Vendedor vendedor;

    public VendedorReal(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    @Override
    public List<Producto> getProductos() {
        return vendedor.getProductos();
    }

    @Override
    public void agregarContacto(Vendedor contacto) {
        vendedor.getUsuario().add(contacto);
    }
}
