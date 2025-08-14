import exceptions.InvalidBookException;
import exceptions.InvalidAuthorException;

public class Book {
    private String title;
    private String author;
    public float price;

    public Book(String title, String author, float price) throws InvalidBookException, InvalidAuthorException {
        setTitle(title);
        setAuthor(author);
        setPrice(price);
    }

    public String getTitle() { return title; }
    public void setTitle(String title) throws InvalidBookException {
        if (title == null || title.trim().length() < 3) {
            throw new InvalidBookException("Invalid book title");
        } else {
            this.title = title;
        }
    }

    public String getAuthor() { return author; }
    public void setAuthor(String author) throws InvalidAuthorException {
        if (author == null || author.trim().split("\\s+").length < 2) {
            throw new InvalidAuthorException("Invalid author name");
        }
        this.author = author;
    }

    public float getPrice() { return price; }
    public void setPrice(float price) throws InvalidBookException {
        if (price == 0) {
            throw new InvalidBookException("Invalid book price");
        } else {
            this.price = price;
        }
    }
}
