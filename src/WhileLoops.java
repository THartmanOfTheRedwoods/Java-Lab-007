/**
 * @author Trevor Hartman
 * @author Mike Quist
 * @date 03/07/2023
 */

import java.util.Scanner;

public class WhileLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void eoCount() {
        int numberOfPositives = 0;
        int numberOfNegatives = 0;
        int numberFromUser;
        while (true) {
            System.out.println("Enter a positive or negative integer");
            numberFromUser = Integer.valueOf(s.nextLine());


            if (numberFromUser > 0) {
                numberOfPositives = numberOfPositives + 1;
            }
            if (numberFromUser < 0) {
                numberOfNegatives = numberOfNegatives + 1;
            }
            if (numberFromUser == 0) {
                break;
            }


            System.out.println("Positive numbers: " + numberOfPositives);
            System.out.println("Negative numbers: " + numberOfNegatives);
        }
    }

    public static void mean() {
        int numbers = 0;
        int sum = 0;
        while (true) {
            System.out.println("Enter number (enter 0 to exit)");
            int number = Integer.valueOf(s.nextLine());
            if (number == 0) {
                break;
            }
            sum += number;
            numbers++;
        }

            System.out.println("The mean of the numbers entered is: " + (sum/numbers));

    }

    public static void main(String[] args) {
        eoCount();
        mean();
    }
}
