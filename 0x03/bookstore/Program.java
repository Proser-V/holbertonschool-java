import java.util.Locale;

public class Program {
        public static void main(String[] args) {
            Locale.setDefault(Locale.FRANCE);
                try {
                        Book book1 = new Book(
                                        "Robinson Crusoe",
                                        "Daniel Defoe",
                                        56);

                        System.out.printf("Title: %s - Author: %s - Price: %.2f\n",
                                        book1.getTitle(),
                                        book1.getAuthor(),
                                        book1.getPrice());
                } catch (Exception ex) {
                        System.out.println(ex.getMessage() + "\n");
                }

                try {
                        GoldEditionBook goldEditionBook1 = new GoldEditionBook(
                                        "Frankenstein",
                                        "Mary Shelley",
                                        38.30f);

                        System.out.printf("Title: %s - Author: %s - Price: %.2f\n",
                                        goldEditionBook1.getTitle(),
                                        goldEditionBook1.getAuthor(),
                                        goldEditionBook1.getPrice());

                } catch (Exception ex) {
                        System.out.println(ex.getMessage() + "\n");
                }

                try {
                        GoldEditionBook goldEditionBook2 = new GoldEditionBook(
                                        "Alice's Adventures in Wonderland",
                                        "LewisCarroll",
                                        21.88f);

                        System.out.printf("Title: %s - Author: %s - Price: %.2f\n",
                                        goldEditionBook2.getTitle(),
                                        goldEditionBook2.getAuthor(),
                                        goldEditionBook2.getPrice());
                } catch (Exception ex) {
                        System.out.println(ex.getMessage() + "\n");
                }

                try {
                        Book book2 = new Book(
                                        "D",
                                        "Bram Stoker",
                                        15.99f);

                        System.out.printf("Title: %s - Author: %s - Price: %.2f\n",
                                        book2.getTitle(),
                                        book2.getAuthor(),
                                        book2.getPrice());
                } catch (Exception ex) {
                        System.out.println(ex.getMessage() + "\n");
                }

                try {
                        Book book3 = new Book(
                                        "The Great Gatsby",
                                        "F. Scott Fitzgerald",
                                        0f);

                        System.out.printf("Title: %s - Author: %s - Price: %.2f\n",
                                        book3.getTitle(),
                                        book3.getAuthor(),
                                        book3.getPrice());
                } catch (Exception ex) {
                        System.out.println(ex.getMessage() + "\n");
                }
        }
}