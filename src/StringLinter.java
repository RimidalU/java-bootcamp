import java.util.Scanner;

public class StringLinter {
    public static void main(String[] args) {
        String currentString;

        Scanner input = new Scanner(System.in);
        System.out.println("Inter string: ");
        currentString = input.nextLine();

        removeDoubleLetters(currentString);
    }

    private static void removeDoubleLetters(String currentString) {
        String[] parts = currentString.split("");
        String newString = parts[0];

        for (int i = 0; i < parts.length - 1; i++) {
            if (!parts[i + 1].equals(parts[i])) {
                newString += parts[i + 1];
            }
        }
        System.out.println("The given string: " + currentString);
        System.out.println("The Edited string: " + newString);
    }
}
