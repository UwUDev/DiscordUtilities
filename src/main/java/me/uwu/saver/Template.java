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
                            "        body {\n" +
                            "            background-color: #36393F;\n" +
                            "            color: #fff;\n" +
                            "            font-family: 'Roboto', serif;\n" +
                            "        }\n" +
                            "\n" +
                            "        img {\n" +
                            "            border-radius: 50%;\n" +
                            "\n" +
                            "            max-width: 48px;\n" +
                            "            height: auto;\n" +
                            "        }\n" +
                            "\n" +
                            "        .parent{\n" +
                            "            /*border:1px solid red;*/\n" +
                            "            width:100%;\n" +
                            "            height:64px;\n" +
                            "            position:relative;\n" +
                            "            white-space: nowrap;\n" +
                            "            overflow: hidden;\n" +
                            "        }\n" +
                            "\n" +
                            "        .rightchild{\n" +
                            "            top: 5px;\n" +
                            "            left: 60px;\n" +
                            "            width:100%;\n" +
                            "            right:0;\n" +
                            "            bottom: 0;\n" +
                            "            /*background:red;*/\n" +
                            "            position:absolute;\n" +
                            "        }\n" +
                            "    </style>\n" +
                            "</head>\n" +
                            "<body>",


                    "</body>" +
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
