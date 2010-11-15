package se.janlindblom.java.tubes;

/**
 *
 * @author Jan Lindblom (lindblom.jan@gmail.com)
 * @version 0.2
 */
public abstract class Message {
    private int sender;
    private int recipient;
    private Type type;
    private Payload payload;

    public Message() {
        this.setSender(0);
        this.setRecipient(0);
        this.setType(null);
        this.setPayload(null);
    }

    public int getSender() {
        return this.sender;
    }

    public void setSender(int sender) {
        this.sender = sender;
    }

    public int getRecipient() {
        return this.recipient;
    }

    public void setRecipient(int recipient) {
        this.recipient = recipient;
    }

    public Type getType() {
        return this.type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Payload getPayload() {
        return this.payload;
    }

    public void setPayload(Payload payload) {
        this.payload = payload;
    }
}
