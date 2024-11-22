package co.edu.uniquindio.proyectofinal.viewController;

import co.edu.uniquindio.proyectofinal.model.EstadoProducto;
import co.edu.uniquindio.proyectofinal.model.Producto;
import co.edu.uniquindio.proyectofinal.model.Usuario;
import co.edu.uniquindio.proyectofinal.model.Vendedor;
import co.edu.uniquindio.proyectofinal.model.builder.Persona;
import co.edu.uniquindio.proyectofinal.model.composite.Categoria;
import co.edu.uniquindio.proyectofinal.model.composite.ProductoSimple;
import co.edu.uniquindio.proyectofinal.service.TableroControl;
import co.edu.uniquindio.proyectofinal.service.observer.ProductoObserver;
import co.edu.uniquindio.proyectofinal.service.strategy.ContactosPorVendedor;
import co.edu.uniquindio.proyectofinal.service.strategy.ProductosPublicadosEntreFechas;
import co.edu.uniquindio.proyectofinal.service.strategy.TopProductosConMasMeGustas;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class PatronesVistaViewController {

    @FXML
    private Button btnBuilder;

    @FXML
    private Button btnComposite;

    @FXML
    private Button btnObserver;

    @FXML
    private Button btnPrototype;

    @FXML
    private Button btnPrototypeBuilder;

    @FXML
    private Button btnStrategy;

    @FXML
    void onMostrarBuilder(ActionEvent event) {

        Producto producto = Producto.builder()
                .nombre("prueba")
                .idProducto("123")
                .estadoProducto(EstadoProducto.PUBLICADO)
                .fechaPublicacion(LocalDateTime.now())
                .build();

        System.out.println(producto);

    }

    @FXML
    void onMostrarComposite(ActionEvent event) {

        ProductoSimple producto1 = new ProductoSimple("123", "prueba", "imagen", "prueba", 200.0, EstadoProducto.CANCELADO, LocalDateTime.now(), new ArrayList<>());
        ProductoSimple producto2 = new ProductoSimple("123", "prueba2", "imagen2", "prueba2", 200.0, EstadoProducto.CANCELADO, LocalDateTime.now(), new ArrayList<>());

        Categoria categoria = new Categoria();
        categoria.agregarProducto(producto1);
        categoria.agregarProducto(producto2);

        categoria.mostrar();
        System.out.println(categoria);

    }

    @FXML
    void onMostrarObserver(ActionEvent event) {

        Producto producto = Producto.builder().nombre("prueba").idProducto("123").estadoProducto(EstadoProducto.PUBLICADO).fechaPublicacion(LocalDateTime.now()).build();

        ProductoObserver observador = new ProductoObserver();

        producto.registrarObservador(observador);

        producto.incrementarMeGustas();
        producto.cambiarEstado(EstadoProducto.VENDIDO);

    }

    @FXML
    void onMostrarPrototype(ActionEvent event) {

        Usuario usuario = Usuario.builder().usuario("ZM").build();
        Persona.PersonaBuilder personaBuilder = new Persona.PersonaBuilder()
                .nombre("Juan")
                .apellido("Pérez")
                .cedula("123456789")
                .direccion("Calle 123")
                .usuario(usuario)
                .listProductos(new ArrayList<>());
        Vendedor vendedor1 = new Vendedor(personaBuilder);
        Producto producto = new Producto("123", "prueba", "imagen", "prueba", 200.0, EstadoProducto.CANCELADO, LocalDateTime.now(), new ArrayList<>(), vendedor1);
        Producto productoClonado = producto.clone();

        productoClonado.setNombre("prueba2");
        productoClonado.setEstadoProducto(EstadoProducto.PUBLICADO);

        System.out.println("Producto base: " + producto);
        System.out.println("Producto clonado: " + productoClonado);

    }

    @FXML
    void onMostrarPrototypeBuilder(ActionEvent event) {

        Producto producto = Producto.builder().nombre("prueba").idProducto("123").estadoProducto(EstadoProducto.PUBLICADO).fechaPublicacion(LocalDateTime.now()).build();
        Producto productoClonado = producto.clone();
        productoClonado.cambiarEstado(EstadoProducto.VENDIDO);
        System.out.println("Producto Base: " + producto);
        System.out.println("Producto Clonado: " + productoClonado);

    }

    @FXML
    void onMostrarStrategy(ActionEvent event) {
        Producto producto1 = Producto.builder().nombre("prueba").idProducto("123").estadoProducto(EstadoProducto.PUBLICADO).fechaPublicacion(LocalDateTime.now()).build();
        Producto producto2 = Producto.builder().nombre("prueba2").idProducto("345").estadoProducto(EstadoProducto.PUBLICADO).fechaPublicacion(LocalDateTime.now()).build();

        Usuario usuario = Usuario.builder().usuario("ZM").build();
        Persona.PersonaBuilder personaBuilder = new Persona.PersonaBuilder()
                .nombre("Juan")
                .apellido("Pérez")
                .cedula("123456789")
                .direccion("Calle 123")
                .usuario(usuario)
                .listProductos(new ArrayList<>());
        Vendedor vendedor1 = new Vendedor(personaBuilder);

        TableroControl tablero = new TableroControl(Arrays.asList(vendedor1));

        tablero.setEstrategia(new ProductosPublicadosEntreFechas(LocalDateTime.now().minusDays(15), LocalDateTime.now()));
        System.out.println("Productos publicados entre fechas: " + tablero.calcularEstadistica());

        tablero.setEstrategia(new ContactosPorVendedor());
        System.out.println("Contactos por vendedor: " + tablero.calcularEstadistica());

        tablero.setEstrategia(new TopProductosConMasMeGustas(1));
        System.out.println("Top productos con mas me gusta: " + tablero.calcularEstadistica());

    }

}
