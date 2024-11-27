public class Main {
    public static void main(String[] args) {
        Writer writer = new Writer("Jan","Kowalski",75,"Poland");
        Book book = new Book("Title", 350, writer);

        System.out.println(writer.toString());
        System.out.println(book.toString());
    }
}
