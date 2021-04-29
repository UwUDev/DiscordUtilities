package me.uwu.saver.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Gui extends Application {
    public static Image icon = new Image(Gui.class.getResourceAsStream("icon.png"));
    private static Stage pStage;

    @Override
    public void start(Stage primaryStage) throws IOException {
        setPrimaryStage(primaryStage);
        pStage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("UwU.fxml"));
        pStage.setTitle("Discord Utilities");
        pStage.setScene(new Scene(root, 1270, 710));
        pStage.getScene().getStylesheets().add(String.valueOf(getClass().getResource("style.css")));
        pStage.getIcons().add(icon);
        pStage.setMinHeight(600);
        pStage.setMinWidth(1058);
        pStage.show();
        pStage.resizableProperty().set(true);
    }

    public static void main(String[] args) {
        launch(args);
    }

    public static Stage getPrimaryStage() {
        return pStage;
    }

    private void setPrimaryStage(Stage pStage) {
        Gui.pStage = pStage;
    }
}
