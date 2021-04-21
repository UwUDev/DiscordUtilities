package me.uwu.saver.objs;

/*
"url": "http://pays.host/uploads/4c2479b1-278c-43a7-989f-efae3e44696b/2D3kxW2O.png",
"proxy_url": "https://images-ext-1.discordapp.net/external/k2HOqBvN5btbvGQpum9drDi4rGbpS2MFOe_7O3TldiY/http/pays.host/uploads/4c2479b1-278c-43a7-989f-efae3e44696b/2D3kxW2O.png",
"width": 1279,
"height": 1021
*/

public class Thumbnail {
    protected String url;
    protected String proxy_url;
    protected int width;
    private int height;

    public Thumbnail(String url, String proxy_url, int width, int height) {
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
