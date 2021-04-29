package me.uwu.saver.core;

public class Testing {
    public static void main(String[] args) throws InterruptedException {
        DiscordManager manager = new DiscordManager("oof");
        manager.addParser(71891776198918L);
        manager.addParser(71679871961798L);
        manager.addParser(671981543564863L);
        manager.addParser(186768941689841L);
        manager.printParsersInfo();
        manager.parseAll();
        Thread.sleep(9999999);
    }
}
