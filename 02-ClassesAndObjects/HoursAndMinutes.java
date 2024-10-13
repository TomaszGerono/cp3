public class HoursAndMinutes {
    public static void main(String[] args) {
        int hours = 14;
        int minutes = 27;

        System.out.printf("time: %02d:%02d",hours,minutes);
        System.out.println();

        int minutesFromMidnight = hours * 60 + minutes;
        int secondsFromMidnight = hours * 60 * 60 + minutes * 60;


        System.out.println("minutes from midnight: " + minutesFromMidnight);
        System.out.println("seconds from midnight: " +secondsFromMidnight);
    }
}
