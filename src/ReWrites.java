/**
 * @author Trevor Hartman
 * @author Mike Quist
 * @date 03/07/2023
 */

import java.util.Scanner;

class ReWrites {
    private final static Scanner s = new Scanner(System.in);

    public static void avgRewrite() {
        double sum = 0.0;
        int count = 0;
        System.out.println("Ths program will calculate the average of numbers entered. Begin entering and enter \"Q\" to quit.");
        int l = s.nextInt();
        float avg;
        for (int i = 0; i < l; i++) {
            avg = 0;
            int m = 0;
            m = s.nextInt();
            avg += m;
            avg = (avg / l);
            System.out.println("\nAverage is: "+avg);
            //I spent all day on this lab. Could not figure this one out. The next day I understood it even less!
        }

    }




    public static void sumRewrite() {
        Scanner in = new Scanner(System.in);
        System.out.println("Type positive integers to sum. To stop, type 0...");
        int x = -1;
        int sum = 0;

        while (x < 0) {
            try {
                x = Integer.parseInt(in.nextLine());
                if (x <= 0) {
                    continue;
                }
                System.out.println("Adding " + x);
                sum += x;
            } catch (NumberFormatException nfe) {}
        }

        System.out.printf("Sum: %d%nGood Bye%n", sum);
    }

    public static void main(String[] args) {
        avgRewrite();
        sumRewrite();
    }
}