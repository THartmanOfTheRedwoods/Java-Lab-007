
/**
 *
 * @author Trevor Hartman
 * @author Willard Bowles
 *
 * @since Version 1.0
 *
 */

import java.util.Scanner;

class ReWrites {
    private final static Scanner s = new Scanner(System.in);

    public static void avgRewrite() {
        String l;
        double sum = 0.0;
        int count = 0;
        System.out.println("Ths program will calculate the average of numbers entered. Begin entering and enter \"Q\" to quit.");
        // for loop to iterate until user enters "Q"
        for (;;) {
            l = s.nextLine().toUpperCase();
            if (l.equals("Q")) {
                break;
            }
            try {
                sum += Integer.parseInt(l);
                count++;
            } catch (NumberFormatException nfe) {}
        }

        System.out.printf("Average is: %f%n", (sum/count));
    }

    public static void sumRewrite() {
        Scanner in = new Scanner(System.in);
        System.out.println("Type positive integers to sum. To stop, type 0...");
        int x = -1;
        int sum = 0;
        // loop until user enters o
        while (x != 0) {
            try {
                x = Integer.parseInt(in.nextLine());
                if (x > 0) {
                    System.out.println("Adding " + x);
                    sum += x;
                }
            } catch (NumberFormatException nfe) {}
        }

        System.out.printf("Sum: %d%nLater%n", sum);
    }

    public static void main(String[] args) {
        avgRewrite();
        sumRewrite();
    }
}