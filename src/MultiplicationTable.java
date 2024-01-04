import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int number, quantity;
        Scanner input = new Scanner(System.in);

        System.out.println("Input integer: ");
        number = input.nextInt();
        System.out.println("Up to what number should I show multiplication?");
        quantity = input.nextInt();

        for (int i = 0; i <= quantity; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }
    }
}
