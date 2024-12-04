public class Audiobook extends Book{
    private int minutes;
    private int seconds;

    public Audiobook(String author, String title, int minutes, int seconds) {
        super(title, author);
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Minutes: " + this.minutes + "\nSeconds: " + this.seconds);
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

}
