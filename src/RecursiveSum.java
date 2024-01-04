import java.util.Scanner;

public class RecursiveSum {

    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Inter integer: ");
        number = input.nextInt();
        System.out.println("The sum of the first " + number + " numbers is equal tor: " + calculate(number));
    }

    public static int calculate(int number) {
        if (number == 0) {
            return 0;
        } else {
            return (number + calculate(number - 1));
        }
    }
}
