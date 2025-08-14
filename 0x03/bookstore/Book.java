import exceptions.InvalidBookException;
import exceptions.InvalidAuthorException;

public class Book {
    private String title;
    private String author;
    public float price;

    public Book(String title, String author, float price) throws InvalidBookException, InvalidAuthorException {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() { return title; }
    public void setTitle(String title) throws InvalidBookException {
        if (title.length() < 3) {
            throw new InvalidBookException("Invalid book title");
        } else {
            this.title = title;
        }
    }

    public String getAuthor() { return author; }
    public void setAuthor(String author) throws InvalidAuthorException {
        for (int i = 0; i < author.length(); i++) {
            char c = author.charAt(i);
            if (c == ' ') {
                throw new InvalidAuthorException("Invalid book author");
            }
        }
        this.author = author;
    }

    public float getPrice() { return price; }
    public void setPrice(float price) { this.price = price; }
}
