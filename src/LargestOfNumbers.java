import java.util.Scanner;

public class LargestOfNumbers {
    public static void main(String[] args) {
        double num1, num2, num3;
        Scanner input = new Scanner(System.in);

        System.out.println("Inter any three numbers: ");
        num1 = input.nextDouble();
        num2 = input.nextDouble();
        num3 = input.nextDouble();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("Largest of the numbers is: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("Largest of the numbers is: " + num2);
        } else {
            System.out.println("Largest of the numbers is: " + num3);
        }
    }
}
