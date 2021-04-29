package me.uwu.saver.core.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Emote {
    public Emote(){}

    public String convertEmotes(String messageContent){
        List<String> allMatches = new ArrayList<>();
        //help me, my brain is bleeding   ;-;
        String emoteRegex = "<(?:[^\\d>]+|:[A-Za-z0-9]+:)\\w+>";
        Matcher m = Pattern.compile(emoteRegex).matcher(messageContent);
        while (m.find()) {
            allMatches.add(m.group());
        }

        AtomicReference<String> oof = new AtomicReference<>(messageContent);

        allMatches.forEach(s -> {
            if (s.contains("<a:")){
                try { oof.set(oof.get().replace(s, "<img class=\"emoji\" src=\"https://cdn.discordapp.com/emojis/" + s.replace("<a:", "").replace(">", "").split(":")[1] + ".gif?v=1\">"));
                } catch (ArrayIndexOutOfBoundsException ignored) {}
            }else {
                try { oof.set(oof.get().replace(s, "<img class=\"emoji\" src=\"https://cdn.discordapp.com/emojis/" + s.replace("<:", "").replace(">", "").split(":")[1] + ".png?v=1\">"));
                } catch (ArrayIndexOutOfBoundsException ignored) {}
            }
        });

        return oof.get();
    }
}
