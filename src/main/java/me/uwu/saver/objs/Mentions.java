package me.uwu.saver.objs;

public class Mentions {
    private String id;
    private String username;
    private String avatar;
    private String discriminator;
    private String public_flags;

    public Mentions(String id, String username, String avatar, String discriminator, String public_flags) {
        this.id = id;
        this.username = username;
        this.avatar = avatar;
        this.discriminator = discriminator;
        this.public_flags = public_flags;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getDiscriminator() {
        return discriminator;
    }

    public void setDiscriminator(String discriminator) {
        this.discriminator = discriminator;
    }

    public String getPublic_flags() {
        return public_flags;
    }

    public void setPublic_flags(String public_flags) {
        this.public_flags = public_flags;
    }
}
