package Task2;
import Task3.User;

public class SMS extends Message {
    private User myUser;

    


    public SMS(User myUser) {
        this.myUser = myUser;
    }

    public SMS(String text, User myUser) {
        super(text);
        this.myUser = myUser;
    }

    public User getMyUser() {
        return myUser;
    }

    public void setMyUser(User myUser) {
        this.myUser = myUser;
    }

    public void send() {
        System.out.println("User: " + getMyUser().toString() 
                            + "\nText: " + getText());
    }

    
}
