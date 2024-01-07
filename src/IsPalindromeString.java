import java.util.Scanner;

public class IsPalindromeString {
    public static void main(String[] args) {
        String currentString;
        Scanner input = new Scanner(System.in);
        System.out.println("Inter string: ");
        currentString = input.nextLine();

        StringBuffer string = new StringBuffer(currentString);
        StringBuffer reverseString = new StringBuffer(currentString).reverse();

        checkIsPalindrome(string, reverseString);
    }

    private static void checkIsPalindrome(StringBuffer currentString, StringBuffer reverseString) {
        if (currentString.compareTo(reverseString) == 0) {
            System.out.println("The string: '" + currentString + "' is a palindrome");
        } else {
            System.out.println("The string: '" + currentString + "' is not a palindrome");
        }
    }
}
