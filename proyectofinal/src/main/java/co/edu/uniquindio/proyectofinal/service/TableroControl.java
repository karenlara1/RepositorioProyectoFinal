package co.edu.uniquindio.proyectofinal.service;

import co.edu.uniquindio.proyectofinal.model.Vendedor;
import co.edu.uniquindio.proyectofinal.service.strategy.IEstadistica;

import java.util.List;

public class TableroControl {
    private List<Vendedor> vendedores;
    private IEstadistica estrategia; // Estrategia seleccionada

    // Constructor
    public TableroControl(List<Vendedor> vendedores) {
        this.vendedores = vendedores;
    }

    // Método para establecer la estrategia
    public void setEstrategia(IEstadistica estrategia) {
        this.estrategia = estrategia;
    }

    // Método para calcular usando la estrategia actual
    public Object calcularEstadistica() {
        if (estrategia == null) {
            throw new IllegalStateException("No se ha definido una estrategia");
        }
        return estrategia.calcular(vendedores);
    }

    // Getters y setters
    public List<Vendedor> getVendedores() {
        return vendedores;
    }

    public void setVendedores(List<Vendedor> vendedores) {
        this.vendedores = vendedores;
    }
}