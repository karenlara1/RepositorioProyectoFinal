package co.edu.uniquindio.proyectofinal.service.strategy;

import co.edu.uniquindio.proyectofinal.model.Vendedor;

import java.util.List;
import java.util.stream.Collectors;

public class ContactosPorVendedor implements  IEstadistica {

    @Override
    public Object calcular(List<Vendedor> vendedores) {
        return vendedores.stream()
                .collect(Collectors.toMap(vendedor -> vendedor, vendedor -> vendedor.getContactos().size()));
    }
}
