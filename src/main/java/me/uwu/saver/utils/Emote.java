package me.uwu.saver.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Emote {
    public Emote(){}

    private final String emoteRegex = "<(?:[^\\d>]+|:[A-Za-z0-9]+:)\\w+>"; //help me, my brain is bleeding   ;-;

    public String convertEmotes(String messageContent){
        List<String> allMatches = new ArrayList<>();
        Matcher m = Pattern.compile(emoteRegex).matcher(messageContent);
        while (m.find()) {
            allMatches.add(m.group());
        }

        AtomicReference<String> oof = new AtomicReference<>(messageContent);

        allMatches.forEach(s -> {
            System.out.println(s);
            try {
                oof.set(oof.get().replace(s, "<img class=\"emoji\" src=\"https://cdn.discordapp.com/emojis/" + s.replace("<:", "").replace(">", "").split(":")[1] + ".png?v=1\">"));
            } catch (ArrayIndexOutOfBoundsException ignored){}
        });

        return oof.get();
    }
}
