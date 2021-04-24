package me.uwu.saver.objs;

public class Message {
    private String id;
    private int type;
    private String content;
    private String channel_id;
    private User author;
    private Attachments[] attachments;
    private Embed[] embeds;
    private Mentions[] mentions;
    private Mention_roles[] mention_roles;
    private boolean pinned;
    private boolean mention_everyone;
    private boolean tts;
    private String timestamp;
    private String edited_timestamp;
    private String flags;
    private Component[] components;
    private Reaction[] reactions;

    public Message(String id, int type, String content, String channel_id, User author, Attachments[] attachments, Embed[] embeds, Mentions[] mentions, Mention_roles[] mention_roles, boolean pinned, boolean mention_everyone, boolean tts, String timestamp, String edited_timestamp, String flags, Component[] components, Reaction[] reactions) {
        this.id = id;
        this.type = type;
        this.content = content;
        this.channel_id = channel_id;
        this.author = author;
        this.attachments = attachments;
        this.embeds = embeds;
        this.mentions = mentions;
        this.mention_roles = mention_roles;
        this.pinned = pinned;
        this.mention_everyone = mention_everyone;
        this.tts = tts;
        this.timestamp = timestamp;
        this.edited_timestamp = edited_timestamp;
        this.flags = flags;
        this.components = components;
        this.reactions = reactions;
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

    public Embed[] getEmbeds() {
        return embeds;
    }

    public void setEmbeds(Embed[] embeds) {
        this.embeds = embeds;
    }

    public Component[] getComponents() {
        return components;
    }

    public void setComponents(Component[] components) {
        this.components = components;
    }

    public Reaction[] getReactions() {
        return reactions;
    }

    public void setReactions(Reaction[] reactions) {
        this.reactions = reactions;
    }
}
