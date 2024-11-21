package co.edu.uniquindio.proyectofinal.mapping.mapper;

import co.edu.uniquindio.proyectofinal.mapping.dto.ComentarioDto;
import co.edu.uniquindio.proyectofinal.mapping.dto.ProductoDto;
import co.edu.uniquindio.proyectofinal.mapping.dto.VendedorDto;
import co.edu.uniquindio.proyectofinal.model.Comentario;
import co.edu.uniquindio.proyectofinal.model.Producto;
import co.edu.uniquindio.proyectofinal.model.Vendedor;
import co.edu.uniquindio.proyectofinal.service.IMarketPlaceMapping;

import java.util.ArrayList;
import java.util.List;

public class MarketPlaceMappinglmpl implements IMarketPlaceMapping {

    @Override
    public List<ComentarioDto> getComentariosDto(List<Comentario> comentarios) {
        if (comentarios == null) {
            return null;
        }

        List<ComentarioDto> comentariosDto = new ArrayList<>();
        for (Comentario comentario : comentarios) {
            comentariosDto.add(comentarioToComentarioDto(comentario));
        }

        return comentariosDto;
    }

    @Override
    public ComentarioDto comentarioToComentarioDto(Comentario comentario) {
        return new ComentarioDto(
                comentario.getContenido(),
                comentario.getAutor(),
                comentario.getFechaHora()

        );
    }

    @Override
    public Comentario comentarioDtoToComentario(ComentarioDto comentarioDto) {
        return Comentario.builder()
                .contenido(comentarioDto.contenido())
                .autor(comentarioDto.autor())
                .fechaHora(comentarioDto.fechaHora())
                .build();
    }

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
                producto.getIdProducto(),
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

    @Override
    public List<VendedorDto> getVendedoresDto(List<Vendedor> vendedores) {
        if (vendedores == null){
            return null;
        }

        List<VendedorDto> vendedoresDto = new ArrayList<>();
        for (Vendedor vendedor : vendedores) {
            vendedoresDto.add(vendedorToVendedorDto(vendedor));
        }
        return vendedoresDto;
    }

    @Override
    public VendedorDto vendedorToVendedorDto(Vendedor vendedor) {
        return new VendedorDto(
                vendedor.getNombre(),
                vendedor.getApellido(),
                vendedor.getUsuario(),
                vendedor.getProductos()
        );
    }

    @Override
    public Vendedor vendedorDtoToVendedor(VendedorDto vendedorDto) {
        return (Vendedor) new co.edu.uniquindio.proyectofinal.model.builder.Vendedor.VendedorBuilder()
                .nombre(vendedorDto.nombre())
                .apellido(vendedorDto.apellido())
                .usuario(vendedorDto.usuario())
                .listProductos(vendedorDto.productos())
                .build();
    }

}
