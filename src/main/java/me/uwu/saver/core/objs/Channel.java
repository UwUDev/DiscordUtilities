package me.uwu.saver.core.objs;

public class Channel {
    private long id;
    private int type;
    private long last_message_id;
    private String last_pin_timestamp;
    private Recipient[] recipients;
    private String name;
    private String icon;
    private long owner_id;

    public Channel(long id, int type, long last_message_id, String last_pin_timestamp, Recipient[] recipients, String name, String icon, long owner_id) {
        this.id = id;
        this.type = type;
        this.last_message_id = last_message_id;
        this.last_pin_timestamp = last_pin_timestamp;
        this.recipients = recipients;
        this.name = name;
        this.icon = icon;
        this.owner_id = owner_id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public long getLast_message_id() {
        return last_message_id;
    }

    public void setLast_message_id(long last_message_id) {
        this.last_message_id = last_message_id;
    }

    public String getLast_pin_timestamp() {
        return last_pin_timestamp;
    }

    public void setLast_pin_timestamp(String last_pin_timestamp) {
        this.last_pin_timestamp = last_pin_timestamp;
    }

    public Recipient[] getRecipients() {
        return recipients;
    }

    public void setRecipients(Recipient[] recipients) {
        this.recipients = recipients;
    }

    public String getName() {
        return name;
    }

    public String getRealChannelName(){
        if (type == 1)
            return recipients[0].getUsername();
        else return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public long getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(long owner_id) {
        this.owner_id = owner_id;
    }

    public boolean isDM(){
        return type == 1;
    }

    public boolean isGroup(){
        return type == 3;
    }

    public boolean isServerChannel(){
        return !isDM() && !isGroup();
    }
}
