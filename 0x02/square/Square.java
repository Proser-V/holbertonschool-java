import java.lang.IllegalArgumentException;

public class Square {
    public static double area(double side) {
            if (side > 0) {
                return side * side;
            } else {
            throw new IllegalArgumentException("Side must have a positive value");
        }
    }
}
