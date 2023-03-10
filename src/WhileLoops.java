/**
 *
 * @author Trevor Hartman
 * @author Brandin Crockett
 *
 * @since Version 1.0
 *
 */
import java.util.Scanner;

public class WhileLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void eoCount() {
        int evenCount = 0, oddCount = 0;
        int input = s.nextInt();

        while (input != 0) {
            if (input % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            input = s.nextInt();
        }

        System.out.printf("Even numbers: %d\nOdd numbers: %d\n", evenCount, oddCount);
    }

    public static void mean() {
        int sum = 0, count = 0;
        int input = s.nextInt();

        while (input != 0) {
            sum += input;
            count++;
            input = s.nextInt();
        }
        if (count == 0) {
            System.out.println("No input provided!");
        } else {
            double mean = (double) sum / count;
            System.out.printf("Mean: %.2f\n", mean);
        }
    }

    public static void main(String[] args) {
        eoCount();
        mean();
    }
}
