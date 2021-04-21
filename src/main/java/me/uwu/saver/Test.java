package me.uwu.saver;

import com.google.gson.Gson;
import me.uwu.saver.objs.Embed;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
// 834163332248109118

public class Test {
    public static void main() throws IOException {
        StringBuilder sb = new StringBuilder();
        StringBuilder html = new StringBuilder();

        Gson gson3 = new Gson();
        Message[] msg = gson3.fromJson(sb.toString(), Message[].class);

        //List<Message> messages = new ArrayList<>(Arrays.asList(msg));
        List<Message> messages = Scrapper.messages;
        if (!(messages.size() > 0)){
            System.out.println("No messages :/");
            return;
        }
        Collections.reverse(messages);

        html.append(Template.base[0].replace("${channel_name}", Scrapper.channelId).replace("${message_count}", String.valueOf(messages.size())));

        String lastId = messages.get(0).author.getId();

        byte maxRep = 1;

        html.append(Template.startMessageGroup(messages.get(0)));
        for (Message message: messages) {
            if (!lastId.equals(message.author.getId()) || maxRep >= 7) {
                html.append(Template.endMessageGroup);
                html.append(Template.startMessageGroup(message));
                maxRep =1;
            }

            if (message.type == 0){
                html.append(Template.addMessageClassic(message, false));
                if (message.getEmbeds().length > 0) {
                    System.out.println("Embed: https://discord.com/channels/@me/" + Scrapper.channelId + "/" + message.id);
                    for (Embed embed : message.getEmbeds()) {
                        System.out.println("#" + Integer.toHexString(embed.getColor()));
                    }
                }
            }

            if (message.type == 3) {
                html.append(Template.endMessageGroup);
                html.append(Template.addCall(message));
            }

            if (message.type == 6) {
                html.append(Template.endMessageGroup);
                html.append(Template.addPin(message));
            }

            lastId = message.author.getId();
            maxRep++;
        }
        html.append(Template.endMessageGroup);

        html.append(Template.base[1]);

        BufferedWriter writer = new BufferedWriter(new FileWriter("index.html"));
        writer.write(html.toString());

        writer.close();

        System.out.println("\nFinished :)");
    }
}
