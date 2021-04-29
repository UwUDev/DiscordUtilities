package me.uwu.saver.gui.controllers;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import me.uwu.saver.gui.Gui;
import me.uwu.saver.core.objs.Channel;
import me.uwu.saver.core.objs.Guild;
import me.uwu.saver.core.objs.SelfUser;
import me.uwu.saver.core.parse.Parser;
import me.uwu.saver.core.scrape.Scrapper;
import me.uwu.saver.core.utils.DiscordUtils;
import me.uwu.saver.core.utils.WebUtils;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    public static Channel[] dms;
    public static Guild[] guilds;
    public static Channel[] serverChannels;

    public ScrollPane scrollOptn;
    public AnchorPane controls;
    public Label optionNone;

    public JFXButton checkTokenBtn;

    public JFXPasswordField tokenField;
    public Circle pdp;
    public Label username;
    public GridPane gridPane;

    public Label optionLabel1;
    public Label optionLabel2;
    public JFXTextField rangeMax;
    public JFXTextField rangeMin;
    public JFXButton backupButton;

    public JFXButton bonkButton;

    public static MainController INSTANCE;

    public MainController(){
        INSTANCE = this;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("Owi");
        setOptionVisibility(false);

        //pdp.setStroke(Color.SEAGREEN);
        //Image im = new Image("https://juicylinksmag.files.wordpress.com/2016/02/juliet-ibrahim.jpg",false);
        pdp.setFill(new ImagePattern(Gui.icon, 60, 65, 120, 120, false));
        pdp.setEffect(new DropShadow(+7d, +5d, +5d, new Color(0f, 0f, 0f, 0.3f)));
    }

    public void credits() throws URISyntaxException {
        WebUtils.openWebpage(new URI("https://github.com/UwUDev"));
    }

    public void checkToken() throws IOException {
        String token = tokenField.getText();

        setOptionVisibility(false);
        pdp.setFill(new ImagePattern(Gui.icon, 60, 65, 120, 120, false));
        pdp.setEffect(new DropShadow(+7d, +5d, +5d, new Color(0f, 0f, 0f, 0.3f)));
        username.setText("User#0000");

        gridPane.getChildren().clear();

        if (!DiscordUtils.isValidToken(token)){
            optionNone.setText("Invalid token (oof moment)");
            return;
        }
        optionNone.setText("");

        SelfUser user = DiscordUtils.getUserFromToken(token);

        String imgUrl = user.getAvatarUrl();
        URLConnection connection = new URL(imgUrl).openConnection();
        connection.addRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:25.0) Gecko/20100101 Firefox/25.0");
        Image image = new Image(connection.getInputStream());

        pdp.setFill(new ImagePattern(image));
        pdp.setEffect(new DropShadow(+7d, +5d, +5d, new Color(0f, 0f, 0f, 0.3f)));

        username.setText(user.getFullUsername());
        guilds = DiscordUtils.getGuilds(token);
        dms = DiscordUtils.getDMs(token);

        setGuildsPane(token);

        for (Channel dm : dms) {
            System.out.println(dm.getRealChannelName());
        }
    }

    private void setGuildsPane(String token){
        gridPane.getChildren().clear();

        JFXButton backButton = new JFXButton("DMs");
        backButton.setStyle("-fx-font-size: 38px;");
        backButton.setOnMouseClicked(event1 -> {
            gridPane.getChildren().clear();
            setDMsPane(token);
        });
        gridPane.add(backButton, 0, 0);

        int row = 1;
        for (Guild guild : guilds){
            JFXButton button = new JFXButton(guild.getName());
            button.setOnMouseClicked(event -> {
                System.out.println(guild.getId());
                try {
                    gridPane.getChildren().clear();
                    int subRow = 1;
                    for (Channel channel : DiscordUtils.getGuildChannels(token, guild.getId())){
                        JFXButton subBackButton = new JFXButton("Back");
                        subBackButton.setStyle("-fx-font-size: 38px;");
                        subBackButton.setOnMouseClicked(event1 -> {
                            gridPane.getChildren().clear();
                            setGuildsPane(token);
                        });
                        gridPane.add(subBackButton, 0, 0);

                        JFXButton subButton = new JFXButton(channel.getName());
                        subButton.setOnMouseClicked(subEvent -> {
                            System.out.println(channel.getId());
                            setOptionVisibility(true);
                            backupButton.setOnMouseClicked(event1 -> {
                                Scrapper scrapper = new Scrapper(token);
                                try {
                                    openPopup();
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }

                                Thread t = new Thread(() -> {
                                    try {
                                        scrapper.updateChannel(String.valueOf(channel.getId()));
                                        scrapper.scrape(String.valueOf(channel.getId()));
                                        Parser parser = new Parser(scrapper);
                                        parser.parse();
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                        Platform.runLater(() -> LoadingController.INSTANCE.error());

                                    }
                                });
                                t.start();

                            });
                        });
                        gridPane.add(subButton, 0, subRow);
                        subRow++;
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            gridPane.add(button, 0, row);
            row++;
        }
    }

    private void setDMsPane(String token){
        gridPane.getChildren().clear();

        JFXButton backButton = new JFXButton("Guilds");
        backButton.setStyle("-fx-font-size: 38px;");
        backButton.setOnMouseClicked(event1 -> {
            gridPane.getChildren().clear();
            setGuildsPane(token);
        });
        gridPane.add(backButton, 0, 0);

        int row = 1;
        for (Channel dm : dms){
            JFXButton button = new JFXButton(dm.getRealChannelName());
            button.setOnMouseClicked(event -> {
                System.out.println(dm.getId());
                setOptionVisibility(true);
                backupButton.setOnMouseClicked(event1 -> {
                    Scrapper scrapper = new Scrapper(token);
                    try {
                        openPopup();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    Thread t = new Thread(() -> {
                        try {
                            scrapper.updateChannel(String.valueOf(dm.getId()));
                            scrapper.scrape(String.valueOf(dm.getId()));
                            Parser parser = new Parser(scrapper);
                            parser.parse();
                        } catch (IOException e) {
                            e.printStackTrace();
                            Platform.runLater(() -> LoadingController.INSTANCE.error());

                        }
                    });
                    t.start();

                });
            });
            gridPane.add(button, 0, row);
            row++;
        }
    }

    private void setOptionVisibility(boolean b){
        optionLabel1.setVisible(b);
        optionLabel2.setVisible(b);
        rangeMax.setVisible(b);
        rangeMin.setVisible(b);
        backupButton.setVisible(b);
    }

    public void openPopup() throws IOException {
        final Stage dialog = new Stage();
        dialog.initModality(Modality.APPLICATION_MODAL);
        dialog.initStyle(StageStyle.UNDECORATED);
        dialog.initOwner(Gui.getPrimaryStage());
        URL url = Gui.class.getResource("Popup.fxml");
        System.out.println(url.getFile());
        Parent root = FXMLLoader.load(url);
        dialog.setTitle("Backing up...");
        dialog.setScene(new Scene(root, 500, 300));
        dialog.getScene().getStylesheets().add(String.valueOf(Gui.class.getResource("style.css")));
        dialog.setResizable(false);
        dialog.show();
    }
}
