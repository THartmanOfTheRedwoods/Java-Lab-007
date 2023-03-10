/**
 * @author Trevor Hartman
 * @author Bryan Maus
 * Date 03/10/2023
 *
 * @since version 1.0
 *
 * Create a method named **forSum** that calculates the sum 1+2+3+...+n where n is given as user input:
 * Create a method named **rangeSum** that sums a range/interval of numbers, and prints the range.
 * Your program should not care if the smaller or larger numbers are entered first:
 * Implement a method named **factorial** that calculates the factorial of a number read in from System.in:
 *
 */
import java.util.Scanner;

public class ForLoops {
    private final static Scanner s = new Scanner(System.in);
    public static final String reset = "\u001B[0m";
    public static final String red = "\u001B[31m";
    public static void forSum() {
        int last = 0;
        System.out.print(" forSum Number: ");
        int number = s.nextInt();
        for (int loop=1; loop <= number; loop++) {
            last = loop+last;
        }
        System.out.println(red + "\nThe forSum sum is: " + last + reset);

    }
    public static void rangeSum() {
        int last = 0;
        System.out.print("\nrangeSum first Number: ");
        int numberone = s.nextInt();
        System.out.print("rangeSum second Number: ");
        int numbertwo = s.nextInt();
        if (numberone<numbertwo) {
            for (int loop=0; numberone <= numbertwo; numberone++) {
                last = numberone+last;
            }
        }
        else {
            for (int loop = 0; numbertwo <= numberone; numbertwo++) {
                last = numbertwo + last;
            }
        }
            System.out.println(red + "\nThe rangeSum sum is: " + last + reset);
        }

    public static void factorial() {
        int last=1;
        System.out.print("\nfactorial Number: ");
        int number = s.nextInt();
        for (int loop=1; loop<=number; loop++){
            last=loop*last;
        }
        System.out.printf(red + "\nFactorial Sum: " + last + reset);
    }

    public static void main(String[] args) {
        forSum();
        rangeSum();
        factorial();
    }
}
