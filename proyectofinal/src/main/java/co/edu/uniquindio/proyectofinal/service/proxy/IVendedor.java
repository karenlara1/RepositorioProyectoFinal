package co.edu.uniquindio.proyectofinal.service.proxy;

import co.edu.uniquindio.proyectofinal.model.Producto;
import co.edu.uniquindio.proyectofinal.model.Vendedor;

import java.util.List;

public interface IVendedor {
    List<Producto> getProductos();
    void agregarContacto(Vendedor contacto);
}
