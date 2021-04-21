package me.uwu.saver.objs;

public class Video {
    protected String url;
    protected String proxy_url;
    protected int width;
    private int height;

    public Video(String url, String proxy_url, int width, int height) {
        this.url = url;
        this.proxy_url = proxy_url;
        this.width = width;
        this.height = height;
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
}