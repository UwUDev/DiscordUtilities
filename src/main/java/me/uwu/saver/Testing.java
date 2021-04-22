package me.uwu.saver;

import me.uwu.saver.objs.Channel;
import me.uwu.saver.scrape.Scrapper;
import me.uwu.saver.utils.Emoji;

import java.io.IOException;
import java.util.Scanner;

public class Testing {
    public static void main(String[] args) throws IOException {
        System.out.println(Emoji.parse("Coucou \uD83D\uDC9C  \uD83D\uDCC4"));

        System.out.println("\u2592");

        Scanner scan = new Scanner(System.in);
        System.out.print("\rToken: ");
        String token = scan.next();
        System.out.print("\rChannel id: ");
        String channelId = scan.next();
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception ignored){}

        Scrapper scrapper = new Scrapper(token);
        scrapper.updateChannel(channelId);

        Channel channel = scrapper.getChannel();
        System.out.println(channel.getRealChannelName());
    }
}
