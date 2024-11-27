public class Book {
    private String book_title;
    private int number_of_pages;
    private Writer myWriter;


    public Book(String book_title, int number_of_pages, Writer myWriter) {
        this.book_title = book_title;
        this.number_of_pages = number_of_pages;
        this.myWriter = myWriter;
    }

    @Override
    public String toString() {
        return "Book [book_title=" + book_title + ", number_of_pages=" + number_of_pages + ", myWriter=" + myWriter
                + "]";
    }

    public String getBook_title() {
        return book_title;
    }


    public void setBook_title(String book_title) {
        this.book_title = book_title;
    }


    public int getNumber_of_pages() {
        return number_of_pages;
    }


    public void setNumber_of_pages(int number_of_pages) {
        this.number_of_pages = number_of_pages;
    }


    public Writer getMyWriter() {
        return myWriter;
    }


    public void setMyWriter(Writer myWriter) {
        this.myWriter = myWriter;
    }

    

    
}
