package me.uwu.saver.objs;
/* {
                "id": "593231228258222093",
                "username": "xTrM_",
                "avatar": "60742f0d6d4d559043a3af3ac1c9ac07",
                "discriminator": "0001",
                "public_flags": 128
            }
*/
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
