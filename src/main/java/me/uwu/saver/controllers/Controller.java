package me.uwu.saver.controllers;

import com.jfoenix.controls.*;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import me.uwu.saver.Gui;
import me.uwu.saver.objs.SelfUser;
import me.uwu.saver.utils.DiscordUtils;
import me.uwu.saver.utils.WebUtils;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    public static Controller instance;

    public ScrollPane scrollOptn;
    public AnchorPane controls;
    public Label optionNone;

    public JFXButton saveButton;
    public JFXButton dateButton;
    public JFXButton option2Button;
    public JFXButton option3Button;
    public JFXButton option4Button;
    public JFXButton option5Button;
    public JFXButton option6Button;
    public JFXButton option7Button;
    public JFXButton option8Button;

    public JFXDatePicker datePicker;
    public JFXTimePicker timePicker;
    public JFXButton checkTokenBtn;

    public JFXPasswordField token;
    public Circle pdp;
    public Label username;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("Owi");

        //pdp.setStroke(Color.SEAGREEN);
        //Image im = new Image("https://juicylinksmag.files.wordpress.com/2016/02/juliet-ibrahim.jpg",false);
        pdp.setFill(new ImagePattern(Gui.icon, 60, 65, 120, 120, false));
        pdp.setEffect(new DropShadow(+7d, +5d, +5d, new Color(0f, 0f, 0f, 0.3f)));
    }

    public void credits(MouseEvent mouseEvent) throws URISyntaxException {
        WebUtils.openWebpage(new URI("https://github.com/UwUDev"));
    }

    public void loadDate(MouseEvent mouseEvent) {
        //if (Main.loaded) {
            clear();
            optionNone.setVisible(false);

            datePicker.setDefaultColor(Color.web("#870fff"));
            controls.getChildren().add(datePicker);

            timePicker = new JFXTimePicker(LocalTime.now());
            timePicker.setIs24HourView(true);
            timePicker.setLayoutY(40);
            timePicker.setDefaultColor(Color.web("#870fff"));
            controls.getChildren().add(timePicker);
        //}
    }

    public void clear(){
        controls.getChildren().clear();
    }

    public void loadOption2(MouseEvent mouseEvent) {

    }

    public void loadOption3(MouseEvent mouseEvent) {

    }

    public void loadOption4(MouseEvent mouseEvent) {

    }

    public void loadOption5(MouseEvent mouseEvent) {

    }

    public void loadOption6(MouseEvent mouseEvent) {

    }

    public void loadOption7(MouseEvent mouseEvent) {

    }

    public void loadOption8(MouseEvent mouseEvent) {

    }

    public void onSave(MouseEvent mouseEvent) throws ParseException {
        LocalDate localDate = datePicker.getValue();
        System.out.println(localDate);
    }

    private void selectFile(JFXButton openExportFile, JFXTextField fieldCombo) {
        Stage stage = (Stage) openExportFile.getScene().getWindow();
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open input file");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Text Files", "*.txt"),
                new FileChooser.ExtensionFilter("All Files", "*.*"));
        File selectedFile = fileChooser.showOpenDialog(stage);
        String[] out= selectedFile.getPath().split("\\.");
        fieldCombo.setText(selectedFile.getAbsolutePath());
        optionNone.setText("Please enter your token");
    }

    public void checkToken(MouseEvent mouseEvent) throws IOException {
        SelfUser user = DiscordUtils.getUserFromToken(token.getText());

        String imgUrl = user.getAvatarUrl();
        URLConnection connection = new URL(imgUrl).openConnection();
        connection.addRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:25.0) Gecko/20100101 Firefox/25.0");
        Image image = new Image(connection.getInputStream());

        pdp.setFill(new ImagePattern(image));
        pdp.setEffect(new DropShadow(+7d, +5d, +5d, new Color(0f, 0f, 0f, 0.3f)));

        username.setText(user.getFullUsername());
    }
}
