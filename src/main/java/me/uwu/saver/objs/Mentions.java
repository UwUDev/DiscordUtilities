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
}
