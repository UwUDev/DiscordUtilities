package me.uwu.saver.objs;

/*
* "id": "825083656862826523",
                "filename": "image0.png",
                "size": 229981,
                "url": "https://cdn.discordapp.com/attachments/811741913454739477/825083656862826523/image0.png",
                "proxy_url": "https://media.discordapp.net/attachments/811741913454739477/825083656862826523/image0.png",
                "width": 275,
                "height": 367,
                "content_type": "image/png"
                * */

public class Attachments {
    protected String id;
    protected String filename;
    protected String size;
    protected String url;
    protected String proxy_url;
    protected int width;
    protected int height;
    protected String content_type;

    public Attachments(String id, String filename, String size, String url, String proxy_url, int width, int height, String content_type) {
        this.id = id;
        this.filename = filename;
        this.size = size;
        this.url = url;
        this.proxy_url = proxy_url;
        this.width = width;
        this.height = height;
        this.content_type = content_type;
    }

    public String getUrl() {
        return url;
    }
}
