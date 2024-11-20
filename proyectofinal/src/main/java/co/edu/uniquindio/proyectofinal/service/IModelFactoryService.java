package co.edu.uniquindio.proyectofinal.service;

import co.edu.uniquindio.proyectofinal.mapping.dto.ComentarioDto;
import co.edu.uniquindio.proyectofinal.mapping.dto.ProductoDto;
import co.edu.uniquindio.proyectofinal.mapping.dto.VendedorDto;

import java.util.List;

public interface IModelFactoryService {
    List<ProductoDto> getProductosDto();
    boolean agregarProducto(ProductoDto productoDto);
    boolean eliminarProducto(String idProducto);
    boolean actualizarProducto(String idActual, ProductoDto productoDto);

    List<VendedorDto> getVendedoresDto();
    boolean agregarVendedor(VendedorDto vendedorDto);
    boolean eliminarVendedor(String usuario);
    boolean actualizarVendedor(String usuario, VendedorDto vendedorDto);

    List<ComentarioDto> getComentariosDto();
    boolean agregarComentario(ComentarioDto comentarioDto);
    boolean eliminarComentario(String contenido);
    boolean actualizarComentario(String contenido, ComentarioDto comentarioDto);

}
