package co.edu.uniquindio.proyectofinal.service.strategy;

import co.edu.uniquindio.proyectofinal.model.Vendedor;

import java.time.LocalDateTime;
import java.util.List;

public class ProductosPublicadosEntreFechas implements  IEstadistica {
    private LocalDateTime inicio;
    private LocalDateTime fin;

    public ProductosPublicadosEntreFechas(LocalDateTime inicio, LocalDateTime fin) {
        this.inicio = inicio;
        this.fin = fin;
    }

    @Override
    public Object calcular(List<Vendedor> vendedores) {
        return vendedores.stream()
                .flatMap(vendedor -> vendedor.getProductos().stream())
                .filter(producto -> !producto.getFechaHoraPublicacion().isBefore(inicio)
                        && !producto.getFechaHoraPublicacion().isAfter(fin))
                .mapToInt(producto -> 1)
                .sum();
    }
}
