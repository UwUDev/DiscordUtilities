package me.uwu.saver.objs;

public class Reaction {
    private Emoji emoji;
    private int count;
    private boolean me;

    public Reaction(Emoji emoji, int count, boolean me) {
        this.emoji = emoji;
        this.count = count;
        this.me = me;
    }

    public Emoji getEmoji() {
        return emoji;
    }

    public void setEmoji(Emoji emoji) {
        this.emoji = emoji;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isMe() {
        return me;
    }

    public void setMe(boolean me) {
        this.me = me;
    }
}
