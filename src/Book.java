public class Book {

    public String title;
    public String author;
    public String description;
    public double price;
    public boolean inStock;

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

    public String getDisplayText() {
        return "Display text";
    }


}
