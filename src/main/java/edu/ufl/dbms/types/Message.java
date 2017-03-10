package edu.ufl.dbms.types;

/***
 *
 */
public class Message {

    private String payload;
    private Long timestamp;

    @Override
    public String toString() {
        return "Message{" +
                "payload='" + payload + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }

    public Message() {
    }

    public String getPayload() {

        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Message(String payload, Long timestamp) {
        this.payload = payload;
        this.timestamp = timestamp;
    }
}
