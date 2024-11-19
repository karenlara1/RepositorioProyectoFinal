package co.edu.uniquindio.proyectofinal.mapping.mapper;

import co.edu.uniquindio.proyectofinal.mapping.dto.ProductoDto;
import co.edu.uniquindio.proyectofinal.model.Producto;
import co.edu.uniquindio.proyectofinal.service.IProductoMapping;

import java.util.ArrayList;
import java.util.List;

public class ProductoMappinglmpl implements IProductoMapping {
    @Override
    public List<ProductoDto> getProductosDto(List<Producto> listProductos) {
        if(listProductos==null){
            return null;
        }

        List<ProductoDto> productosDto = new ArrayList<>();
        for (Producto producto : listProductos) {
            productosDto.add(productoToProductoDto(producto));
        }

        return productosDto;
    }

    @Override
    public ProductoDto productoToProductoDto(Producto producto) {
        return new ProductoDto(
                producto.getNombre(),
                producto.getImagen(),
                producto.getCategoria(),
                producto.getPrecio(),
                producto.getEstadoProducto(),
                producto.getFechaHoraPublicacion(),
                producto.getComentarios()
        );
    }

    @Override
    public Producto productoDtoToProducto(ProductoDto productoDto) {
        return Producto.builder()
                .nombre(productoDto.nombre())
                .imagen(productoDto.imagen())
                .categoria(productoDto.categoria())
                .precio(productoDto.precio())
                .estadoProducto(productoDto.estadoProducto())
                .fechaPublicacion(productoDto.fechaHoraPublicacion())
                .comentarios(productoDto.comentarios())
                .build();
    }

}
