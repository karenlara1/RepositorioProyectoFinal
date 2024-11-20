package co.edu.uniquindio.proyectofinal.model.composite;

import java.util.ArrayList;
import java.util.List;

public class Categoria implements IProducto{

    private List<IProducto> productos = new ArrayList<>();

    public void agregarProducto(IProducto producto) {
        productos.add(producto);
    }

    @Override
    public void mostrar() {
        System.out.println("Categoria: ");
        for (IProducto producto : productos) {
            producto.mostrar();
        }
    }
}
