public class Book {
    private String book_name;
    private String book_author;
    private int number_of_pages;
    private String date_of_creation;
    private String genre;
    private boolean reading;

    private void readBook() {
        this.reading = true;
    }

    private void stopReading() {
        this.reading = false;
    }
}
