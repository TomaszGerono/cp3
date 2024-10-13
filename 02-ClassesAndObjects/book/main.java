package book;

public class main {
    public static void main(String[] args) {
        Book book = new Book();


        book.openBook();
        book.displayState();



        book.goToSpecifiedPage(55);
        book.readCurrentPage();
        book.displayState();



        book.closeBook();
        book.displayState();
    }
}
