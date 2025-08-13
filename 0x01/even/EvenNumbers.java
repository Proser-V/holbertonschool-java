public class EvenNumbers {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i += 2) {
            if (i != 98) {
                System.out.printf("%d, ", i);
            } else {
                System.out.printf("%d%n", i);
            }
        }
    }
}
