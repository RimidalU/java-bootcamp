import java.util.Scanner;

public class NumberOfVowelsAndConsonants {

    static public void main(String[] args) {
        String stringCurrent, workString, vowels = "aeiou";
        int vowelsChar = 0, consonantsChar = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Inter the string: ");
        stringCurrent = input.nextLine();

        workString = stringCurrent.trim().toLowerCase();

        for (int i = 0; i < workString.length(); i++) {
            if (vowels.indexOf(workString.charAt(i)) >= 0) {
                vowelsChar++;
            } else if (workString.charAt(i) >= 'a' && workString.charAt(i) <= 'z') {
                consonantsChar++;
            }
        }
        System.out.println("In the string '" + stringCurrent + "' :");
        System.out.println("vowels = " + vowelsChar + " and " + "consonants = " + consonantsChar);
    }
}
