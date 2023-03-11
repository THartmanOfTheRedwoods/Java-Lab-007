/**
 * @author Trevor Hartman
 * @author MK Ripley
 * @since Version 1.0
 * 3/10/2023
 */

import java.util.Scanner;

public class WhileLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void eoCount() {
        int even = 0;
        int odd = 0;
        int value;

        System.out.println("Please enter a series of numbers (enter 0 to end): ");
        while (true) {

            value = Integer.parseInt(s.nextLine());

            if (value == 0) {
                break;
            } if (value % 2 == 0) {
                even++;
            } if (value % 2 != 0) {
                odd++;
            }
        }

        System.out.printf("There were %d even numbers\n", even);
        System.out.printf("There were %d odd numbers\n", odd);
    }

    public static void mean() {
        int input = 0;
        int total = 0;
        int value;

        System.out.println("Please enter another series of numbers (enter 0 to end): ");

        while (true) {

            value = Integer.parseInt(s.nextLine());

            if (value == 0) {
                break;
            }
            else {
                input += value;
                total++;
            }

        }

        int mean = input / total;

        System.out.println("The mean is " + mean);
    }

    public static void main(String[] args) {
        eoCount();
        mean();
    }
}
