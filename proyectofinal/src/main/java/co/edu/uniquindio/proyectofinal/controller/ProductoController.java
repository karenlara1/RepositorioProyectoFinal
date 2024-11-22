package co.edu.uniquindio.proyectofinal.controller;

import co.edu.uniquindio.proyectofinal.factory.ModelFactory;
import co.edu.uniquindio.proyectofinal.mapping.dto.ProductoDto;
import co.edu.uniquindio.proyectofinal.service.IProductoControllerService;

import java.util.List;

public class ProductoController implements IProductoControllerService {
    ModelFactory modelFactory;

    public ProductoController(){
        modelFactory = ModelFactory.getInstance();
    }


    @Override
    public List<ProductoDto> getProductosDto() {
        return modelFactory.getProductosDto();
    }

    @Override
    public boolean agregarProducto(ProductoDto productoDto) {
        return modelFactory.agregarProducto(productoDto);
    }

    @Override
    public boolean eliminarProducto(String idProducto) {
        return modelFactory.eliminarProducto(idProducto);
    }

    @Override
    public boolean actualizarProducto(String idActual, ProductoDto productoDto) {
        return modelFactory.actualizarProducto(idActual, productoDto);
    }
}
