import java.util.InputMismatchException;
import java.util.Scanner;

public class RectangleArea {
    public static void area() {
        try (Scanner input = new Scanner(System.in)) {
            double area, length, width;

            System.out.print("Inter the length: ");
            length = input.nextDouble();

            System.out.print("Inter the width: ");
            width = input.nextDouble();
            area = length * width;

            System.out.println("Area of the rectangle amounts to " + area);
        } catch (InputMismatchException exception) {
            System.out.println("Incorrect data entry! Try again!");
        }
    }
}
