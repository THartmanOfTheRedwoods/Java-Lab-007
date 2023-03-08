/**
 *
 * @author Trevor Hartman
 * @author Jeff Grimm
 *
 * @since Version 1.0
 */
import java.util.Scanner;

public class ForLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void forSum() {

        //int numEntered = 0;
        int numSum = 0;
        int lastNum = 0;

        System.out.println("Enter a number (0 to exit): "); // Asks for user input

        int n = s.nextInt(); // Takes user input and stores as n

        for (numSum = 0; numSum < n; numSum++) { /* numSum initialized at 0 / Condition: numSum must be
                less than n / Every loop iteration add 1 to numSum  */
            lastNum = lastNum + numSum; // Sums total of numbers up to n

            if (n == 0) { // Break condition on input of 0
                break;
            }

        }

        System.out.println("Number ? " + n); // displays number input
        System.out.println("The sum is " + (lastNum + n)); // Displays sum
    }


    public static void rangeSum() {

        // Declare and initialize variables
        int fn = 0;
        int sn = 0;
        int rs = 0;
        int re = 0;
        int numSum;
        int lastNum = 0;

        System.out.println("Number? "); // Asks for user input

        fn = s.nextInt(); // Assigns first user input as first number (fn)

        System.out.println("Number? "); // Asks for user input

        sn = s.nextInt(); // Assigns first user input as second number (sn)

        //System.out.println("First number is " + fn);

        //System.out.println("Second number is " + sn);

        // compares number to decide which is start/end of range
        if (fn > sn) {
            rs = sn;
            re = fn;
        }
        if (fn < sn) {
            rs = fn;
            re = sn;
        }


        //System.out.println("The range starts at " + rs);
        //System.out.println("The range ends at " + re);

        /* When numSum is less than range end (re), add 1 to numSum. lastNum is equal to lastNum + numSum. */
        for (numSum = rs; numSum < re; numSum = numSum + 1) {
            lastNum = lastNum + numSum;
            //System.out.println(lastNum);

        }

        // Outputs range start and end as well as sum of range
        System.out.println("The range starts at " + rs);
        System.out.println("The range ends at " + re);
        System.out.println("The sum is " + (lastNum + re));
        //System.out.println("The last number entered is " + lastNum);

    }

        public static void factorial() {

            System.out.println("Enter a number: "); // User input

            double n = s.nextDouble(); // Stores user input

            Double x; // Number to multiply against
            Double f = 1.0; // Initialized factorial

            /* When x is less than or equal to the input number, increase x by 1. The factorial is equal to factorial
            * multiplied by x */
            for (x = 1.0; x <= n; x++) {
                f = f * x;
            }

            // System output
            System.out.println("Number: " + n);
            System.out.println("Factorial: " + f);

        }

        public static void main (String[]args){
            forSum();
            rangeSum();
            factorial();
        }

}
