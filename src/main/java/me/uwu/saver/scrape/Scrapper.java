package me.uwu.saver.scrape;

import com.google.gson.Gson;
import javafx.application.Platform;
import me.uwu.saver.controllers.LoadingController;
import me.uwu.saver.objs.Channel;
import me.uwu.saver.objs.Message;
import okhttp3.OkHttpClient;
import okhttp3.Request;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

public class Scrapper {
    private String token;
    private Channel channel;
    public AtomicReference<List<Message>> messagesTemp = new AtomicReference<>();


    public Scrapper(String token){
        this.token = token;
    }

    public void scrape(String channelId) throws IOException {

        messagesTemp.set(new ArrayList<>());
        List<Message> messages = messagesTemp.get();

        Message[] lastMessages;

        try { // go jsp faire un atomic d'une array xdd
            new ProcessBuilder("cmd", "/c", "color 4").inheritIO().start().waitFor();
        } catch (Exception ignored){}
        //System.out.print("\r" + messages.size() + " messages");

        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url("https://discord.com/api/v8/channels/" + channelId + "/messages?limit=100")
                .method("GET", null)
                .addHeader("Authorization", token)
                .addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/89.0.4389.90 Safari/537.36")
                .build();

        Gson gson = new Gson();
        String responseBody = client.newCall(request).execute().body().string();
        lastMessages = gson.fromJson(responseBody, Message[].class);

        messages.addAll(Arrays.asList(lastMessages));

        Platform.runLater(() -> {
            LoadingController.INSTANCE.setState("Getting messages");
            LoadingController.INSTANCE.setInfos(messages.size() + " messages");
        });

        System.out.println(responseBody);

        //System.out.println(lastMessages.length);
        try {
            new ProcessBuilder("cmd", "/c", "color a").inheritIO().start().waitFor();
        } catch (Exception ignored){}
        //System.out.print("\r" + messages.size() + " messages");
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

            Gson gson2 = new Gson();
            String responseBody2 = client2.newCall(request2).execute().body().string();
            lastMessages = gson2.fromJson(responseBody2, Message[].class);

            messages.addAll(Arrays.asList(lastMessages));

            //System.out.println(responseBody2);

            //System.out.println(lastMessages.length);

            //System.out.print("\r" + messages.size() + " messages");
            Platform.runLater(() -> LoadingController.INSTANCE.setInfos(messages.size() + " messages"));

        }// c'est une maquette (any qui casse les couilles avec le numpad c'est genial)

        String json = new Gson().toJson(messages);

        BufferedWriter writer = new BufferedWriter(new FileWriter("last.conv"));
        writer.write(json);

        writer.close();

        messagesTemp.set(messages);//on est daccord que ca va lmarcher la ? aucune idée

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
        String responseBody = client.newCall(request).execute().body().string();
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
}
