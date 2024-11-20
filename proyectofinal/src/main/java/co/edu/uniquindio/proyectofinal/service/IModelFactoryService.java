package co.edu.uniquindio.proyectofinal.service;

import co.edu.uniquindio.proyectofinal.mapping.dto.ProductoDto;

import java.util.List;

public interface IModelFactoryService {
    List<ProductoDto> getProductosDto();
    boolean agregarProducto(ProductoDto producto);
    boolean eliminarProducto(ProductoDto producto);
    boolean actualizarProducto(ProductoDto producto);
}
