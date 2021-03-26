package me.uwu.saver;

import me.uwu.saver.objs.Attachments;
import me.uwu.saver.objs.Mention_roles;
import me.uwu.saver.objs.Mentions;
import me.uwu.saver.objs.User;

public class Message {
    protected String id;
    protected int type;
    protected String content;
    protected String channel_id;
    protected User author;
    protected Attachments[] attachments;
    protected Mentions[] mentions;
    protected Mention_roles[] mention_roles;
    protected boolean pinned;
    protected boolean mention_everyone;
    protected boolean tts;
    protected String timestamp;
    protected String edited_timestamp;
    protected String flags;

    public Message(String id, int type, String content, String channel_id, User author, Attachments[] attachments, Mentions[] mentions, Mention_roles[] mention_roles, boolean pinned, boolean mention_everyone, boolean tts, String timestamp, String edited_timestamp, String flags) {
        this.id = id;
        this.type = type;
        this.content = content;
        this.channel_id = channel_id;
        this.author = author;
        this.attachments = attachments;
        this.mentions = mentions;
        this.mention_roles = mention_roles;
        this.pinned = pinned;
        this.mention_everyone = mention_everyone;
        this.tts = tts;
        this.timestamp = timestamp;
        this.edited_timestamp = edited_timestamp;
        this.flags = flags;
    }

    public String getId() {
        return id;
    }

    public int getType() {
        return type;
    }

    public String getContent() {
        return content;
    }

    public String getChannel_id() {
        return channel_id;
    }

    public User getAuthor() {
        return author;
    }

    public Attachments[] getAttachments() {
        return attachments;
    }

    public Mentions[] getMentions() {
        return mentions;
    }

    public Mention_roles[] getMention_roles() {
        return mention_roles;
    }

    public boolean isPinned() {
        return pinned;
    }

    public boolean isMention_everyone() {
        return mention_everyone;
    }

    public boolean isTts() {
        return tts;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public String getEdited_timestamp() {
        return edited_timestamp;
    }

    public String getFlags() {
        return flags;
    }
}
