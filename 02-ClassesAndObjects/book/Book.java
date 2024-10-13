package book;
// attributes: bookTitle, bookAuthor, bookGenre, yearOfPublishing, numberOfPages, bookPrice, isBookOpen, isCurrentlyReading, currentPage
// methods: openBook, closeBook, readCurrentPage, goToSpecifiedPage, displayState


public class Book {
    String bookTitle;
    String bookAuthor;
    String bookGenre;
    int yearOfPublishing;
    int numberOfPages;
    int bookPrice;
    boolean isBookOpen = false;
    boolean isCurrentlyReading = false;
    int currentPage = 1;


    public void openBook() {
        if (isBookOpen == false) {
            isBookOpen = true;
        }
    } 

    public void closeBook() {
        if (isBookOpen == true) {
            isBookOpen = false;
        }
    }

    public void displayState() {
        if (isBookOpen && isCurrentlyReading) {
            System.out.println("Currently reading book - page " + currentPage);
        }
        else {
            System.out.println("Currently not reading book");
        }
    }

    public void readCurrentPage() {
        isCurrentlyReading = true;
    }

    public void goToSpecifiedPage(int pageNumber) {
        currentPage = pageNumber;
    }
}


