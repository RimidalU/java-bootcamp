import java.util.Scanner;

public class RecursiveFactorial {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Inter integer: ");
        number = input.nextInt();
        System.out.println("The factorial of the " + number + " is equal tor: " + calculate(number));
    }

    public static int calculate(int number) {
        if (number == 0) {
            return 1;
        } else {
            return (number * calculate(number - 1));
        }
    }
}
