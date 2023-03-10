/**
 * @author Trevor Hartman
 * @author Linh Dinh
 *
 * @since version 1.0
 */
import java.util.Scanner;

public class WhileLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void eoCount() {
        int evenCount = 0;
        int oddCount = 0;
        System.out.println("This program will count the even and odd numbers entered (When done, enter any letter): ");
        while (s.hasNextInt()) {
            int num = s.nextInt();
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    }



    public static void mean() {
        Scanner input = new Scanner(System.in);
        System.out.println("This program will calculate the mean of numbers entered (When done, enter any letter): ");
        int sum = 0;
        int count = 0;
        while (input.hasNextInt()) {
            int num = input.nextInt();
            sum += num;
            count++;
        }
        if (count > 0) {
            double mean = (double) sum / count;
            System.out.println("Mean: " + mean);
        } else {
            System.out.println("No integers entered.");
        }

    }


    public static void main(String[] args) {
        eoCount();
        mean();
    }
}
