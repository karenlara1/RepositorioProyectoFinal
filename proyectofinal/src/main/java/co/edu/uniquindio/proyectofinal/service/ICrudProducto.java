package co.edu.uniquindio.proyectofinal.service;

import co.edu.uniquindio.proyectofinal.model.Producto;

public interface ICrudProducto {
    boolean crearProducto(Producto newProducto);
    boolean eliminarProducto(String id);
    boolean actualizarProducto(String idProducto, Producto producto);
    Producto buscarProducto(String id);
    boolean verificarProductoExistente(String idProducto);
}
