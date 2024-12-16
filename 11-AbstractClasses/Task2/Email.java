package Task2;
import Task3.User;

public class Email extends Message {

    private String messageSubject;
    private User myUser;


    public Email(String messageSubject, User myUser) {
        this.messageSubject = messageSubject;
        this.myUser = myUser;
    }


    public Email(String text, String messageSubject, User myUser) {
        super(text);
        this.messageSubject = messageSubject;
        this.myUser = myUser;
    }


    public String getMessageSubject() {
        return messageSubject;
    }


    public void setMessageSubject(String messageSubject) {
        this.messageSubject = messageSubject;
    }

    public User getMyUser() {
        return myUser;
    }


    public void setMyUser(User myUser) {
        this.myUser = myUser;
    }


    public void send() {
        System.out.println("Receiving user: " + getMyUser().toString() + "\nMessage subject: " + 
                            getMessageSubject() + "\nText: " + getText());
    }


}
