package me.uwu.saver.objs;
public class Mentions {
    protected String id;
    protected String username;
    protected String avatar;
    protected String discriminator;
    protected String public_flags;

    public Mentions(String id, String username, String avatar, String discriminator, String public_flags) {
        this.id = id;
        this.username = username;
        this.avatar = avatar;
        this.discriminator = discriminator;
        this.public_flags = public_flags;
    }
}
