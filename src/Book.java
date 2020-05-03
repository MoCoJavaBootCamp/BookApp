public class Book {

    private String title;
    private String author;
    private String description;
    private double price;
    private boolean inStock;

    //default constructor
    Book() {
        this.title = "default title";
        this.author = "default author";
        this.description = "default description";
        this.price = 20.00;
        this.inStock = false;
    }

    //constructor w/ parameters
    Book(String title, String author, String description) {
        this.title = title;
        this.author = author;
        this.description = description;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public void getDisplayText() {
        System.out.printf("Author: %s\nTitle: %s\nDescription: %s\n", this.getAuthor(), this.getTitle(), this.getDescription());
    }


}
