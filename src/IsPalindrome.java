import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, sum = 0, r, temp;

        System.out.println("Inter any integer: ");
        num1 = input.nextInt();
        temp = num1;

        while (num1 != 0) {
            r = num1 % 10;
            sum = sum * 10 + r;
            num1 = num1 / 10;
        }
        if (temp == sum) {
            System.out.println("Number " + temp + " is a palindrome");
        } else {
            System.out.println("Number " + temp + " is not a palindrome");
        }
    }

}
