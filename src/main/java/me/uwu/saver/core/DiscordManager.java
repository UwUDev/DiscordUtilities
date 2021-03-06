package me.uwu.saver.core;

import me.uwu.saver.core.parse.Parser;
import me.uwu.saver.core.scrape.Scrapper;

import java.util.ArrayList;
import java.util.List;

public class DiscordManager {
    private String token;
    private List<Parser> parsers;

    public DiscordManager(String token) {
        parsers = new ArrayList<>();
        this.token = token;
    }

    public void addParser(long channelId){
        addParser(String.valueOf(channelId));
    }

    public void forceAddParser(Parser parser){
        parsers.add(parser);
    }

    public void addParser(String channelId){
        Scrapper scrapper = new Scrapper(token);
        scrapper.setcId(channelId);
        Parser parser = new Parser(scrapper);
        parsers.add(parser);
    }

    public void removeParser(Parser parser){
        removeParser(parser.getScrapper().getcId());
    }

    public void removeParser(String channelId){
        List<Parser> tempList = new ArrayList<>();
        parsers.forEach(parser -> {
            if (!parser.getScrapper().getcId().equals(channelId))
                tempList.add(parser);
        });
        parsers = tempList;
    }

    public void removeParsers(List<String> parserList){
        parserList.forEach(this::removeParser);
    }

    public void clearParsers(){
        parsers = new ArrayList<>();
    }

    @SuppressWarnings("BusyWait")
    public void parseAll(){
        List<Thread> threads = makeThreads();
        for (Thread thread : threads) {
            thread.start();
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        while (!threadsFinished(threads)){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Finished :)");
    }

    private boolean threadsFinished(List<Thread> threadList){
        for (Thread thread : threadList) {
            if (thread.isAlive())
                return false;
        }
        return true;
    }

    public void parseAllQueue(){
        for (Parser parser : parsers){
            try {
                parser.getScrapper().scrape(parser.getScrapper().getcId());
                parser.parse();
            } catch (Exception e) {
                parser.parsing = false;
                parser.getScrapper().scraping = false;
                //e.printStackTrace();
                System.out.println("\u001B[33mUnable to scrappe " + parser.getScrapper().getcId());
            }
        }
    }

    private List<Thread> makeThreads(){
        List<Thread> tempList = new ArrayList<>();
        for (Parser parser : parsers) {
            Runnable runnable = parser::fullAuto;
            tempList.add(new Thread(runnable));
        }
        return tempList;
    }

    public void printParsersInfo(){
        int parserCount = 1;
        for (Parser parser : parsers) {
            System.out.println("Parser n??" + parserCount + "\t|\tchannel ID: " + parser.getScrapper().getcId() + "\t|\tParsing: " + parser.parsing + "  Scrapping: " + parser.getScrapper().scraping);
            parserCount++;
        }
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public List<Parser> getParsers() {
        return parsers;
    }

    public void setParsers(List<Parser> parsers) {
        this.parsers = parsers;
    }
}