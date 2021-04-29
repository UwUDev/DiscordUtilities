package me.uwu.saver.core.scrape;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javafx.application.Platform;
import me.uwu.saver.gui.controllers.LoadingController;
import me.uwu.saver.core.objs.Channel;
import me.uwu.saver.core.objs.Message;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.ResponseBody;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Scrapper {
    private String token;
    private Channel channel;
    public AtomicReference<List<Message>> messagesTemp = new AtomicReference<>();
    private String cId;
    public boolean scraping = false;


    public Scrapper(String token){
        this.token = token;
    }

    public void scrape(String channelId) throws IOException {
        scraping = true;

        messagesTemp.set(new ArrayList<>());
        List<Message> messages = messagesTemp.get();

        Message[] lastMessages;

        try {
            new ProcessBuilder("cmd", "/c", "color 4").inheritIO().start().waitFor();
        } catch (Exception ignored){}

        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url("https://discord.com/api/v8/channels/" + channelId + "/messages?limit=100")
                .method("GET", null)
                .addHeader("Authorization", token)
                .addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/89.0.4389.90 Safari/537.36")
                .build();

        Gson gson = new Gson();
        ResponseBody respBody = client.newCall(request).execute().body();
        if (respBody == null){
            Platform.runLater(() -> {
                LoadingController.INSTANCE.error();
                LoadingController.INSTANCE.setInfos("Unable to get messages");
            });
            scraping = false;
            return;
        }
        String responseBody = respBody.string();
        lastMessages = gson.fromJson(responseBody, Message[].class);

        messages.addAll(Arrays.asList(lastMessages));

        Platform.runLater(() -> {
            LoadingController.INSTANCE.setState("Getting messages");
            LoadingController.INSTANCE.setInfos(messages.size() + " messages");
        });

        try {
            new ProcessBuilder("cmd", "/c", "color a").inheritIO().start().waitFor();
        } catch (Exception ignored){}

        Platform.runLater(() -> LoadingController.INSTANCE.setInfos(messages.size() + " messages"));


        while (lastMessages.length >= 100){
            OkHttpClient client2 = new OkHttpClient().newBuilder()
                    .build();
            Request request2 = new Request.Builder()
                    .url("https://discord.com/api/v8/channels/" + channelId + "/messages?before=" + lastMessages[99].getId() + "&limit=100")
                    .method("GET", null)
                    .addHeader("Authorization", token)
                    .addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/89.0.4389.90 Safari/537.36")
                    .build();

            Gson gson2 = new GsonBuilder().serializeNulls().create();
            ResponseBody respBody2 = client2.newCall(request2).execute().body();

            if (respBody2 == null){
                Platform.runLater(() -> {
                    LoadingController.INSTANCE.error();
                    LoadingController.INSTANCE.setInfos("Unable to get messages");
                });
                scraping = false;
                return;
            }

            String responseBody2 = respBody2.string();
            System.out.println(responseBody);
            lastMessages = gson2.fromJson(responseBody2, Message[].class);

            messages.addAll(Arrays.asList(lastMessages));
            Platform.runLater(() -> LoadingController.INSTANCE.setInfos(messages.size() + " messages"));

        }

        String json = new Gson().toJson(messages);

        BufferedWriter writer = new BufferedWriter(new FileWriter("last.conv"));
        writer.write(json);

        writer.close();

        messagesTemp.set(messages);

        scraping = false;
    }

    public void updateChannel(String channelId) throws IOException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url("https://discord.com/api/v8/channels/" + channelId)
                .method("GET", null)
                .addHeader("Authorization", token)
                .addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/89.0.4389.90 Safari/537.36")                .build();
        Gson gson = new Gson();
        ResponseBody respBody = client.newCall(request).execute().body();

        if (respBody == null){
            Platform.runLater(() -> {
                LoadingController.INSTANCE.error();
                LoadingController.INSTANCE.setInfos("Unable to get messages");
            });
            return;
        }

        String responseBody = respBody.string();
        //System.out.println(responseBody);
        channel = gson.fromJson(responseBody, Channel.class);
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }
}
