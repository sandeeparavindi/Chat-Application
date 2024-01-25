package org.example.controller;

import com.jfoenix.controls.JFXTextArea;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginFormController {
    @FXML
    private JFXTextArea txtName;

    public void initialize(){
    }

    @FXML
    void btnLoginOnAction(ActionEvent event) throws IOException {
        if (!txtName.getText().isEmpty() && txtName.getText().matches("[A-Za-z0-9]+")) {
            Stage primaryStage = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/client_form.fxml"));

            ClientFormController controller = new ClientFormController();
            controller.setClientName(txtName.getText());
            fxmlLoader.setController(controller);

            primaryStage.setScene(new Scene(fxmlLoader.load()));
            primaryStage.setTitle(txtName.getText());
            primaryStage.setResizable(false);
            primaryStage.centerOnScreen();
            primaryStage.setOnCloseRequest(windowEvent -> {
                controller.shutdown();
            });
            primaryStage.show();

            txtName.clear();
        } else {
            new Alert(Alert.AlertType.ERROR, "Please enter your name").show();
        }
    }
}
