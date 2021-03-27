package me.uwu.saver;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.print("\rToken: ");
        Scrapper.token = scan.next();
        System.out.print("\rChannel id: ");
        Scrapper.channelId = scan.next();
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception ignored){}

        Scrapper.main();
        Test.main();
    }
}
