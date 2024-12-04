import java.util.ArrayList;

class Library {
    ArrayList<Book> books = new ArrayList<Book>();
    ArrayList<Ebook> ebooks = new ArrayList<Ebook>();
    ArrayList<Audiobook> audiobooks = new ArrayList<Audiobook>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void addEbook(Ebook ebook) {
        ebooks.add(ebook);
    }

    public void addAudiobook(Audiobook audiobook) {
        audiobooks.add(audiobook);
    }

    public Book getBookAtIndex(int index) {
        return books.get(index);
    }

    public void displayBooks() {
        for (Book b : books) {
            b.displayDetails();
            System.out.println();
        }
    }
}