package me.uwu.saver;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Gui extends Application {
    public static Image icon = new Image(Gui.class.getResourceAsStream("icon.png"));

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("UwU.fxml"));
        primaryStage.setTitle("File Utilities by UwU#0001");
        primaryStage.setScene(new Scene(root, 1270, 710));
        primaryStage.getScene().getStylesheets().add(String.valueOf(getClass().getResource("style.css")));
        primaryStage.getIcons().add(icon);
        primaryStage.setMinHeight(600);
        primaryStage.setMinWidth(1058);
        primaryStage.show();
        primaryStage.resizableProperty().set(true);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
