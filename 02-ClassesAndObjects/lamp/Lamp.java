package lamp;

public class Lamp {
    boolean isOn = false;

    public void switchOn() {
        isOn = true;
    }

    public void switchOff() {
        isOn = false;
    }

    public void displayState() {
        // variable = (condition) ? expressionTrue :  expressionFalse;
        String output = (isOn == true) ? "The lamp is on" : "The lamp is off";
        System.out.println(output);
    }
}