import java.text.NumberFormat;
import java.util.Locale;

public class PrintFormattingNumbers {
    public static void main(String[] args) {
        float tax = 0.2456f;
        float value = 7654.321f;
        NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("Value: " + formatter.format(value));
        System.out.printf("Tax: %.2f%%%n", tax);
    }
}
