package co.edu.uniquindio.proyectofinal;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainPatronesApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/patronesVista.fxml")); // Nombre de tu archivo FXML
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Prueba de los patrones");
        primaryStage.show();
    }

    public static void main(String[] args) {

        launch(args);
    }
}
