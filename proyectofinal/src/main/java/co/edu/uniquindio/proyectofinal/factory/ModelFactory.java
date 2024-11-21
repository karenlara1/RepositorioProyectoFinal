package co.edu.uniquindio.proyectofinal.factory;

import co.edu.uniquindio.proyectofinal.mapping.dto.ComentarioDto;
import co.edu.uniquindio.proyectofinal.mapping.dto.ProductoDto;
import co.edu.uniquindio.proyectofinal.mapping.dto.VendedorDto;
import co.edu.uniquindio.proyectofinal.mapping.mapper.MarketPlaceMappinglmpl;
import co.edu.uniquindio.proyectofinal.model.Comentario;
import co.edu.uniquindio.proyectofinal.model.MarketPlace;
import co.edu.uniquindio.proyectofinal.model.Producto;
import co.edu.uniquindio.proyectofinal.model.Vendedor;
import co.edu.uniquindio.proyectofinal.service.IModelFactoryService;

import java.util.List;

public class ModelFactory  implements IModelFactoryService {
    private static ModelFactory instance;
    MarketPlace marketPlace;
    MarketPlaceMappinglmpl mapper;

    public static ModelFactory getInstance() {
        if (instance == null) {
            instance = new ModelFactory();
        }
        return instance;
    }

    private ModelFactory() {
        mapper = new MarketPlaceMappinglmpl();
        marketPlace = inicializarDatos();
    }

    @Override
    public List<ProductoDto> getProductosDto() { return mapper.getProductosDto(getMarketPlace().getListProductos()); }

    @Override
    public boolean agregarProducto(ProductoDto productoDto) {
        if(getMarketPlace().verificarProductoExistente(productoDto.idProducto())) {
            Producto newProducto = mapper.productoDtoToProducto(productoDto);

            getMarketPlace().crearProducto(newProducto);
            return true;
        }
        return false;
    }

    @Override
    public boolean actualizarProducto(String idActual, ProductoDto productoDto) {
        if(!getMarketPlace().verificarProductoExistente(idActual)) {
            Producto newProducto = mapper.productoDtoToProducto(productoDto);

            getMarketPlace().actualizarProducto(idActual, newProducto);
            return true;
        }
        return false;
    }

    @Override
    public boolean eliminarProducto(String idProducto) {
        return getMarketPlace().eliminarProducto(idProducto);

    }

    @Override
    public List<VendedorDto> getVendedoresDto() { return mapper.getVendedoresDto(getMarketPlace().getListVendedores()); }

    @Override
    public boolean agregarVendedor(VendedorDto vendedorDto) {
        if(getMarketPlace().verificarComentarioExistente(vendedorDto.usuario().getUsuario())) {
            Vendedor newVendedor = mapper.vendedorDtoToVendedor(vendedorDto);

            getMarketPlace().crearVendedor(newVendedor);
            return true;
        }
        return false;
    }

    @Override
    public boolean actualizarVendedor(String usuario, VendedorDto vendedorDto) {
        if(!getMarketPlace().verificarVendedorExistente(usuario)) {
            Vendedor newVendedor = mapper.vendedorDtoToVendedor(vendedorDto);

            getMarketPlace().actualizarVendedor(usuario, newVendedor);
            return true;
        }
        return false;
    }

    @Override
    public boolean eliminarVendedor(String usuario) {
        return getMarketPlace().eliminarVendedor(usuario);
    }

    @Override
    public List<ComentarioDto> getComentariosDto() { return mapper.getComentariosDto(getMarketPlace().getListComentarios()); }

    @Override
    public boolean agregarComentario(ComentarioDto comentarioDto) {
        if(getMarketPlace().verificarComentarioExistente(comentarioDto.contenido())) {
            Comentario newComentario = mapper.comentarioDtoToComentario(comentarioDto);

            getMarketPlace().crearComentario(newComentario);
            return true;
        }
        return false;
    }

    @Override
    public boolean actualizarComentario(String contenido, ComentarioDto comentarioDto) {
        if(!getMarketPlace().verificarComentarioExistente(contenido)) {
            Comentario newComentario = mapper.comentarioDtoToComentario(comentarioDto);

            getMarketPlace().actualizarComentario(newComentario, contenido);
            return true;
        }
        return false;
    }

    @Override
    public boolean eliminarComentario(String contenido) {
        return getMarketPlace().eliminarComentario(contenido);
    }






    public static MarketPlace inicializarDatos() {
        MarketPlace marketPlace = new MarketPlace();
        return marketPlace;
    }

    public MarketPlace getMarketPlace() {
        return marketPlace;
    }

    public void setMarketPlace(MarketPlace marketPlace) {
        this.marketPlace = marketPlace;
    }
}
