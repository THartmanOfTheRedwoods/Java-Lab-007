import jdk.jshell.spi.ExecutionControl;

import java.security.spec.ECField;
import java.util.Objects;
import java.util.Scanner;

public class WhileLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void eoCount() {

        int eCount = 0;
        int oCount = 0;

        System.out.println("\n**Evens&Odds**\nPlease enter a number then press 'enter' (or 0 to finish) : ");
        int inp = s.nextInt();
        while (inp != 0) {
            if (inp % 2 == 0) {
                eCount++;
            }
            else {
                oCount ++;
            }
            System.out.println("Next number: ");
            System.out.flush();
            inp = s.nextInt();
        }

        System.out.printf("\nEvens: %d\nOdds: %d\n", eCount, oCount);
        System.out.println("Next Program starting...");





    }

    public static void mean() {
        System.out.println("\n**MEAN**\nEnter a number then press 'enter' (or 0 to finish) : ");
        double inp = s.nextInt();
        double sum = 0.0;
        double count = 0.0;
        while (inp != 0.0) {
            sum += inp;
            count++;
            System.out.println("Next number: ");
            inp = s.nextInt();
        }
        double mean = sum / count;
        System.out.printf("The mean is: %.2f\n", mean);
        System.err.println("Now Exiting");
    }

    public static void main(String[] args) {
        eoCount();
        mean();
    }
}
