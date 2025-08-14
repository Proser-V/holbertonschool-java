import exceptions.InvalidBookException;
import exceptions.InvalidAuthorException;

public class GoldEditionBook extends Book {

    public GoldEditionBook(String title, String author, float price)
        throws InvalidBookException, InvalidAuthorException {
            super(title, author, price);
    }

    @Override
    public float getPrice() { return price + (price * 0.3f);}
}
