package me.uwu.saver.objs;

public class Embed {
    protected String type;
    protected String url;
    protected String timestamp;
    protected String title;
    protected String description;
    protected int color;
    protected Footer footer;
    protected Image image;
    protected Thumbnail thumbnail;
    protected Video video;

    public Embed(String type, String url, String timestamp, String title, String description, int color, Footer footer, Image image, Thumbnail thumbnail, Video video) {
        this.type = type;
        this.url = url;
        this.timestamp = timestamp;
        this.title = title;
        this.description = description;
        this.color = color;
        this.footer = footer;
        this.image = image;
        this.thumbnail = thumbnail;
        this.video = video;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public Thumbnail getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(Thumbnail thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Footer getFooter() {
        return footer;
    }

    public void setFooter(Footer footer) {
        this.footer = footer;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }
}
