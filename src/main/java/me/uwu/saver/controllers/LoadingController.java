package me.uwu.saver.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class LoadingController implements Initializable {


    public Label state;
    public Label infos;

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
}
