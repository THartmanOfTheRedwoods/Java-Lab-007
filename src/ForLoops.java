/**
 * @author Trevor Hartman
 * @author Michael Thoreon
 * @since 1.0
 */

import java.util.Scanner;

public class ForLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void forSum() {
        System.out.println("Enter the number you would like to process with forSum()");
        int runningSum = 0;
        for(int number = s.nextInt(); number > 0; number -= 1){
            runningSum += number;
        }
        System.out.println(runningSum);
    }

    public static void rangeSum() {
        System.out.println("Enter the range you would like to process with rangeSum()");
        int runningSum = 0;
        int number1 = s.nextInt();
        int number2 = s.nextInt();
        int range = Math.abs(number1 - number2);
        for(int number = range; number > 0; number -= 1){
            runningSum += number;
        }
        System.out.println(runningSum);
    }

    public static void factorial() {
        System.out.println("Enter the number you want the factorial of:");
        int factorialStorage = 1;
        for(int number = s.nextInt(); number > 0; number -= 1){
            factorialStorage *= number;
        }
        System.out.println(factorialStorage);
    }

    public static void main(String[] args) {
        forSum();
        rangeSum();
        factorial();
    }
}
