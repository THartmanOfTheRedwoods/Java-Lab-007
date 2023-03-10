/**
 * @author Trevor Hartman
 * @author Bryan Maus
 * Date 03/10/2023
 *
 * @since version 1.0
 *
 * Write a method named **eoCount** that contains a while loop that reads in integers from System.in, and counts the even and odd numbers separately.
 * Write a method named **mean** that contains a while loop that reads in integers from System.in and calculates the mean of the numbers entered.
 */

import java.util.Scanner;
public class WhileLoops {
    private final static Scanner s = new Scanner(System.in);
    public static void eoCount() {
        int number;
        int countOne=0;
        int countTwo=0;
        System.out.println("\nThis program will determine the number of odd and even number you have entered.\n");
        do {
            System.out.print("Enter the number 0 to exit, otherwise enter a random number: ");
            number = s.nextInt();
            if (number != 0) {
                if (number % 2 == 0) {
                    countOne++;
                } else {
                    countTwo++;
                }
            }
        }
        while (number != 0);

        System.out.print("\nThere are " + countOne + " even number(s) ");
        System.out.println("and " + countTwo + " odd number(s).\n\n");
    }
    public static void mean() {
    int number;
    int countOne = 0;
    int countTwo = 0;
        System.out.println("This program will determine the Mean of the numbers you enter.\n");
        do {
            System.out.print("Enter the number 0 to exit, otherwise enter a random number: ");
            number = s.nextInt();
            if (number != 0) {
                countOne = countOne + number;
                countTwo++;
                }
            }
        while (number != 0);
        System.out.println("\nThe Mean of the " + countTwo + " numbers is: " + (countOne/countTwo));
    }
    public static void main(String[] args) {
        eoCount();
        mean();
    }
}
