/*
Author: Owen
 */

import java.util.Scanner;

public class ForLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void forSum() {
        int output = 0;
        System.out.println("positive number?");
        int val = s.nextInt();

        for (int i = 1; i <= val; i++) {
            output += i;
        }
        System.out.println("the sum is: "+ output);
    }

    public static void rangeSum() {
        int greaterValue;
        int lesserValue;
        int output = 0;

        System.out.println("number?");
        int val1 = s.nextInt();
        System.out.println("number?");
        int val2 = s.nextInt();

        if (val1 > val2) {greaterValue = val1; lesserValue = val2;}

        else { lesserValue = val1; greaterValue = val2;}

        for (int i = lesserValue; i <= greaterValue; i++) {
            output += i;
        }
        System.out.println("The range sum is: "+output);

    }

    public static void factorial() {

        int output = 1;

        System.out.println("number?");
        int val1 = s.nextInt();



        for (int i = val1; i >= 1; i--) {
            output *= i;
        }
        System.out.println("The factorial is: " + output);

    }

    public static void main(String[] args) {
        forSum();
        rangeSum();
        factorial();
    }
}
