import java.util.Scanner;

public class ReversNumber {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Inter integer: ");
        num = input.nextInt();
        gcd(num);
    }

    private static void gcd(int num) {
        if (num == 0) {
            System.out.println();
            return;
        } else {
            System.out.print(num % 10);
            gcd(num / 10);
        }
    }

}
