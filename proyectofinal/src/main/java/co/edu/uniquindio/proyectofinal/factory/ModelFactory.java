package co.edu.uniquindio.proyectofinal.factory;

import co.edu.uniquindio.proyectofinal.mapping.dto.ComentarioDto;
import co.edu.uniquindio.proyectofinal.mapping.dto.ProductoDto;
import co.edu.uniquindio.proyectofinal.mapping.dto.VendedorDto;
import co.edu.uniquindio.proyectofinal.mapping.mapper.MarketPlaceMappinglmpl;
import co.edu.uniquindio.proyectofinal.model.*;
import co.edu.uniquindio.proyectofinal.service.IModelFactoryService;

import java.time.LocalDateTime;
import java.util.ArrayList;
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
    public boolean eliminarComentarios(String contenido) { return getInstance().eliminarComentarios(contenido); }

    public static MarketPlace inicializarDatos() {
        MarketPlace marketPlace = new MarketPlace();
        marketPlace.setNombre("MarketPlace");

        Usuario newUsuario = Usuario.builder()
                .usuario("ZM")
                .contrasena("123")
                .build();

        Usuario newUsuario2 = Usuario.builder()
                .usuario("ValenLeon")
                .build();

        Usuario newUsuario3 = Usuario.builder()
                .usuario("Alex1210")
                .build();

        Vendedor vendedor = (Vendedor) new co.edu.uniquindio.proyectofinal.model.builder.Vendedor.VendedorBuilder()
                .nombre("Mariana")
                .apellido("Mejia")
                .cedula("1090587415")
                .direccion("La isabela")
                .usuario(newUsuario)
                .build();

        Vendedor vendedor2 = (Vendedor) new co.edu.uniquindio.proyectofinal.model.builder.Vendedor.VendedorBuilder()
                .nombre("Valentina")
                .apellido("Leon")
                .cedula("1090677415")
                .direccion("La isabela")
                .usuario(newUsuario2)
                .build();

        Vendedor vendedor3 = (Vendedor) new co.edu.uniquindio.proyectofinal.model.builder.Vendedor.VendedorBuilder()
                .nombre("Alex David")
                .apellido("Gutierrez")
                .cedula("1090677499")
                .direccion("La Fachada")
                .usuario(newUsuario3)
                .build();

        Producto newProducto = Producto.builder()
                .idProducto("1")
                .nombre("Xbox")
                .imagen("Imagen de xbox")
                .categoria("Consola de videojuegos")
                .precio(2000.0)
                .estadoProducto(EstadoProducto.PUBLICADO)
                .fechaPublicacion(LocalDateTime.now())
                .vendedor(vendedor)
                .build();

        Producto newProducto2 = Producto.builder()
                .idProducto("2")
                .nombre("Iphone")
                .imagen("Imagen de Iphone")
                .categoria("Celular")
                .precio(3000.0)
                .estadoProducto(EstadoProducto.VENDIDO)
                .fechaPublicacion(LocalDateTime.now())
                .vendedor(vendedor2)
                .build();

        Producto newProducto3 = Producto.builder()
                .idProducto("3")
                .nombre("Portatil acer nitro 5")
                .imagen("Imagen de portatil")
                .categoria("Computador")
                .precio(4000.0)
                .estadoProducto(EstadoProducto.PUBLICADO)
                .fechaPublicacion(LocalDateTime.now())
                .vendedor(vendedor3)
                .build();

        Vendedor autorComentario = (Vendedor) new co.edu.uniquindio.proyectofinal.model.builder.Vendedor.VendedorBuilder()
                .nombre("Mateo")
                .apellido("Villegas")
                .build();

        Vendedor autorComentario2 = (Vendedor) new co.edu.uniquindio.proyectofinal.model.builder.Vendedor.VendedorBuilder()
                .nombre("Ricardo")
                .apellido("Herrera")
                .build();

        Vendedor autorComentario3 = (Vendedor) new co.edu.uniquindio.proyectofinal.model.builder.Vendedor.VendedorBuilder()
                .nombre("Deivid Mateo")
                .apellido("Cañan")
                .build();

        Comentario newComentario = Comentario.builder()
                .contenido("¿Cuanto tiempo de uso tiene?")
                .autor(autorComentario)
                .producto(newProducto)
                .fechaHora(LocalDateTime.now().plusHours(2))
                .meGustas(new ArrayList<>())
                .build();

        Comentario newComentario2 = Comentario.builder()
                .contenido("Muy buen producto?")
                .autor(autorComentario2)
                .producto(newProducto2)
                .fechaHora(LocalDateTime.now().plusHours(1))
                .meGustas(new ArrayList<>())
                .build();

        Comentario newComentario3 = Comentario.builder()
                .contenido("Muy buen producto?")
                .autor(autorComentario3)
                .producto(newProducto3)
                .fechaHora(LocalDateTime.now().plusHours(5))
                .meGustas(new ArrayList<>())
                .build();

        newProducto.agregarComentario(newComentario);
        newProducto.agregarComentario(newComentario2);
        newProducto.agregarComentario(newComentario3);
        marketPlace.getListProductos().add(newProducto);
        marketPlace.getListProductos().add(newProducto2);
        marketPlace.getListProductos().add(newProducto3);
        marketPlace.getListVendedores().add(autorComentario);
        marketPlace.getListVendedores().add(autorComentario2);
        marketPlace.getListVendedores().add(autorComentario3);
        marketPlace.getListComentarios().add(newComentario);
        marketPlace.getListComentarios().add(newComentario2);
        marketPlace.getListComentarios().add(newComentario3);

        return marketPlace;
    }

    public MarketPlace getMarketPlace() {
        return marketPlace;
    }

    public void setMarketPlace(MarketPlace marketPlace) {
        this.marketPlace = marketPlace;
    }
}
