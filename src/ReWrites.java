/**
 *
 * @author Trevor Hartman
 * @author Jeff Grimm
 *
 * @since Version 1.0
 */
import java.util.Scanner;

class ReWrites {
    private final static Scanner s = new Scanner(System.in);

    public static void avgRewrite() {
        //String l;
        double sum = 0.0;
        int count = 0;
        System.out.println("Ths program will calculate the average of numbers entered. Begin entering and enter \"Q\" to quit.");

        String n; // Declare non-weird variable n


        /* n begins initialized as equal to input (s). When n is not equal to not-case-sensitive q, continue loop.
         * Advance loop on input. Sum is equal to sum plus n (parse integer from string). Advance count by 1.  */
        try {
            for (n = s.nextLine(); !(n = s.nextLine()).toUpperCase().equals("Q"); n = s.nextLine()) {
                sum += Integer.parseInt(n);
                count++;
            }
        } catch (NumberFormatException nfe) {} // Catches exception - see method sumRwrite

        /*
        while (!(l = s.nextLine()).toUpperCase().equals("Q")) {
            try {
                sum += Integer.parseInt(l);
                count++;
            } catch (NumberFormatException nfe) {
            }
        } */

        System.out.printf("Average is: %f%n", (sum / count));
    }

    public static void sumRewrite() {

        Scanner in = new Scanner(System.in);

        System.out.println("Type positive integers to sum. To stop, type 0...");

        int x;

        int sum = 0;

        /* Try: Whith x being equal to user input, and x being greater than 0, and x changing on user input.
        * Output a message and add sum and x together to equal sum.
        * Catch numberformatexception */
        try {
            for (x = Integer.parseInt(in.nextLine()); x > 0; x = Integer.parseInt(in.nextLine())) {
                System.out.println("Adding " + x);
                sum = sum + x;
            }
        } catch (NumberFormatException nfe) {}

        // Place code being tested into try statement with catch after

        /*
        while (true) {

            try {
                if(x == 0) {
                    break;
                }
                x = Integer.parseInt(in.nextLine());
                if (x < 0) {
                    continue;
                }
                System.out.println("Adding " + x);
                sum += x;
            } catch (NumberFormatException nfe) {}
        } */

        System.out.printf("Sum: %d%nGood Bye%n", sum);

    }

    public static void main(String[] args) {

        avgRewrite();
        sumRewrite();

    }
}