import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Inter integer: ");
        number = input.nextInt();
        System.out
                .println("The Fibonacci sequence of the " + number + " is equal: "
                        + calculate(number));
    }

    public static int calculate(int number) {
        if (number == 0) {
            return 0;
        } else if (number == 1) {
            return 1;
        } else {
            return (calculate(number - 1) + calculate(number - 2));
        }
    }
}
