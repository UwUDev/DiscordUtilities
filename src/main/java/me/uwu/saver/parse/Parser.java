package me.uwu.saver.parse;

import me.uwu.saver.objs.Message;
import me.uwu.saver.scrape.Scrapper;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
// 834163332248109118

public class Parser {
    private Scrapper scrapper;

    public Parser(Scrapper scrapper) {
        this.scrapper = scrapper;
    }

    public void parse() throws IOException {
        StringBuilder html = new StringBuilder();

        //List<Message> messages = new ArrayList<>(Arrays.asList(msg));
        List<Message> messages = scrapper.messages;
        if (!(messages.size() > 0)){
            System.out.println("No messages :/");
            return;
        }
        Collections.reverse(messages);

        html.append(Template.base[0].replace("${channel_name}", scrapper.getChannel().getRealChannelName()).replace("${message_count}", String.valueOf(messages.size())));

        String lastId = messages.get(0).getAuthor().getId();

        byte maxRep = 1;

        html.append(Template.startMessageGroup(messages.get(0)));
        for (Message message: messages) {
            if (!lastId.equals(message.getAuthor().getId()) || maxRep >= 7) {
                html.append(Template.endMessageGroup);
                html.append(Template.startMessageGroup(message));
                maxRep =1;
            }

            if (message.getType() == 0)
                html.append(Template.addMessageClassic(message, false));

            if (message.getType() == 3) {
                html.append(Template.endMessageGroup);
                html.append(Template.addCall(message));
                maxRep = 99;
            }

            if (message.getType() == 6) {
                html.append(Template.endMessageGroup);
                html.append(Template.addPin(message, scrapper.getChannel().getId()));
                maxRep = 99;
            }

            lastId = message.getAuthor().getId();
            maxRep++;
        }
        html.append(Template.endMessageGroup);

        html.append(Template.base[1]);

        BufferedWriter writer = new BufferedWriter(new FileWriter("index.html"));
        writer.write(html.toString());

        writer.close();

        System.out.println("\nFinished :)");
    }

    public Scrapper getScrapper() {
        return scrapper;
    }

    public void setScrapper(Scrapper scrapper) {
        this.scrapper = scrapper;
    }
}
