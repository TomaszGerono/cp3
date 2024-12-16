import Task1.Circle;
import Task1.Rectangle;
import Task1.Triangle;
import Task2.Message;
import Task2.SMS;
import Task2.Email;
import Task3.User;

public class Main {
    public static void main(String[] args) {

        // Circle myCircle = new Circle(5);
        // Rectangle myRectangle = new Rectangle(2, 10);
        // Triangle myTriangle = new Triangle(15,25);

        // System.out.println(myCircle.area());
        // System.out.println(myRectangle.area());
        // System.out.println(myTriangle.area());

        // System.out.println(myCircle.perimeter());
        // System.out.println(myRectangle.perimeter());
        // System.out.println(myTriangle.perimeter());

        User myUser = new User("John","Smith","john.smith@gmail.com","123-456-789");
     
        SMS mySMS = new SMS(myUser);
        mySMS.setText("Hello, World!");
        mySMS.send();

        System.out.println();

        Email myEmail = new Email("Hello, World!","my message", myUser);
        myEmail.send();


    }
}
