import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Vehicle speed: ");
        int vehicleSpeed = scanner.nextInt();
        scanner.close();
        

        if (vehicleSpeed <= 140 && vehicleSpeed >= 40) {
            System.out.println("Speed is valid: True");
        }

        else {
            System.out.println("Speed is valid: False");
        }


    }
}
