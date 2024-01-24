package org.example.client;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import org.example.controller.ClientFormController;

public class clientLauncherWrapper extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("/view/client_form.fxml"));
        ClientFormController controller = new ClientFormController();
        fxmlLoader.setController(controller);
        primaryStage.setScene(new Scene(fxmlLoader.load()));

        Stage stage = new Stage();
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(primaryStage.getScene().getWindow());
        stage.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("/view/login_form.fxml"))));
        stage.setTitle("Multi-Chat");
        stage.centerOnScreen();
        stage.setResizable(false);
        stage.show();
    }
}
