package org.example.controller;

import com.jfoenix.controls.JFXTextArea;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import static org.example.controller.ServerFormController.receiveMessage;

public class ClientFormController {

    @FXML
    private Button emojiButton;

    @FXML
    private AnchorPane pane;

    @FXML
    private ScrollPane scrollPane;

    @FXML
    private Text txtLabel;

    @FXML
    private TextField txtMsg;

    public VBox vBox;
    private Socket socket;
    private DataInputStream dataInputStream;
    private DataOutputStream dataOutputStream;
    public ScrollPane scrollPain;

    private String clientName = "Client";

    @FXML
    void btnAttachmentOnAction(ActionEvent event) {

    }

    @FXML
    void btnEmojiOnAction(ActionEvent event) {

    }

    @FXML
    void btnLogOnAction(ActionEvent event) {

    }

    @FXML
    void txtMsgOnAction(ActionEvent event) {

    }

    public void setClientName(String name) {
        clientName = name;
    }

    public void shutdown() {
        ServerFormController.receiveMessage(clientName+" left.");
    }
}
