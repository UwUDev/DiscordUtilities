package me.uwu.saver.gui.controllers;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class LoadingController implements Initializable {


    public Label state;
    public Label infos;
    public JFXButton exitButton;

    public static LoadingController INSTANCE;

    public LoadingController(){
        INSTANCE = this;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void setInfos(String i){
        infos.setText(i);
    }

    public void setState(String s){
        state.setText(s);
    }

    public void error(){
        infos.setText("");
        state.setText("Error :/");
    }

    public void finished(){
        state.setText("Finished");
        infos.setText("");
        exitButton.setVisible(true);
        exitButton.setDisable(false);
    }

    public void exit(MouseEvent mouseEvent) {
        exitButton.getScene().getWindow().hide();
    }
}
