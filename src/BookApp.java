public class BookApp {
    public static void main(String[] args) {
        // book with default values
        Book book1 = new Book();
        // book with input values
        Book book2 = new Book("Andrew Doolittle", "Harry Potter", "A story about a wizard.");

        book1.getDisplayText();
        book2.getDisplayText();
    }
}
