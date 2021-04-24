package me.uwu.saver.utils;

import com.google.gson.Gson;
import me.uwu.saver.objs.Channel;
import me.uwu.saver.objs.Guild;
import me.uwu.saver.objs.SelfUser;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.ResponseBody;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

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
        ResponseBody respBody = client.newCall(request).execute().body();
        if (respBody == null){
            System.out.println("Oh oh.. something went wrong :c");
            return null;
        }
        String responseBody = respBody.string();
        return gson.fromJson(responseBody, SelfUser.class);
    }

    public static boolean isValidToken(String token){
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url("https://discord.com/api/v8/users/@me")
                .method("GET", null)
                .addHeader("Authorization", token)
                .addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/89.0.4389.90 Safari/537.36")
                .build();

        try {
            ResponseBody respBody = client.newCall(request).execute().body();
            if (respBody == null){
                System.out.println("Oh oh.. something went wrong :c");
                return false;
            }
            String responseBody = respBody.string();
            if (responseBody.contains("username")) return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static Channel[] getDMs(String token) throws IOException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url("https://discord.com/api/v8/users/@me/channels")
                .method("GET", null)
                .addHeader("Authorization", token)
                .addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/89.0.4389.90 Safari/537.36")
                .build();

        Gson gson = new Gson();
        ResponseBody respBody = client.newCall(request).execute().body();
        if (respBody == null){
            System.out.println("Oh oh.. something went wrong :c");
            return null;
        }
        String responseBody = respBody.string();
        Channel[] channels = gson.fromJson(responseBody, Channel[].class);

        List<Channel> tempChannels = Arrays.stream(channels).filter(p -> p.getLast_message_id() > 0).collect(Collectors.toList());
        channels = new Channel[tempChannels.size()];
        channels = tempChannels.toArray(channels);

        Arrays.sort(channels, (first, second) -> {
            if (first.getLast_message_id() != second.getLast_message_id()) {
                return Long.signum(first.getLast_message_id() - second.getLast_message_id());
            }

            return first.getName().compareTo(second.getName());
        });

        tempChannels = Arrays.asList(channels);
        Collections.reverse(tempChannels);

        channels = new Channel[tempChannels.size()];
        channels = tempChannels.toArray(channels);

        return channels;
    }

    public static Channel[] getGuildChannels(String token, long guildId) throws IOException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url("https://discord.com/api/v8/guilds/" + guildId + "/channels")
                .method("GET", null)
                .addHeader("Authorization", token)
                .addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/89.0.4389.90 Safari/537.36")
                .build();

        Gson gson = new Gson();
        ResponseBody respBody = client.newCall(request).execute().body();
        if (respBody == null){
            System.out.println("Oh oh.. something went wrong :c");
            return null;
        }
        String responseBody = respBody.string();
        return gson.fromJson(responseBody, Channel[].class);
    }

    public static Guild[] getGuilds(String token) throws IOException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url("https://discord.com/api/v8/users/@me/guilds")
                .method("GET", null)
                .addHeader("Authorization", token)
                .addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/89.0.4389.90 Safari/537.36")
                .build();

        Gson gson = new Gson();
        ResponseBody respBody = client.newCall(request).execute().body();
        if (respBody == null){
            System.out.println("Oh oh.. something went wrong :c");
            return null;
        }
        String responseBody = respBody.string();
        return gson.fromJson(responseBody, Guild[].class);
    }
}
