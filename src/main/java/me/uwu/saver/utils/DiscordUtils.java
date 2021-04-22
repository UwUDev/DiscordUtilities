package me.uwu.saver.utils;

import com.google.gson.Gson;
import me.uwu.saver.objs.SelfUser;
import okhttp3.OkHttpClient;
import okhttp3.Request;

import java.io.IOException;

public class DiscordUtils {
    public static SelfUser getUserFromToken(String token) throws IOException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url("https://discord.com/api/v8/users/@me")
                .method("GET", null)
                .addHeader("Authorization", token)
                .addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/89.0.4389.90 Safari/537.36")
                .build();

        Gson gson = new Gson();
        String responseBody = client.newCall(request).execute().body().string();
        return gson.fromJson(responseBody, SelfUser.class);
    }
}
