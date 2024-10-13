package lamp;

public class main {
    public static void main(String[] args) {
        Lamp firstLamp = new Lamp();
        firstLamp.switchOn();
        firstLamp.displayState();

        Lamp secondLamp = new Lamp();
        secondLamp.switchOff();
        secondLamp.displayState();
    }
}
