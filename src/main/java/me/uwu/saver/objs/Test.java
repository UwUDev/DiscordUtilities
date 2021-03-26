package me.uwu.saver.objs;

import com.google.gson.Gson;
import me.uwu.saver.Message;
import me.uwu.saver.Template;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        StringBuilder html = new StringBuilder();

        try (Stream<String> lines = Files.lines(new File("last.conv").toPath())) {
            lines.forEach(s -> sb.append(s).append("\n"));
        }

        Gson gson3 = new Gson();
        Message[] msg = gson3.fromJson(sb.toString(), Message[].class);

        List<Message> messages = new ArrayList<>(Arrays.asList(msg));

        for (Message message: messages) {
            if (message.getType() == 0 && message.getContent().isEmpty())
                System.out.println("" + message.getAuthor().getUsername() + " sent a file: " + message.getAttachments()[0].getUrl());
            if (message.getType() == 0 && !message.getContent().isEmpty())
                System.out.println("" + message.getAuthor().getUsername() + ":  " + message.getContent());
            if (message.getType() == 3)
                System.out.println("" + message.getAuthor().getUsername() + " started a call");
        }

        System.out.println(messages.get(1).getAuthor().getAvatarUrl());

        html.append(Template.base[0]);
        html.append("<ul>");

        for (Message message: messages) {
            if (message.getType() == 0 && message.getContent().isEmpty())
                html.append("\n<li>").append(message.getAuthor().getUsername()).append(" sent a file: ").append(message.getAttachments()[0].getUrl()).append("</li>");
            if (message.getType() == 0 && !message.getContent().isEmpty())
                html.append("\n<li>").append(message.getAuthor().getUsername()).append(":  ").append(message.getContent()).append("</li>");
            if (message.getType() == 3)
                html.append("\n<li>").append(message.getAuthor().getUsername()).append(" started a call").append("</li>");
        }

        html.append("\n</ul>");
        html.append(Template.base[1]);

        BufferedWriter writer = new BufferedWriter(new FileWriter("index.html"));
        writer.write(html.toString());

        writer.close();
    }
}
