package me.uwu.saver.objs;

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
