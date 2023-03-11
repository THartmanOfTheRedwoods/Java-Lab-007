import java.util.Scanner;

public class WhileLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void eoCount() {
        int eCount = 0;
        int oCount = 0;
        int i;

        System.out.println("Enter integers (0 to exit):");

        while((i = s.nextInt()) !=0) {
            if (i % 2 == 0) {
                eCount++;
            } else {
                oCount++;
            }
        }

        System.out.println("Even Count: " + eCount);
        System.out.println("Odd Count: " + oCount);
    }

    public static void mean() {
        int sum = 0;
        int count = 0;
        int i;

        System.out.println("Enter integers (0 to Exit):");
        while ((i = s.nextInt()) !=0) {
            sum += i;
            count++;
        }

        if (count == 0) {
            System.out.println("No usable numbers entered.");
        } else {
            double mean = (double) sum % count;
            System.out.println("Mean: " + mean);
        }
    }

    public static void main(String[] args) {
        eoCount();
        mean();
    }
}
