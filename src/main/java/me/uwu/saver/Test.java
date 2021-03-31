package me.uwu.saver;

import com.google.gson.Gson;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main() throws IOException {
        StringBuilder sb = new StringBuilder();
        StringBuilder html = new StringBuilder();

        /*try {
            try (Stream<String> lines = Files.lines(new File("last.conv").toPath())) {
                lines.forEach(s -> sb.append(s).append("\n"));
            }
        } catch (Exception e){
            e.printStackTrace();
        }*/


        Gson gson3 = new Gson();
        Message[] msg = gson3.fromJson(sb.toString(), Message[].class);

        //List<Message> messages = new ArrayList<>(Arrays.asList(msg));
        List<Message> messages = Scrapper.messages;
        Collections.reverse(messages);

        /*for (Message message: messages) {
            if (message.getType() == 0 && message.getContent().isEmpty())
                System.out.println("" + message.getAuthor().getUsername() + " sent a file: " + message.getAttachments()[0].getUrl());
            if (message.getType() == 0 && !message.getContent().isEmpty())
                System.out.println("" + message.getAuthor().getUsername() + ":  " + message.getContent());
            if (message.getType() == 3)
                System.out.println("" + message.getAuthor().getUsername() + " started a call");
        }*/

        //System.out.println(messages.get(1).getAuthor().getAvatarUrl());

        html.append(Template.base[0]);
        html.append("<ul>");

        for (Message message: messages) {
            if (message.getType() == 0) {
                String m = message.getContent().replace("<", "'<'").replace(">", "'>'").replace("\n", "<br>");
                if (message.getAttachments().length > 0)
                    m = m + "<br><strong>Attachement :</strong>" + message.getAttachments()[0].getUrl();
                html.append(Template.div.replace("{username}", message.getAuthor().getUsername()).replace("{message}", m).replace("{avatar}", message.getAuthor().getAvatarUrl()));
            }
            if (message.getType() == 3)
                html.append("\n<li>").append(message.getAuthor().getUsername()).append(" started a call").append("</li>");
        }

        html.append("\n</ul>");
        html.append(Template.base[1]);

        BufferedWriter writer = new BufferedWriter(new FileWriter("index.html"));
        writer.write(html.toString());

        writer.close();

        System.out.println("\nFinished :)");
    }
}
