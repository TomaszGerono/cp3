class main{

    public static void main(String args[]) {
        Library myLibrary = new Library();
    
        Book myBook1 = new Book("Jan", "Nowak");
        myLibrary.addBook(myBook1);

        Book myBook2 = new Book("Jan", "Kowalski");
        myLibrary.addBook(myBook2);

        myLibrary.displayBooks();
    }

}
