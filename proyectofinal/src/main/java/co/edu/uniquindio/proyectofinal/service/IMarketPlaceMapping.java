package co.edu.uniquindio.proyectofinal.service;

import co.edu.uniquindio.proyectofinal.mapping.dto.ComentarioDto;
import co.edu.uniquindio.proyectofinal.mapping.dto.ProductoDto;
import co.edu.uniquindio.proyectofinal.mapping.dto.VendedorDto;
import co.edu.uniquindio.proyectofinal.model.Comentario;
import co.edu.uniquindio.proyectofinal.model.Producto;
import co.edu.uniquindio.proyectofinal.model.Vendedor;

import java.util.List;

public interface IMarketPlaceMapping {
    List<VendedorDto> getVendedoresDto(List<Vendedor> vendedores);
    VendedorDto vendedorToVendedorDto(Vendedor vendedor);
    Vendedor vendedorDtoToVendedor(VendedorDto vendedor);

    List<ProductoDto> getProductosDto(List<Producto> productos);
    ProductoDto productoToProductoDto(Producto producto);
    Producto productoDtoToProducto(ProductoDto productoDto);

    List<ComentarioDto> getComentariosDto(List<Comentario> comentarios);
    ComentarioDto comentarioToComentarioDto(Comentario comentario);
    Comentario comentarioDtoToComentario(ComentarioDto comentario);
}
