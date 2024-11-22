package co.edu.uniquindio.proyectofinal.service.strategy;

import co.edu.uniquindio.proyectofinal.model.Vendedor;

import java.util.List;

public interface IEstadistica {
    Object calcular(List<Vendedor> vendedores); // Método genérico para estadísticas
}
