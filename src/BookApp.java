public class BookApp {
    public static void main(String[] args) {
        // book with default values
        Book book1 = new Book();
        // book with input values
        Book book2 = new Book("Andrew Doolittle", "Harry Potter", "A story about a wizard.");

        System.out.printf("Author: %s\n" +
                        "Title: %s\n" +
                        "Description: %s\n",
                book1.getAuthor(), book1.getTitle(), book1.getDescription());

        System.out.printf("Author: %s\n" +
                        "Title: %s\n" +
                        "Description: %s\n",
                book2.getAuthor(), book2.getTitle(), book2.getDescription());
    }
}
