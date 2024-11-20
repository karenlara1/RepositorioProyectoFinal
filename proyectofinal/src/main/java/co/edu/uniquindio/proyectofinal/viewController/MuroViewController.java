package co.edu.uniquindio.proyectofinal.viewController;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MuroViewController {

    @FXML
    private Button btnAgregarVendedor;

    @FXML
    private Button btnIniciarchat;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private FlowPane productosContainer;

    public void initialize() {

        //Ejemplo no funcional
        String[] rutaDeImagenes = {
                "producto1.png",
                "producto2.png",
                "producto3.png",
        };

        for (String ruta : rutaDeImagenes){

            //Aquí se crea un ImageView (SceneBuilder) para cada producto
            ImageView productoImagen = new ImageView(new Image(ruta));
            productoImagen.setFitWidth(100); //Ajustamos ancho de imagenes
            productoImagen.setFitHeight(100); //Altura

            //Se crea el Label que contendrá la descripcion junto al botón de megusta
            Label descripcion = new Label("Descripción");
            Button meGusta = new Button("❤️");

            //Ahora se asignan a un VBox
            VBox productoBox = new VBox();
            productoBox.setSpacing(10);
            productoBox.getChildren().addAll(productoImagen, descripcion, meGusta);
            productoBox.setStyle("-fx-padding: 10px; -fx-border-color: #ccc; -fx-allignment: center;");

            //Agregamos el producto que se creo anteriormente al productoContainer
            productosContainer.getChildren().add(productoBox);

        }

        btnAgregarVendedor.setOnAction(e -> {
            System.out.println("Botón Agregar Vendedor presionado");
        });

        btnIniciarchat.setOnAction(e -> {
            System.out.println("chat Iniciado");
        });


    }
}

