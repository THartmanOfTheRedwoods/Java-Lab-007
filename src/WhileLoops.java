/**
 *
 * @author Trevor Hartman
 * @author Jeff Grimm
 *
 * @since Version 1.0
 */
import java.util.Scanner;

public class WhileLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void eoCount() { // Reads in numbers and outputs the number os odd and even numbers

        int even = 0; // Separate odd and even variables ini to 0, stored outside loop
        int odd = 0;

        /* While true, if input is equal to 0, break. If input leaves no remainder after division by 2, increment
        * variable even by +1. If input leaves a remainder after being divisible by 2, increment odd by +1. */
        while (true) {
            System.out.println("Enter a number (0 to exit): ");

            int input = s.nextInt();

            if ( input == 0) {
                break;
            } if (input % 2 == 0) {
                even++;
            } if (!(input % 2 == 0)) {
                odd++;
            }
        }

        // Outputs the totals of odd and even after loop has finished
            System.out.println("The total number of even numbers is " + even);
            System.out.println("The total number of odd numbers is " + odd);
    }

    public static void mean() {

        int numEntered = 0;
        int numTotal = 0;


        while (true) {

            System.out.println("Enter a number (0 to exit): "); // Asks for user input

            int input = s.nextInt(); // Takes user input and stores as variable "input"

            /* If input is equal to 0, break. If input is greater than 0, store input as numEntered and
            * add input to the value of numEntered. If input is less than 0, continue <skip input>  */
            if (input == 0) {
                break;
            }
            if ((input > 0) && (input != 0)) {
                numEntered = numEntered + input;
                numTotal = numTotal + 1;
            }
            if (input < 0) {
                continue;
            }

        }

        int average = numEntered / numTotal; // Finds average of numbers input by user

        // Outputs results
        //System.out.println(numEntered);
        //System.out.println(numTotal);
        System.out.println("The mean of the number entered is " + average);

    }

    public static void main(String[] args) {
        eoCount();
        mean();


    }

}
