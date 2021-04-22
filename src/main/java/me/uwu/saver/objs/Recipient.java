package me.uwu.saver.objs;

public class Recipient {
    protected long id;
    protected String username;
    protected String avatar;
    protected String discriminator;
    protected long public_flags;

    public Recipient(long id, String username, String avatar, String discriminator, long public_flags) {
        this.id = id;
        this.username = username;
        this.avatar = avatar;
        this.discriminator = discriminator;
        this.public_flags = public_flags;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public long getPublic_flags() {
        return public_flags;
    }

    public void setPublic_flags(long public_flags) {
        this.public_flags = public_flags;
    }
}
