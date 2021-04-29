package me.uwu.saver.core.parse;

import me.uwu.saver.core.objs.Attachments;
import me.uwu.saver.core.objs.Embed;
import me.uwu.saver.core.objs.Message;
import me.uwu.saver.core.utils.Emoji;
import me.uwu.saver.core.utils.Emote;

@SuppressWarnings("SpellCheckingInspection")
public class Template {
    public static final String[] base = new String[]{
                    "<!DOCTYPE html>" +
                            "<html>" +
                            "<head>" +
                            "<title>Discord</title>" +
                            "<link rel=\"icon\" type=\"image/png\" href=\"https://i.pinimg.com/originals/e3/54/65/e354658df9dd581a078b071adad7a030.png\" />" +
                            "<meta charset=utf-8>" +
                            "<meta name=viewport content=\"width=device-width\">" +
                            "<script src=\"https://twemoji.maxcdn.com/v/latest/twemoji.min.js\" crossorigin=\"anonymous\"></script>" +
                            "<style>" +
                            "serverInfo{display:none}userInfo{display:none}@font-face{font-family:Whitney;src:url(https://discordapp.com/assets/6c6374bad0b0b6d204d8d6dc4a18d820.woff);font-weight:300}@font-face{font-family:Whitney;src:url(https://discordapp.com/assets/e8acd7d9bf6207f99350ca9f9e23b168.woff);font-weight:400}@font-face{font-family:Whitney;src:url(https://discordapp.com/assets/3bdef1251a424500c1b3a78dea9b7e57.woff);font-weight:500}@font-face{font-family:Whitney;src:url(https://discordapp.com/assets/be0060dafb7a0e31d2a1ca17c0708636.woff);font-weight:600}@font-face{font-family:Whitney;src:url(https://discordapp.com/assets/8e12fb4f14d9c4592eb8ec9f22337b04.woff);font-weight:700}body{font-family:Whitney,\"Helvetica Neue\",Helvetica,Arial,sans-serif;font-size:17px}a{text-decoration:none}a:hover{text-decoration:underline}img{object-fit:contain}.markdown{white-space:pre-wrap;line-height:1.3;overflow-wrap:break-word}.spoiler{border-radius:3px}.quote{border-left:4px solid;border-radius:3px;margin:8px 0;padding-left:10px}.pre{font-family:Consolas,\"Courier New\",Courier,monospace}.pre--multiline{margin-top:4px;padding:8px;border:2px solid;border-radius:5px}.pre--inline{padding:2px;border-radius:3px;font-size:85%}.mention{font-weight:500}.emoji{width:1.45em;height:1.45em;margin:0 1px;vertical-align:-.4em}.emoji--small{width:1rem;height:1rem}.emoji--big{width:3rem;height:3rem}.emoji--large{width:2rem;height:2rem}.info{display:flex;max-width:100%;margin:0 5px 10px}.info__guild-icon-container{flex:0}.info__guild-icon{max-width:88px;max-height:88px}.info__metadata{flex:1;margin-left:10px}.guild-name{font-size:1.4em}.channel-name{font-size:1.2em}.info__channel-topic{margin-top:2px}.info__channel-message-count{margin-top:2px}.info__channel-date-range{margin-top:2px}.logs{max-width:100%;margin-bottom:24px}.message-group{display:flex;margin:0 10px;padding:15px 0;border-top:1px solid}.author-avatar-container{flex:0;width:40px;height:40px}.author-call-container{flex:0;width:20px;height:20px}.author-avatar{border-radius:50%;height:40px;width:40px}.author-call{border-radius:50%;height:20px;width:20px}.cmessages{flex:1;min-width:50%;margin-left:20px}.author-name{font-size:1em;font-weight:500}.timestamp{margin-left:5px;font-size:.75em}.message{padding:2px 5px;margin-right:-5px;margin-left:-5px;background-color:transparent;transition:background-color 1s ease}.content{font-size:.9375em;word-wrap:break-word}.edited-timestamp{margin-left:3px;font-size:.8em}.attachment-thumbnail{margin-top:5px;max-width:50%;max-height:500px;border-radius:3px}.attachment-file{margin-top:15px;max-width:50%;max-height:500px;border-radius:7px;background-color:#2F3136}.embed{margin-top:5px;display:flex;max-width:520px}.embed-color-pill{flex-shrink:0;width:4px;border-top-left-radius:3px;border-bottom-left-radius:3px}.embed-content-container{display:flex;flex-direction:column;padding:8px 10px;border:1px solid;border-top-right-radius:3px;border-bottom-right-radius:3px}.embed-content{width:100%;display:flex}.embed-text{flex:1}.embed-author{display:flex;align-items:center;margin-bottom:5px}.embed-author-icon{width:20px;height:20px;margin-right:9px;border-radius:50%}.embed-author-name{font-size:.875em;font-weight:600}.embed-title{margin-bottom:4px;font-size:.875em;font-weight:600}.embed-description{font-weight:500;font-size:14px}.embed-fields{display:flex;flex-wrap:wrap}.embed-field{flex:0;min-width:100%;max-width:506px;padding-top:10px}.embed-field--inline{flex:1;flex-basis:auto;min-width:150px}.embed-field-name{margin-bottom:4px;font-size:.875em;font-weight:600}.embed-field-value{font-size:.875em;font-weight:500}.embed-thumbnail{flex:0;margin-left:20px;max-width:80px;max-height:80px;border-radius:3px}.embed-image-container{margin-top:10px}.embed-image{max-width:500px;max-height:400px;border-radius:3px}.embed-footer{margin-top:10px}.embed-footer-icon{margin-right:4px;width:20px;height:20px;border-radius:50%;vertical-align:middle}.embed-footer-text{font-weight:500;font-size:.75em}.reactions{display:flex}.reaction{display:flex;align-items:center;margin:6px 2px 2px;padding:3px 6px;border-radius:3px}.reaction-count{min-width:9px;margin-left:6px;font-size:.875em}.bot_tag{margin-left:.3em;background:#7289da;color:#fff;font-size:.625em;padding:1px 2px;border-radius:3px;vertical-align:middle;line-height:1.3;position:relative;top:-.2em}"+
                            "</style>" +
                            "<style>" +
                            "body{background-color:#36393e;color:#dcddde}a{color:#0096cf}.spoiler{background-color:rgba(255,255,255,.1)}.quote{border-color:#4f545c}.pre{background-color:#2f3136!important}.pre--multiline{border-color:#282b30!important;color:#839496!important}.mention{color:#7289da}.guild-name{color:#fff}.channel-name{color:#fff}.info__channel-topic{color:#fff}.message-group{border-color:rgba(255,255,255,.1)}.author-name{color:#fff}.timestamp{color:rgba(255,255,255,.2)}.message--highlighted{background-color:rgba(114,137,218,.2)!important}.message--pinned{background-color:rgba(249,168,37,.05)}.edited-timestamp{color:rgba(255,255,255,.2)}.embed-content-container{background-color:rgba(46,48,54,.3);border-color:rgba(46,48,54,.6)}.embed-author-name{color:#fff}.embed-author-name-link{color:#fff}.embed-title{color:#fff}.embed-description{color:rgba(255,255,255,.6)}.embed-field-name{color:#fff}.embed-field-value{color:rgba(255,255,255,.6)}.embed-footer{color:rgba(255,255,255,.6)}.reaction{background-color:rgba(255,255,255,.05)}.reaction-count{color:rgba(255,255,255,.3)}.entete{display:flex;height:48px;border-bottom:solid 2px;border-color:#242629}.Titre{font-family:Whitney,\"Helvetica Neue\",Helvetica,Arial,sans-serif;font-weight:700;font-size:20px;margin-top:12px;margin-left:5px}.icone{display:flex;margin-left:165vh;margin-top:12px}.ico1,.ico2,.ico3{margin-left:20px}.all-content{display:flex;flex-direction:row;position:relative;height:calc(100vh - 50px)}.menu{border-right:solid 3px #242629;width:150px;margin-left:1vh}.messages{display:flex;flex-direction:column;padding-left:30px;padding-bottom:30px;justify-content:flex-end}.parent{display:flex;padding-top:20px}.avatar{margin-right:10px;width:40px;height:40px}"+
                            "</style>" +
                            "</head>" +
                            "<body>" +
                            "<header class=\"entete\">" +
                            "<p class=\"Titre\">#${channel_name}</p>" +
                            "<div class=\"icone\">" +
                            "<svg x=\"0\" y=\"0\"  class=\"ico1\" aria-hidden=\"false\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\"><path fill=\"currentColor\" d=\"M22 12L12.101 2.10101L10.686 3.51401L12.101 4.92901L7.15096 9.87801V9.88001L5.73596 8.46501L4.32196 9.88001L8.56496 14.122L2.90796 19.778L4.32196 21.192L9.97896 15.536L14.222 19.778L15.636 18.364L14.222 16.95L19.171 12H19.172L20.586 13.414L22 12Z\"></path></svg>" +
                            "<svg x=\"0\" y=\"0\"  class=\"ico2\" aria-hidden=\"false\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\"><path fill=\"currentColor\" d=\"M18.4 4L12 10.4L5.6 4L4 5.6L10.4 12L4 18.4L5.6 20L12 13.6L18.4 20L20 18.4L13.6 12L20 5.6L18.4 4Z\"></path></svg>" +
                            "<svg x=\"0\" y=\"0\"  aria-hidden=\"false\" class=\"ico3\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\"><path fill=\"currentColor\" d=\"M12 2C6.486 2 2 6.487 2 12C2 17.515 6.486 22 12 22C17.514 22 22 17.515 22 12C22 6.487 17.514 2 12 2ZM12 18.25C11.31 18.25 10.75 17.691 10.75 17C10.75 16.31 11.31 15.75 12 15.75C12.69 15.75 13.25 16.31 13.25 17C13.25 17.691 12.69 18.25 12 18.25ZM13 13.875V15H11V12H12C13.104 12 14 11.103 14 10C14 8.896 13.104 8 12 8C10.896 8 10 8.896 10 10H8C8 7.795 9.795 6 12 6C14.205 6 16 7.795 16 10C16 11.861 14.723 13.429 13 13.875Z\"></path></svg>" +
                            "</div>" +
                            "</header>" +
                            "<div class=info>" +
                            "<div class=info__guild-icon-container><img class=info__guild-icon src=https://cdn.discordapp.com/icons/652214929251631124/a31062f7d9ade778ef5846ffc29b31b1.png></div>" +
                            "<div class=info__metadata>" +
                            "<div class=guild-name>${channel_name}</div>" +
                            "<div class=channel-name>Channel name if server</div>" +
                            "<div class=info__channel-message-count>${message_count} messages</div>" +
                            "</div>" +
                            "</div>" +
                            "<div class=logs>",


                    "</div>" +
                            "</body>" +
                            "</html>"};

