package Task2;

public abstract class Message {
    private String text;

    public Message() {}

    public Message(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int charNumber() {
        return this.text.length();
    }

    public abstract void send();

    

    
}
