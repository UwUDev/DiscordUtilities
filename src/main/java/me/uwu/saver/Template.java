package me.uwu.saver;

public class Template {
    public static String[] base = new String[]{
                    "<!DOCTYPE html>\n" +
                            "<html lang=\"en\">\n" +
                            "<head>\n" +
                            "    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto\">\n" +
                            "    <link rel=\"icon\" type=\"image/png\" href=\"https://i.pinimg.com/originals/e3/54/65/e354658df9dd581a078b071adad7a030.png\" />\n" +
                            "    <meta charset=\"UTF-8\">\n" +
                            "    <title>Discord</title>\n" +
                            "    <style>\n" +
                            "        *{\n" +
                            "          margin:0;\n" +
                            "          padding:0;\n" +
                            "        }\n" +
                            "        body {\n" +
                            "            background-color: #36393F;\n" +
                            "            color: #fff;\n" +
                            "            font-family: 'Roboto', serif;\n" +
                            "        }\n" +
                            "\n" +
                            "        img {\n" +
                            "            border-radius: 50%;\n" +
                            "            width: 40px;\n" +
                            "            height: 40px;\n" +
                            "        }\n" +
                            "        .entete{\n" +
                            "          display: flex;\n" +
                            "          height:48px;\n" +
                            "          border-bottom: solid 2px;\n" +
                            "          border-color: #242629;\n" +
                            "        }\n" +
                            "        .Titre{\n" +
                            "          font-family: 'Roboto', serif;\n" +
                            "          font-weight: bold;\n" +
                            "          font-size: 20px;\n" +
                            "          margin-top:12px;\n" +
                            "          margin-left: 5px;\n" +
                            "        }\n" +
                            "        .icone{\n" +
                            "          display: flex;\n" +
                            "          margin-left:165vh;\n" +
                            "          margin-top:12px;\n" +
                            "\n" +
                            "        }\n" +
                            "        /*la barre en haut*/\n" +
                            "        .ico1 ,.ico2 ,.ico3{\n" +
                            "          margin-left: 20px;\n" +
                            "        }\n" +
                            "\n" +
                            "        .all-content {\n" +
                            "          display: flex;\n" +
                            "          flex-direction: row;\n" +
                            "          position: relative;\n" +
                            "          height: calc(100vh - 50px);\n" +
                            "        }\n" +
                            "        /*le menu et le tchate*/\n" +
                            "        .menu {\n" +
                            "          border-right: solid 3px #242629;\n" +
                            "          width:150px;\n" +
                            "          margin-left:1vh;\n" +
                            "        }\n" +
                            "        .messages {\n" +
                            "          display: flex;\n" +
                            "          flex-direction: column;\n" +
                            "          padding-left: 30px;\n" +
                            "          padding-bottom: 30px;\n" +
                            "          justify-content: flex-end;\n" +
                            "        }\n" +
                            "\n" +
                            "        .parent {\n" +
                            "          display: flex;\n" +
                            "          padding-top: 20px;\n" +
                            "        }\n" +
                            "        .avatar{\n" +
                            "          margin-right: 10px;\n" +
                            "          width: 40px;\n" +
                            "          height: 40px;\n" +
                            "        }\n" +
                            "\n" +
                            "        .rightchild {\n" +
                            "\n" +
                            "        }\n" +
                            "    </style>\n" +
                            "</head>\n" +
                            "<body>\n" +
                            "\n" +
                            "<header class=\"entete\">\n" +
                            "  <p class=\"Titre\">Discord Saver</p>\n" +
                            "  <div class=\"icone\">\n" +
                            "    <svg x=\"0\" y=\"0\"  class=\"ico1\" aria-hidden=\"false\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\"><path fill=\"currentColor\" d=\"M22 12L12.101 2.10101L10.686 3.51401L12.101 4.92901L7.15096 9.87801V9.88001L5.73596 8.46501L4.32196 9.88001L8.56496 14.122L2.90796 19.778L4.32196 21.192L9.97896 15.536L14.222 19.778L15.636 18.364L14.222 16.95L19.171 12H19.172L20.586 13.414L22 12Z\"></path></svg>\n" +
                            "    <svg  aria-hidden=\"false\" class=\"ico2\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\"><path fill=\"currentColor\" d=\"M18.4 4L12 10.4L5.6 4L4 5.6L10.4 12L4 18.4L5.6 20L12 13.6L18.4 20L20 18.4L13.6 12L20 5.6L18.4 4Z\"></path></svg>\n" +
                            "    <svg x=\"0\" y=\"0\"  aria-hidden=\"false\" class=\"ico3\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\"><path fill=\"currentColor\" d=\"M12 2C6.486 2 2 6.487 2 12C2 17.515 6.486 22 12 22C17.514 22 22 17.515 22 12C22 6.487 17.514 2 12 2ZM12 18.25C11.31 18.25 10.75 17.691 10.75 17C10.75 16.31 11.31 15.75 12 15.75C12.69 15.75 13.25 16.31 13.25 17C13.25 17.691 12.69 18.25 12 18.25ZM13 13.875V15H11V12H12C13.104 12 14 11.103 14 10C14 8.896 13.104 8 12 8C10.896 8 10 8.896 10 10H8C8 7.795 9.795 6 12 6C14.205 6 16 7.795 16 10C16 11.861 14.723 13.429 13 13.875Z\"></path></svg>\n" +
                            "  </div>\n" +
                            "</header>\n" +
                            "<div class=\"all-content\">\n" +
                            "<nav class=\"menu\">Menu Discord</nav>",


                    "</div>\n" +
                            "</div>\n" +
                            "</body>\n" +
                            "</html>"
    };

    public static String div =
            "<div class=\"parent\" style=\"\">\n" +
                    "        <img src=\"{avatar}\" class=\"avatar\"/>\n" +
                    "        <div class=\"rightchild\">\n" +
                    "            <strong>{username}</strong><br>{message}\n" +
                    "        </div>\n" +
                    "    </div><br>";

}