    public static String startMessageGroup(Message message){
        return "<div class=message-group><div class=author-avatar-container><img class=author-avatar src=" + message.getAuthor().getAvatarUrl() + "></div><div class=cmessages><span class=author-name title=" + message.getAuthor().getFullName() + " data-user-id=" + message.getAuthor().getId() + ">" + message.getAuthor().getUsername() + "</span><span class=timestamp>" + message.getTimestamp() + "</span>";
    }

    public static final String endMessageGroup = "</div></div>";

    public static String addMessageClassic(Message message, boolean reactions){
        StringBuilder sb = new StringBuilder();
        Emote emote = new Emote();

        sb.append("<div class=message message-id=").append(message.getId()).append("><div class=content><span class=markdown>").append(Emoji.parse(emote.convertEmotes(message.getContent()))).append("</span></div>");

        for (Embed embed : message.getEmbeds()) {
            sb.append("<div class=embed><div class=embed-color-pill style=background-color:#").append(Integer.toHexString(embed.getColor())).append("></div><div class=embed-content-container><div class=embed-content><div class=embed-text><div class=embed-author>");

            if (embed.getImage() != null)
                sb.append("<img class=embed-author-icon src=https://cdn.discordapp.com/embed/avatars/0.png>");

            if (embed.getTitle() != null && !embed.getTitle().equals("") && embed.getTitle().equals("null"))
                sb.append("<span class=embed-author-name>").append(embed.getTitle()).append("</span></div></div></div>");
            else sb.append("</div></div></div>");

            if (embed.getDescription() != null)
                if (!embed.getDescription().equals(""))
                sb.append("<div class=embed-text><div class=embed-description><span class=markdown>").append(Emoji.parse(emote.convertEmotes(embed.getDescription()))).append("</span></div><div class=embed-fields></div></div>");

            if (embed.getThumbnail() != null)
                sb.append("<div class=attachment><a href=").append(embed.getThumbnail().getUrl()).append("><img class=attachment-thumbnail src=").append(embed.getThumbnail().getUrl()).append("></a></div>");
            //else System.out.println("No img");

            if (embed.getFooter() != null)
            sb.append("<div class=embed-footer><img class=embed-footer-icon src=").append(embed.getFooter().getIcon_url()).append("><span class=embed-footer-text>").append(embed.getFooter().getText()).append(" • ").append(embed.getTimestamp()).append("</span></div>");

            sb.append("</div></div>");
        }

        for (Attachments attachment : message.getAttachments())
            sb.append("<div class=attachment><a href=").append(attachment.getUrl()).append("><img class=attachment-thumbnail src=").append(attachment.getUrl()).append("></a></div>");


        if (reactions)
            sb.append("<div class=reactions><div class=reactions></div></div>");

        sb.append("</div>");
        return sb.toString();
    }

    public static String addCall(Message messages){
        return "<div class=message-group><div class=author-call-container><img class=author-call src=https://discord.com/assets/c30220457097b064286a8759a9b6c4af.svg></div><div class=cmessages><span class=author-name title=" + messages.getAuthor().getFullName() + " data-user-id=" + messages.getAuthor().getId() + ">" + messages.getAuthor().getUsername() + "</span> <span> Started a call. </span> <span class=timestamp>" + messages.getTimestamp() +"</span>";
    }

    public static String addPin(Message messages, long channelId){
        return "<div class=message-group><div class=author-call-container><img class=author-call src=https://discord.com/assets/5da4cdab01d4d89c593c48c62ae0d937.svg></div><div class=cmessages><span class=author-name title=" + messages.getAuthor().getFullName() + " data-user-id=" + messages.getAuthor().getId() + ">" + messages.getAuthor().getUsername() + "</span> <span> Pinned <a href=\"https://discord.com/channels/@me/" + channelId + "/" + messages.getId() + "\">a message</a> </span> <span class=timestamp>" + messages.getTimestamp() +"</span>";
    }

}
