package co.edu.uniquindio.proyectofinal.factory;

import co.edu.uniquindio.proyectofinal.model.Vendedor;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Marketplace {
    private List<Vendedor> vendedores; // Lista de todos los vendedores

    public Marketplace() {
        this.vendedores = new ArrayList<>();
    }

    // Métodos de gestión de vendedores
    public boolean agregarVendedor(Vendedor vendedor) {
        if (!vendedores.contains(vendedor)) {
            vendedores.add(vendedor);
            return true;
        }
        return false;
    }

    public boolean establecerAlianza(Vendedor vendedor1, Vendedor vendedor2) {
        if (vendedor1 != null && vendedor2 != null && !vendedor1.equals(vendedor2)) {
            vendedor1.agregarContacto(vendedor2);
            vendedor2.agregarContacto(vendedor1);
            return true;
        }
        return false;
    }

    // Métodos de gestión de productos
    public boolean agregarProducto(String usuario, Producto producto) {
        Optional<Vendedor> vendedor = buscarVendedorPorUsuario(usuario);
        if (vendedor.isPresent()) {
            vendedor.get().agregarProducto(producto);
            return true;
        }
        return false;
    }

    public List<Producto> listarProductosDeRed(Vendedor vendedor) {
        List<Producto> productos = new ArrayList<>();
        vendedor.getContactos().forEach(contacto -> productos.addAll(contacto.getProductos()));
        productos.addAll(vendedor.getProductos());
        return productos;
    }

    // Métodos de gestión de comentarios
    public boolean agregarComentario(String productoId, Comentario comentario) {
        for (Vendedor vendedor : vendedores) {
            Optional<Producto> producto = vendedor.getProductos().stream()
                    .filter(p -> p.getId().equals(productoId))
                    .findFirst();
            if (producto.isPresent()) {
                producto.get().agregarComentario(comentario);
                return true;
            }
        }
        return false;
    }

    // Estadísticas y reportes
    public void generarReporteEstadisticas() {
        // Implementación para generar un reporte con estadísticas
    }

    @Override
    public String toString() {
        return "MarketplaceManager{" +
                "vendedores=" + vendedores +
                '}';
    }
}

