package co.edu.uniquindio.proyectofinal.viewController;

import co.edu.uniquindio.proyectofinal.model.EstadoProducto;
import co.edu.uniquindio.proyectofinal.model.Producto;
import co.edu.uniquindio.proyectofinal.model.composite.Categoria;
import co.edu.uniquindio.proyectofinal.model.composite.ProductoSimple;
import co.edu.uniquindio.proyectofinal.service.observer.ProductoObserver;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.time.LocalDateTime;
import java.util.ArrayList;

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

    }

    @FXML
    void onMostrarPrototypeBuilder(ActionEvent event) {

    }

    @FXML
    void onMostrarStrategy(ActionEvent event) {

    }

}
