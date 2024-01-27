
// Suppose you want to hold a never-ending birthday party, where every day of the year someone at the party has a birthday. How many people do you need to get together to have such a party?

// Your task in this program is to write a method neverEndingBirthdayParty that simulates building a group of people one person at a time. Each person is presumed to have a birthday that is randomly chosen from all possible birthdays. Once it becomes the case that each day of the year, someone in your group has a birthday, your program should return the number of people in the group and exit.

// In writing your solution, you should assume the following:

// • There are 366 possible birthdays (this includes February 29).

// • All birthdays are equally likely, including February 29. You might find it useful to represent birthdays as integers between 0 and 365, inclusive.

import java.util.HashSet;

public class NeverEndingBirthdayCelebrations {
    public static void main(String[] args) {
        int guestNumber = 0;
        HashSet<Integer> birthdaysDate = new HashSet<Integer>();

        while (birthdaysDate.size() < 366) {
            int newGuestBirthday = getRandomNumber(0, 366);
            birthdaysDate.add(newGuestBirthday);
            guestNumber++;
        }

        System.out.println("The guests number are: " + guestNumber);
    }

    private static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
