package me.uwu.saver.core.objs;

public class User {
    private String id;
    private String username;
    private String avatar;
    private String discriminator;
    private String public_flags;

    public User(String id, String username, String avatar, String discriminator, String public_flags) {
        this.id = id;
        this.username = username;
        this.avatar = avatar;
        this.discriminator = discriminator;
        this.public_flags = public_flags;
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getAvatar() {
        return avatar;
    }

    public String getAvatarUrl() {
        return "https://cdn.discordapp.com/avatars/" + id + "/" + avatar + ".png?size=64";
    }

    public String getDiscriminator() {
        return discriminator;
    }

    public String getFullName(){
        return  username + "#" + discriminator;
    }

    public String getPublic_flags() {
        return public_flags;
    }
}
