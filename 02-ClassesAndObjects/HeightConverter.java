// 1 ft = 30,48 cm = 12 in
// 1 in = 2.54 cm

public class HeightConverter {
    public static void main(String[] args) {

        int heightInCm = 185;
        int totalInches = Math.round(heightInCm / 2.54f);

        int feet = totalInches / 12;
        int inches = totalInches % 12;


        System.out.println("I am " + heightInCm + " cm tall, i.e. " + feet + " feet and " + inches + " inches");
    }
}
