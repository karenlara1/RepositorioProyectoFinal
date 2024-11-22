package co.edu.uniquindio.proyectofinal.service.strategy;

import co.edu.uniquindio.proyectofinal.model.Producto;
import co.edu.uniquindio.proyectofinal.model.Vendedor;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TopProductosConMasMeGustas implements IEstadistica {
    private int topN;

    public TopProductosConMasMeGustas(int topN) {
        this.topN = topN;
    }

    @Override
    public Object calcular(List<Vendedor> vendedores) {
        return vendedores.stream()
                .flatMap(vendedor -> vendedor.getProductos().stream())
                .sorted(Comparator.comparingInt(Producto::getMeGustas).reversed())
                .limit(topN)
                .collect(Collectors.toList());
    }

}
