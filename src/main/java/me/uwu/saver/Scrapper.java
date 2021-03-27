package me.uwu.saver;

import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
* messages = requests.get('https://discordapp.com/api/v6/channels/<CHANNEL ID>/messages?limit=100')
last_message_id = messages[-1].id

while len(messages) < 100:
    messages = requests.get('https://discordapp.com/api/v6/channels/<CHANNEL ID>/messagesmessages?before={0}&limit=100'.format(last_message_id)
    last_message_id = messages[-1].id
* */

public class Scrapper {
    public static String token;
    public static String channelId;

    public static List<Message> messages = new ArrayList<>();

    public static void main() throws IOException {

        Message[] lastMessages;

        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url("https://discord.com/api/v8/channels/" + channelId + "/messages?limit=100")
                .method("GET", null)
                .addHeader("Authorization", token)
                .addHeader("Cookie", "__cfduid=d7d5dc7bd8843ef86e2a73ef661c1753a1616792356")
                .build();

        Gson gson = new Gson();
        String responseBody = client.newCall(request).execute().body().string();
        lastMessages = gson.fromJson(responseBody, Message[].class);

        messages.addAll(Arrays.asList(lastMessages));

        System.out.println(responseBody);

        System.out.println(lastMessages.length);
        System.out.println(messages.size());

        while (lastMessages.length >= 100){
            OkHttpClient client2 = new OkHttpClient().newBuilder()
                    .build();
            Request request2 = new Request.Builder()
                    .url("https://discord.com/api/v8/channels/809852089747636244/messages?before=" + lastMessages[99].id + "&limit=100")
                    .method("GET", null)
                    .addHeader("Authorization", token)
                    .addHeader("Cookie", "__cfduid=d7d5dc7bd8843ef86e2a73ef661c1753a1616792356")
                    .build();

            Gson gson2 = new Gson();
            String responseBody2 = client2.newCall(request2).execute().body().string();
            lastMessages = gson2.fromJson(responseBody2, Message[].class);

            messages.addAll(Arrays.asList(lastMessages));

            System.out.println(responseBody2);

            System.out.println(lastMessages.length);
            System.out.println(messages.size());
        }

        String json = new Gson().toJson(messages);

        BufferedWriter writer = new BufferedWriter(new FileWriter("last.conv"));
        writer.write(json);

        writer.close();

    }
}
