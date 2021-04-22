package me.uwu.saver.objs;

public class SelfUser {
    private String id;
    private String username;
    private String avatar;
    private String discriminator;
    private String public_flags;
    private String flags;
    private String locale;
    private boolean nsfw_allowed;
    private boolean mfa_enabled;
    private int premium_type;
    private String email;
    private boolean verified;
    private String phone;

    public SelfUser(String id, String username, String avatar, String discriminator, String public_flags, String flags, String locale, boolean nsfw_allowed, boolean mfa_enabled, int premium_type, String email, boolean verified, String phone) {
        this.id = id;
        this.username = username;
        this.avatar = avatar;
        this.discriminator = discriminator;
        this.public_flags = public_flags;
        this.flags = flags;
        this.locale = locale;
        this.nsfw_allowed = nsfw_allowed;
        this.mfa_enabled = mfa_enabled;
        this.premium_type = premium_type;
        this.email = email;
        this.verified = verified;
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public String getFullUsername() {
        return username + "#" + discriminator;
    }

    public String getAvatar() {
        return avatar;
    }

    public String getAvatarUrl() {
        return "https://cdn.discordapp.com/avatars/" + id + "/" + avatar + ".gif?size=256";
    }

    public String getDiscriminator() {
        return discriminator;
    }

    public String getPublic_flags() {
        return public_flags;
    }

    public String getFlags() {
        return flags;
    }

    public String getLocale() {
        return locale;
    }

    public boolean isNsfw_allowed() {
        return nsfw_allowed;
    }

    public boolean isMfa_enabled() {
        return mfa_enabled;
    }

    public int getPremium_type() {
        return premium_type;
    }

    public String getEmail() {
        return email;
    }

    public boolean isVerified() {
        return verified;
    }

    public String getPhone() {
        return phone;
    }
}
