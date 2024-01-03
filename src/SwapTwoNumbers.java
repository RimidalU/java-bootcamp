import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        double num1, num2, variable;
        Scanner input = new Scanner(System.in);
        System.out.println("Inter two numbers: ");
        num1 = input.nextDouble();
        num2 = input.nextDouble();
        System.out.println("Number1: " + num1);
        System.out.println("Number2: " + num2);
        System.out.println("Swap numbers...");
        System.out.println("");
        variable = num1;
        num1 = num2;
        num2 = variable;
        System.out.println("Number1: " + num1);
        System.out.println("Number2: " + num2);
    }
}
