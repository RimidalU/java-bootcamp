import java.util.Scanner;

public class EuclideanAlgorithms {
    public static void main(String[] args) {
        int num1, num2;
        Scanner input = new Scanner(System.in);
        System.out.println("Inter two integers: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        System.out.println("The greatest common divisor (GCD) of the " + num1 + " and " + num2 + " is equal: "
                + gcd(num1, num2));
    }

    private static int gcd(int num1, int num2) {
        if (num2 != 0) {
            return gcd(num2, num1 % num2);
        } else {
            return num1;
        }
    }
}
