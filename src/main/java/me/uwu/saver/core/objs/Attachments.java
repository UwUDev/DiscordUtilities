package me.uwu.saver.core.objs;

public class Attachments {
    private String id;
    private String filename;
    private String size;
    private String url;
    private String proxy_url;
    private int width;
    private int height;
    private String content_type;

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getProxy_url() {
        return proxy_url;
    }

    public void setProxy_url(String proxy_url) {
        this.proxy_url = proxy_url;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getContent_type() {
        return content_type;
    }

    public void setContent_type(String content_type) {
        this.content_type = content_type;
    }
}
