package me.uwu.saver.utils;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

/**
 *  Slim Java port of twemoji (Twitter Emoji)
 *  https://github.com/twitter/twemoji
 *
 *  Arnold Buchmueller
 *  http://www.eingrad.com
 */
public class Emoji {

    private static final Pattern pattern = Pattern.compile("((([\uD83C\uDF00-\uD83D\uDDFF]|[\uD83D\uDE00-\uD83D\uDE4F]|[\uD83D\uDE80-\uD83D\uDEFF]|[\u2600-\u26FF]|[\u2700-\u27BF])[\\x{1F3FB}-\\x{1F3FF}]?))");

    public static String parse(String text) {
        StringBuffer sb = new StringBuffer();
        Matcher matcher = pattern.matcher(text);
        String iconUrl;
        while (matcher.find()) {
            String rawCode = matcher.group(2);
            String iconId = grabTheRightIcon(rawCode);
            iconUrl = "https://twemoji.maxcdn.com/2/72x72/" + iconId + ".png";
            matcher.appendReplacement(sb, "<img class=\"emoji\" src=\"" + iconUrl + "\">");
        }
        matcher.appendTail(sb);
        return sb.toString();
    }

    private static String toCodePoint(String unicodeSurrogates, String sep) {
        ArrayList<String> r = new ArrayList<>();
        int c, p = 0, i = 0;
        if (sep == null)
            sep = "-";
        while (i < unicodeSurrogates.length()) {
            c = unicodeSurrogates.charAt(i++);
            if (p != 0) {
                r.add(Integer.toString((0x10000 + ((p - 0xD800) << 10) + (c - 0xDC00)), 16));
                p = 0;
            } else if (0xD800 <= c && c <= 0xDBFF) {
                p = c;
            } else {
                r.add(Integer.toString(c, 16));
            }
        }
        return StringUtils.join(r, sep);
    }

    private static String grabTheRightIcon(String rawText) {
        // if variant is present as \uFE0F
        return toCodePoint(
                rawText.indexOf('\u200D') < 0 ?
                        rawText.replace("\uFE0F", "") :
                        rawText, null);
    }
}
