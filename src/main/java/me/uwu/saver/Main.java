package me.uwu.saver;

import me.uwu.saver.objs.Test;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Token: ");
        Scrapper.token = scan.next();
        System.out.print("\nChannel id: ");
        Scrapper.channelId = scan.next();

        Scrapper.main();
        Test.main(new String[]{});
    }
}
