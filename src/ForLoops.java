/**
 * @author Trevor Hartman
 * @author Mike Quist
 * @date 03/07/2023
 */

import java.util.Scanner;

public class ForLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void forSum() {
        System.out.println("Enter an integer");
        int numberFromUser = Integer.valueOf(s.nextLine());
        for (int i = 1; i <= numberFromUser; i++) {
            System.out.println(i);

        }
        int sum = ((numberFromUser*(numberFromUser + 1))/2);
        System.out.println("The sum of all constituent integers is: " + sum);
    }

    public static void rangeSum() {
        System.out.println("Enter an integer");
        int num1 = Integer.valueOf(s.nextLine());
        System.out.println("Enter another integer");
        int num2 = Integer.valueOf(s.nextLine());
        int x = 0;
        int y = 0;
     if (num1 < num2) {
         x = num1;
         y = num2;
     } else if (num2 < num1) {
         x = num2;
         y = num1;
     } else {
         System.out.println("The numbers are equal!");

     }

        for (int i = x; i <= y; i++) {
            System.out.println(i);

        }
        int sum = ((y - x + 1) * (x + y)) / 2;
        System.out.println("The sum of all constituent integers is: " + sum);
    }

    public static void factorial() {
        System.out.println("Enter an integer");
        int n = Integer.valueOf(s.nextLine());
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        System.out.println("Number: " + n);
        System.out.println("Factorial: " + result);
    }
    public static void main(String[] args) {
        forSum();
        rangeSum();
        factorial();
    }
}
