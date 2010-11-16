package se.janlindblom.java.tubes;

/**
 * A message that can be dropped in an {@link Inlet} to a {@link Tube}.
 * This class should be extended by your own message class.
 *
 * @author Jan Lindblom (lindblom.jan@gmail.com)
 * @version 1.0
 */
public abstract class Message {
    private int sender;
    private int recipient;
    private Type type;
    private Payload payload;

    /**
     * Creates a Message with all parameters set to zero or null.
     */
    public Message() {
        this.sender = 0;
        this.recipient = 0;
        this.type = null;
        this.payload = null;
    }

    /**
     * Returns the sender of this Message.
     *
     * @return the sender of this Message.
     */
    public int getSender() {
        return this.sender;
    }

    /**
     * Sets the sender of this Message.
     *
     * @param sender the sender of this Message.
     */
    public void setSender(int sender) {
        this.sender = sender;
    }

    /**
     * Returns the recipient of this Message.
     *
     * @return the recipient of this Message.
     */
    public int getRecipient() {
        return this.recipient;
    }

    /**
     * Sets the recipient of this Message.
     *
     * @param recipient the recipient of this Message.
     */
    public void setRecipient(int recipient) {
        this.recipient = recipient;
    }

    /**
     * Returns the {@link Type} of this Message.
     *
     * @return the {@link Type} of this Message.
     * @see se.janlindblom.java.tubes.Type
     */
    public Type getType() {
        return this.type;
    }

    /**
     * Sets the {@link Type} of this Message.
     *
     * @param type the {@link Type} of this Message.
     * @see se.janlindblom.java.tubes.Type
     */
    public void setType(Type type) {
        this.type = type;
    }

    /**
     * Returns the {@link Payload} of this Message.
     *
     * @return the {@link Payload} of this Message.
     * @see se.janlindblom.java.tubes.Payload
     */
    public Payload getPayload() {
        return this.payload;
    }

    /**
     * Sets the {@link Payload} of this Message.
     *
     * @param payload the {@link Payload} of this Message.
     * @see se.janlindblom.java.tubes.Payload
     */
    public void setPayload(Payload payload) {
        this.payload = payload;
    }
}
