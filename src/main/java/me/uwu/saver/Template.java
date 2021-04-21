package me.uwu.saver;

import me.uwu.saver.utils.Emoji;

public class Template {
    public static final String[] base = new String[]{
                    "<!DOCTYPE html>\n" +
                            "<html>\n" +
                            "<head>\n" +
                            "    <title>Discord</title>\n" +
                            "    <link rel=\"icon\" type=\"image/png\" href=\"https://i.pinimg.com/originals/e3/54/65/e354658df9dd581a078b071adad7a030.png\" />\n" +
                            "    <meta charset=utf-8>\n" +
                            "    <meta name=viewport content=\"width=device-width\">\n" +
                            "    <script src=\"https://twemoji.maxcdn.com/v/latest/twemoji.min.js\" crossorigin=\"anonymous\"></script>\n" +
                            "    <style>\n" +
                            "        serverInfo {\n" +
                            "            display: none\n" +
                            "        }\n" +
                            "\n" +
                            "        userInfo {\n" +
                            "            display: none\n" +
                            "        }\n" +
                            "\n" +
                            "        @font-face {\n" +
                            "            font-family: Whitney;\n" +
                            "            src: url(https://discordapp.com/assets/6c6374bad0b0b6d204d8d6dc4a18d820.woff);\n" +
                            "            font-weight: 300\n" +
                            "        }\n" +
                            "\n" +
                            "        @font-face {\n" +
                            "            font-family: Whitney;\n" +
                            "            src: url(https://discordapp.com/assets/e8acd7d9bf6207f99350ca9f9e23b168.woff);\n" +
                            "            font-weight: 400\n" +
                            "        }\n" +
                            "\n" +
                            "        @font-face {\n" +
                            "            font-family: Whitney;\n" +
                            "            src: url(https://discordapp.com/assets/3bdef1251a424500c1b3a78dea9b7e57.woff);\n" +
                            "            font-weight: 500\n" +
                            "        }\n" +
                            "\n" +
                            "        @font-face {\n" +
                            "            font-family: Whitney;\n" +
                            "            src: url(https://discordapp.com/assets/be0060dafb7a0e31d2a1ca17c0708636.woff);\n" +
                            "            font-weight: 600\n" +
                            "        }\n" +
                            "\n" +
                            "        @font-face {\n" +
                            "            font-family: Whitney;\n" +
                            "            src: url(https://discordapp.com/assets/8e12fb4f14d9c4592eb8ec9f22337b04.woff);\n" +
                            "            font-weight: 700\n" +
                            "        }\n" +
                            "\n" +
                            "        body {\n" +
                            "            font-family: Whitney, \"Helvetica Neue\", Helvetica, Arial, sans-serif;\n" +
                            "            font-size: 17px\n" +
                            "        }\n" +
                            "\n" +
                            "        a {\n" +
                            "            text-decoration: none\n" +
                            "        }\n" +
                            "\n" +
                            "        a:hover {\n" +
                            "            text-decoration: underline\n" +
                            "        }\n" +
                            "\n" +
                            "        img {\n" +
                            "            object-fit: contain\n" +
                            "        }\n" +
                            "\n" +
                            "        .markdown {\n" +
                            "            white-space: pre-wrap;\n" +
                            "            line-height: 1.3;\n" +
                            "            overflow-wrap: break-word\n" +
                            "        }\n" +
                            "\n" +
                            "        .spoiler {\n" +
                            "            border-radius: 3px\n" +
                            "        }\n" +
                            "\n" +
                            "        .quote {\n" +
                            "            border-left: 4px solid;\n" +
                            "            border-radius: 3px;\n" +
                            "            margin: 8px 0;\n" +
                            "            padding-left: 10px\n" +
                            "        }\n" +
                            "\n" +
                            "        .pre {\n" +
                            "            font-family: Consolas, \"Courier New\", Courier, monospace\n" +
                            "        }\n" +
                            "\n" +
                            "        .pre--multiline {\n" +
                            "            margin-top: 4px;\n" +
                            "            padding: 8px;\n" +
                            "            border: 2px solid;\n" +
                            "            border-radius: 5px\n" +
                            "        }\n" +
                            "\n" +
                            "        .pre--inline {\n" +
                            "            padding: 2px;\n" +
                            "            border-radius: 3px;\n" +
                            "            font-size: 85%\n" +
                            "        }\n" +
                            "\n" +
                            "        .mention {\n" +
                            "            font-weight: 500\n" +
                            "        }\n" +
                            "\n" +
                            "        .emoji {\n" +
                            "            width: 1.45em;\n" +
                            "            height: 1.45em;\n" +
                            "            margin: 0 1px;\n" +
                            "            vertical-align: -.4em\n" +
                            "        }\n" +
                            "\n" +
                            "        .emoji--small {\n" +
                            "            width: 1rem;\n" +
                            "            height: 1rem\n" +
                            "        }\n" +
                            "\n" +
                            "        .emoji--big {\n" +
                            "            width: 3rem;\n" +
                            "            height: 3rem\n" +
                            "        }\n" +
                            "\n" +
                            "        .emoji--large {\n" +
                            "            width: 2rem;\n" +
                            "            height: 2rem\n" +
                            "        }\n" +
                            "\n" +
                            "        .info {\n" +
                            "            display: flex;\n" +
                            "            max-width: 100%;\n" +
                            "            margin: 0 5px 10px\n" +
                            "        }\n" +
                            "\n" +
                            "        .info__guild-icon-container {\n" +
                            "            flex: 0\n" +
                            "        }\n" +
                            "\n" +
                            "        .info__guild-icon {\n" +
                            "            max-width: 88px;\n" +
                            "            max-height: 88px\n" +
                            "        }\n" +
                            "\n" +
                            "        .info__metadata {\n" +
                            "            flex: 1;\n" +
                            "            margin-left: 10px\n" +
                            "        }\n" +
                            "\n" +
                            "        .guild-name {\n" +
                            "            font-size: 1.4em\n" +
                            "        }\n" +
                            "\n" +
                            "        .channel-name {\n" +
                            "            font-size: 1.2em\n" +
                            "        }\n" +
                            "\n" +
                            "        .info__channel-topic {\n" +
                            "            margin-top: 2px\n" +
                            "        }\n" +
                            "\n" +
                            "        .info__channel-message-count {\n" +
                            "            margin-top: 2px\n" +
                            "        }\n" +
                            "\n" +
                            "        .info__channel-date-range {\n" +
                            "            margin-top: 2px\n" +
                            "        }\n" +
                            "\n" +
                            "        .logs {\n" +
                            "            max-width: 100%;\n" +
                            "            margin-bottom: 24px\n" +
                            "        }\n" +
                            "\n" +
                            "        .message-group {\n" +
                            "            display: flex;\n" +
                            "            margin: 0 10px;\n" +
                            "            padding: 15px 0;\n" +
                            "            border-top: 1px solid\n" +
                            "        }\n" +
                            "\n" +
                            "        .author-avatar-container {\n" +
                            "            flex: 0;\n" +
                            "            width: 40px;\n" +
                            "            height: 40px\n" +
                            "        }\n" +
                            "\n" +
                            "        .author-avatar {\n" +
                            "            border-radius: 50%;\n" +
                            "            height: 40px;\n" +
                            "            width: 40px\n" +
                            "        }\n" +
                            "\n" +
                            "        .cmessages {\n" +
                            "            flex: 1;\n" +
                            "            min-width: 50%;\n" +
                            "            margin-left: 20px\n" +
                            "        }\n" +
                            "\n" +
                            "        .author-name {\n" +
                            "            font-size: 1em;\n" +
                            "            font-weight: 500\n" +
                            "        }\n" +
                            "\n" +
                            "        .timestamp {\n" +
                            "            margin-left: 5px;\n" +
                            "            font-size: .75em\n" +
                            "        }\n" +
                            "\n" +
                            "        .message {\n" +
                            "            padding: 2px 5px;\n" +
                            "            margin-right: -5px;\n" +
                            "            margin-left: -5px;\n" +
                            "            background-color: transparent;\n" +
                            "            transition: background-color 1s ease\n" +
                            "        }\n" +
                            "\n" +
                            "        .content {\n" +
                            "            font-size: .9375em;\n" +
                            "            word-wrap: break-word\n" +
                            "        }\n" +
                            "\n" +
                            "        .edited-timestamp {\n" +
                            "            margin-left: 3px;\n" +
                            "            font-size: .8em\n" +
                            "        }\n" +
                            "\n" +
                            "        .attachment-thumbnail {\n" +
                            "            margin-top: 5px;\n" +
                            "            max-width: 50%;\n" +
                            "            max-height: 500px;\n" +
                            "            border-radius: 3px;\n" +
                            "        }\n" +
                            "\n" +
                            "        .attachment-file {\n" +
                            "            margin-top: 15px;\n" +
                            "            max-width: 50%;\n" +
                            "            max-height: 500px;\n" +
                            "            border-radius: 7px;\n" +
                            "            background-color: #2F3136;\n" +
                            "        }\n" +
                            "\n" +
                            "        .embed {\n" +
                            "            margin-top: 5px;\n" +
                            "            display: flex;\n" +
                            "            max-width: 520px\n" +
                            "        }\n" +
                            "\n" +
                            "        .embed-color-pill {\n" +
                            "            flex-shrink: 0;\n" +
                            "            width: 4px;\n" +
                            "            border-top-left-radius: 3px;\n" +
                            "            border-bottom-left-radius: 3px\n" +
                            "        }\n" +
                            "\n" +
                            "        .embed-content-container {\n" +
                            "            display: flex;\n" +
                            "            flex-direction: column;\n" +
                            "            padding: 8px 10px;\n" +
                            "            border: 1px solid;\n" +
                            "            border-top-right-radius: 3px;\n" +
                            "            border-bottom-right-radius: 3px\n" +
                            "        }\n" +
                            "\n" +
                            "        .embed-content {\n" +
                            "            width: 100%;\n" +
                            "            display: flex\n" +
                            "        }\n" +
                            "\n" +
                            "        .embed-text {\n" +
                            "            flex: 1\n" +
                            "        }\n" +
                            "\n" +
                            "        .embed-author {\n" +
                            "            display: flex;\n" +
                            "            align-items: center;\n" +
                            "            margin-bottom: 5px\n" +
                            "        }\n" +
                            "\n" +
                            "        .embed-author-icon {\n" +
                            "            width: 20px;\n" +
                            "            height: 20px;\n" +
                            "            margin-right: 9px;\n" +
                            "            border-radius: 50%\n" +
                            "        }\n" +
                            "\n" +
                            "        .embed-author-name {\n" +
                            "            font-size: .875em;\n" +
                            "            font-weight: 600\n" +
                            "        }\n" +
                            "\n" +
                            "        .embed-title {\n" +
                            "            margin-bottom: 4px;\n" +
                            "            font-size: .875em;\n" +
                            "            font-weight: 600\n" +
                            "        }\n" +
                            "\n" +
                            "        .embed-description {\n" +
                            "            font-weight: 500;\n" +
                            "            font-size: 14px\n" +
                            "        }\n" +
                            "\n" +
                            "        .embed-fields {\n" +
                            "            display: flex;\n" +
                            "            flex-wrap: wrap\n" +
                            "        }\n" +
                            "\n" +
                            "        .embed-field {\n" +
                            "            flex: 0;\n" +
                            "            min-width: 100%;\n" +
                            "            max-width: 506px;\n" +
                            "            padding-top: 10px\n" +
                            "        }\n" +
                            "\n" +
                            "        .embed-field--inline {\n" +
                            "            flex: 1;\n" +
                            "            flex-basis: auto;\n" +
                            "            min-width: 150px\n" +
                            "        }\n" +
                            "\n" +
                            "        .embed-field-name {\n" +
                            "            margin-bottom: 4px;\n" +
                            "            font-size: .875em;\n" +
                            "            font-weight: 600\n" +
                            "        }\n" +
                            "\n" +
                            "        .embed-field-value {\n" +
                            "            font-size: .875em;\n" +
                            "            font-weight: 500\n" +
                            "        }\n" +
                            "\n" +
                            "        .embed-thumbnail {\n" +
                            "            flex: 0;\n" +
                            "            margin-left: 20px;\n" +
                            "            max-width: 80px;\n" +
                            "            max-height: 80px;\n" +
                            "            border-radius: 3px\n" +
                            "        }\n" +
                            "\n" +
                            "        .embed-image-container {\n" +
                            "            margin-top: 10px\n" +
                            "        }\n" +
                            "\n" +
                            "        .embed-image {\n" +
                            "            max-width: 500px;\n" +
                            "            max-height: 400px;\n" +
                            "            border-radius: 3px\n" +
                            "        }\n" +
                            "\n" +
                            "        .embed-footer {\n" +
                            "            margin-top: 10px\n" +
                            "        }\n" +
                            "\n" +
                            "        .embed-footer-icon {\n" +
                            "            margin-right: 4px;\n" +
                            "            width: 20px;\n" +
                            "            height: 20px;\n" +
                            "            border-radius: 50%;\n" +
                            "            vertical-align: middle\n" +
                            "        }\n" +
                            "\n" +
                            "        .embed-footer-text {\n" +
                            "            font-weight: 500;\n" +
                            "            font-size: .75em\n" +
                            "        }\n" +
                            "\n" +
                            "        .reactions {\n" +
                            "            display: flex\n" +
                            "        }\n" +
                            "\n" +
                            "        .reaction {\n" +
                            "            display: flex;\n" +
                            "            align-items: center;\n" +
                            "            margin: 6px 2px 2px;\n" +
                            "            padding: 3px 6px;\n" +
                            "            border-radius: 3px\n" +
                            "        }\n" +
                            "\n" +
                            "        .reaction-count {\n" +
                            "            min-width: 9px;\n" +
                            "            margin-left: 6px;\n" +
                            "            font-size: .875em\n" +
                            "        }\n" +
                            "\n" +
                            "        .bot_tag {\n" +
                            "            margin-left: .3em;\n" +
                            "            background: #7289da;\n" +
                            "            color: #fff;\n" +
                            "            font-size: .625em;\n" +
                            "            padding: 1px 2px;\n" +
                            "            border-radius: 3px;\n" +
                            "            vertical-align: middle;\n" +
                            "            line-height: 1.3;\n" +
                            "            position: relative;\n" +
                            "            top: -.2em\n" +
                            "        }\n" +
                            "    </style>\n" +
                            "    <style>\n" +
                            "        body {\n" +
                            "            background-color: #36393e;\n" +
                            "            color: #dcddde\n" +
                            "        }\n" +
                            "\n" +
                            "        a {\n" +
                            "            color: #0096cf\n" +
                            "        }\n" +
                            "\n" +
                            "        .spoiler {\n" +
                            "            background-color: rgba(255, 255, 255, .1)\n" +
                            "        }\n" +
                            "\n" +
                            "        .quote {\n" +
                            "            border-color: #4f545c\n" +
                            "        }\n" +
                            "\n" +
                            "        .pre {\n" +
                            "            background-color: #2f3136!important\n" +
                            "        }\n" +
                            "\n" +
                            "        .pre--multiline {\n" +
                            "            border-color: #282b30!important;\n" +
                            "            color: #839496!important\n" +
                            "        }\n" +
                            "\n" +
                            "        .mention {\n" +
                            "            color: #7289da\n" +
                            "        }\n" +
                            "\n" +
                            "        .guild-name {\n" +
                            "            color: #fff\n" +
                            "        }\n" +
                            "\n" +
                            "        .channel-name {\n" +
                            "            color: #fff\n" +
                            "        }\n" +
                            "\n" +
                            "        .info__channel-topic {\n" +
                            "            color: #fff\n" +
                            "        }\n" +
                            "\n" +
                            "        .message-group {\n" +
                            "            border-color: rgba(255, 255, 255, .1)\n" +
                            "        }\n" +
                            "\n" +
                            "        .author-name {\n" +
                            "            color: #fff\n" +
                            "        }\n" +
                            "\n" +
                            "        .timestamp {\n" +
                            "            color: rgba(255, 255, 255, .2)\n" +
                            "        }\n" +
                            "\n" +
                            "        .message--highlighted {\n" +
                            "            background-color: rgba(114, 137, 218, .2)!important\n" +
                            "        }\n" +
                            "\n" +
                            "        .message--pinned {\n" +
                            "            background-color: rgba(249, 168, 37, .05)\n" +
                            "        }\n" +
                            "\n" +
                            "        .edited-timestamp {\n" +
                            "            color: rgba(255, 255, 255, .2)\n" +
                            "        }\n" +
                            "\n" +
                            "        .embed-content-container {\n" +
                            "            background-color: rgba(46, 48, 54, .3);\n" +
                            "            border-color: rgba(46, 48, 54, .6)\n" +
                            "        }\n" +
                            "\n" +
                            "        .embed-author-name {\n" +
                            "            color: #fff\n" +
                            "        }\n" +
                            "\n" +
                            "        .embed-author-name-link {\n" +
                            "            color: #fff\n" +
                            "        }\n" +
                            "\n" +
                            "        .embed-title {\n" +
                            "            color: #fff\n" +
                            "        }\n" +
                            "\n" +
                            "        .embed-description {\n" +
                            "            color: rgba(255, 255, 255, .6)\n" +
                            "        }\n" +
                            "\n" +
                            "        .embed-field-name {\n" +
                            "            color: #fff\n" +
                            "        }\n" +
                            "\n" +
                            "        .embed-field-value {\n" +
                            "            color: rgba(255, 255, 255, .6)\n" +
                            "        }\n" +
                            "\n" +
                            "        .embed-footer {\n" +
                            "            color: rgba(255, 255, 255, .6)\n" +
                            "        }\n" +
                            "\n" +
                            "        .reaction {\n" +
                            "            background-color: rgba(255, 255, 255, .05)\n" +
                            "        }\n" +
                            "\n" +
                            "        .reaction-count {\n" +
                            "            color: rgba(255, 255, 255, .3)\n" +
                            "        }\n" +
                            "\n" +
                            "        .entete{\n" +
                            "            display: flex;\n" +
                            "            height:48px;\n" +
                            "            border-bottom: solid 2px;\n" +
                            "            border-color: #242629;\n" +
                            "        }\n" +
                            "        .Titre{\n" +
                            "            font-family: Whitney, \"Helvetica Neue\", Helvetica, Arial, sans-serif;\n" +
                            "            font-weight: bold;\n" +
                            "            font-size: 20px;\n" +
                            "            margin-top:12px;\n" +
                            "            margin-left: 5px;\n" +
                            "        }\n" +
                            "        .icone{\n" +
                            "            display: flex;\n" +
                            "            margin-left:165vh;\n" +
                            "            margin-top:12px;\n" +
                            "\n" +
                            "        }\n" +
                            "        /*la barre en haut*/\n" +
                            "        .ico1 ,.ico2 ,.ico3{\n" +
                            "            margin-left: 20px;\n" +
                            "        }\n" +
                            "\n" +
                            "        .all-content {\n" +
                            "            display: flex;\n" +
                            "            flex-direction: row;\n" +
                            "            position: relative;\n" +
                            "            height: calc(100vh - 50px);\n" +
                            "        }\n" +
                            "        /*le menu et le chat*/\n" +
                            "        .menu {\n" +
                            "            border-right: solid 3px #242629;\n" +
                            "            width:150px;\n" +
                            "            margin-left:1vh;\n" +
                            "        }\n" +
                            "        .messages {\n" +
                            "            display: flex;\n" +
                            "            flex-direction: column;\n" +
                            "            padding-left: 30px;\n" +
                            "            padding-bottom: 30px;\n" +
                            "            justify-content: flex-end;\n" +
                            "        }\n" +
                            "\n" +
                            "        .parent {\n" +
                            "            display: flex;\n" +
                            "            padding-top: 20px;\n" +
                            "        }\n" +
                            "        .avatar{\n" +
                            "            margin-right: 10px;\n" +
                            "            width: 40px;\n" +
                            "            height: 40px;\n" +
                            "        }\n" +
                            "    </style>\n" +
                            "</head>\n" +
                            "<body>\n" +
                            "<header class=\"entete\">\n" +
                            "    <p class=\"Titre\">#${channel_name}</p>\n" +
                            "    <div class=\"icone\">\n" +
                            "        <svg x=\"0\" y=\"0\"  class=\"ico1\" aria-hidden=\"false\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\"><path fill=\"currentColor\" d=\"M22 12L12.101 2.10101L10.686 3.51401L12.101 4.92901L7.15096 9.87801V9.88001L5.73596 8.46501L4.32196 9.88001L8.56496 14.122L2.90796 19.778L4.32196 21.192L9.97896 15.536L14.222 19.778L15.636 18.364L14.222 16.95L19.171 12H19.172L20.586 13.414L22 12Z\"></path></svg>\n" +
                            "        <svg x=\"0\" y=\"0\"  class=\"ico2\" aria-hidden=\"false\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\"><path fill=\"currentColor\" d=\"M18.4 4L12 10.4L5.6 4L4 5.6L10.4 12L4 18.4L5.6 20L12 13.6L18.4 20L20 18.4L13.6 12L20 5.6L18.4 4Z\"></path></svg>\n" +
                            "        <svg x=\"0\" y=\"0\"  aria-hidden=\"false\" class=\"ico3\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\"><path fill=\"currentColor\" d=\"M12 2C6.486 2 2 6.487 2 12C2 17.515 6.486 22 12 22C17.514 22 22 17.515 22 12C22 6.487 17.514 2 12 2ZM12 18.25C11.31 18.25 10.75 17.691 10.75 17C10.75 16.31 11.31 15.75 12 15.75C12.69 15.75 13.25 16.31 13.25 17C13.25 17.691 12.69 18.25 12 18.25ZM13 13.875V15H11V12H12C13.104 12 14 11.103 14 10C14 8.896 13.104 8 12 8C10.896 8 10 8.896 10 10H8C8 7.795 9.795 6 12 6C14.205 6 16 7.795 16 10C16 11.861 14.723 13.429 13 13.875Z\"></path></svg>\n" +
                            "    </div>\n" +
                            "</header>\n" +
                            "<div class=info>\n" +
                            "    <div class=info__guild-icon-container><img class=info__guild-icon src=https://cdn.discordapp.com/icons/652214929251631124/a31062f7d9ade778ef5846ffc29b31b1.png></div>\n" +
                            "    <div class=info__metadata>\n" +
                            "        <div class=guild-name>${channel_name}</div>\n" +
                            "        <div class=channel-name>Channel name if server</div>\n" +
                            "        <div class=info__channel-message-count>${message_count} messages</div>\n" +
                            "    </div>\n" +
                            "</div>\n" +
                            "<div class=logs>",


                    "</div>\n" +
                            "</body>\n" +
                            "</html>"};

    public static String startMessageGroup(Message message){
        return "<div class=message-group>\n" +
                "        <div class=author-avatar-container><img class=author-avatar src=" + message.getAuthor().getAvatarUrl() + "></div>\n" +
                "        <div class=cmessages>\n" +
                "            <span class=author-name title=" + message.getAuthor().getFullName() + " data-user-id=" + message.getAuthor().getId() + ">" + message.getAuthor().getUsername() + "</span><span class=timestamp>" + message.timestamp + "</span>";
    }

    public static final String endMessageGroup = "</div>\n    </div>";

    public static String addMessageClassic(Message message, boolean reactions){
        if (reactions) return "<div class=message message-id=" + message.id + ">\n" +
                "                <div class=content><span class=markdown>" + Emoji.parse(message.content) + "</span></div>\n" +
                "                <div class=reactions>\n" +
                "                    <div class=reactions></div>\n" +
                "                </div>\n" +
                "            </div>";

        return "<div class=message message-id=" + message.id + ">\n" +
                "                <div class=content><span class=markdown>" + Emoji.parse(message.content) + "</span></div>\n" +
                "            </div>";
    }

}
