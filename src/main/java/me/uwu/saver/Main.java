package me.uwu.saver;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static Scrapper scrapper;
    public static String channelId;

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.print("\rToken: ");
        scrapper = new Scrapper(scan.next());
        System.out.print("\rChannel id: ");
        channelId = scan.next();
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception ignored){}

        scrapper.updateChannel(channelId);
        scrapper.scrape(channelId);
        Parser parser = new Parser(scrapper);
        parser.parse();
    }
}
