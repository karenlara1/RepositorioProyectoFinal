package co.edu.uniquindio.proyectofinal.viewController;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.Scene;

public class LogInViewController {

    @FXML
    private Button btnIngresar;

    @FXML
    private Hyperlink btnRegistro;

    @FXML
    private PasswordField txtContrasena;

    @FXML
    private TextField txtUsuario;

    @FXML
    public void iniciarSesion() {

        if (txtUsuario == null || txtContrasena == null) {
            showAlert("Error", "Los campos no están correctamente inicializados.");
            return;
        }

        String usuario = txtUsuario.getText();
        String contrasena = txtContrasena.getText();

        String rol = autenticacion (usuario, contrasena);

        if (rol == null)  {
            showAlert("Error", "Credenciales inválidas. Intentar de nuevo.");
        } else {
            //Se muestra la vista correspondiente al rol
            switch (rol){
                case "ADMIN":
                    loadView("/adminView.fxml");//Aún no está la vista
                    break;
                case "VENDEDOR":
                    loadView("/muro2.fxml"); //Aún no está la vista
                    break;
            }
        }
    }

    //Aquí se  realiza el método que realiza la autenticación de usuario y rol

    private String autenticacion (String usuario, String contrasena)  {
         //datos quemados
        if (usuario.equals("admin") && contrasena.equals("1234")) {
            return "ADMIN"; //mostrar vista admin
        } else if (usuario.equals("vendedor") && contrasena.equals("5678")) {
            return "VENDEDOR"; //vista vendedor
        }

        return null; //las credenciales son inválidas
    }

    private void loadView(String fxmlFile){

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
            Parent root = loader.load();
            Stage stage = (Stage) txtUsuario.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();//no sé qué  hace esto BUSCARRR
            showAlert("Error", "La vista no puede cargarse...");
        }
    }

    //Aquí se crean las alertas
    private void showAlert(String titulo, String mensaje){
        Alert alerta = new Alert(AlertType.ERROR);
        alerta.setTitle(titulo);
        alerta.setContentText(mensaje);
        alerta.showAndWait();

    }
}