// Write a class, call it GradesCount, to read a list of grades from the keyboard (integer numbers in the range 0 to 100). Prompt the user with “Please enter a grade between 0 to 100 or -1 to quit: ” each time before reading the next integer. Store each grade in a A, B, C, D or F Vector as follows: 90 to 100 = A, 80 to 89 = B, 70 to 79 = C, 60 to 69 = D, and 0 to 59 = F. (Hint: You cannot store ints as Vector elements, but you can store Integers.)
// Output the total number of grades entered, the number of A, B, C, D and F, and a list of the A’s.
// For example, if the input is...
// 38
// 86
// 92
// 55
// 83
// 42
// 90
// -1
// then the output should be:
// Total number of grades = 7
// Number of A = 2
// Number of B = 2
// Number of C = 0
// Number of D = 0
// Number of F = 3
// The A grades are: 92, 90

import java.util.LinkedList;
import java.util.Iterator;
import java.util.Scanner;

public class GradesCount {
    public static void main(String[] args) {
        LinkedList<Integer> arrGrades = getInts();
        printStatistics(arrGrades);
    }

    private static LinkedList<Integer> getInts() {
        LinkedList<Integer> arrGrades = new LinkedList<Integer>();
        System.out.println("Please enter a grade between 0 to 100 or -1 to quit: ");

        Scanner input = new Scanner(System.in);

        while (input.hasNextLine()) {
            System.out.println("Please enter a grade between 0 to 100 or -1 to quit: ");
            int grade = input.nextInt();
            if (grade == -1) {
                break;
            }
            arrGrades.add(grade);
        }
        return arrGrades;
    }

    private static void printStatistics(LinkedList<Integer> arrGrades) {
        LinkedList<Integer> A = new LinkedList<Integer>();
        LinkedList<Integer> B = new LinkedList<Integer>();
        LinkedList<Integer> C = new LinkedList<Integer>();
        LinkedList<Integer> D = new LinkedList<Integer>();
        LinkedList<Integer> E = new LinkedList<Integer>();
        LinkedList<Integer> F = new LinkedList<Integer>();

        for (int i = 0; i < arrGrades.size(); i += 1) {
            int grade = arrGrades.get(i);

            if (grade >= 90 && grade <= 100) {
                A.add(grade);
            } else if (grade > 80 && grade <= 89) {
                B.add(grade);
            } else if (grade >= 70 && grade <= 79) {
                C.add(grade);
            } else if (grade >= 60 && grade <= 69) {
                D.add(grade);
            } else if (grade >= 50 && grade <= 59) {
                E.add(grade);
            } else if (grade <= 59 && grade >= 0) {
                F.add(grade);
            }
        }

        String gradesA = linkedListToString(A);

        System.out
                .println("Total number of grades: " + arrGrades.size());
        System.out.println("Number of A: " + A.size());
        System.out.println("Number of B: " + B.size());
        System.out.println("Number of C: " + C.size());
        System.out.println("Number of D: " + D.size());
        System.out.println("Number of E: " + E.size());
        System.out.println("Number of F: " + F.size());
        System.out.println("The A grades are: " + gradesA);
    }

    private static String linkedListToString(LinkedList<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        String str = "";

        while (iterator.hasNext()) {
            if (str.length() > 0) {
                str += ", " + iterator.next();
            } else {
                str += iterator.next();
            }
        }
        return str;
    }
}
