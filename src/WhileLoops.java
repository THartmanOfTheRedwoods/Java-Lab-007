/*
Author: Owen van Mantgem
 */



import java.util.Scanner;

public class WhileLoops {

    public static int oddCount;
    public static int evenCount;

    public static int count;

    public static int userInput;

    public static int orignialX;
    private final static Scanner s = new Scanner(System.in);

    public static void eoCount(int x) {
        oddCount = 0;
        evenCount = 0;
        while(x > 0) {

            System.out.println("Enter a number");
            userInput = s.nextInt();
            if (userInput % 2 == 0) {evenCount++;}
            else {oddCount++;}

            x--;
        }
        System.out.println("The number of odd numbers entered is " + oddCount);
        System.out.println("The number of even numbers entered is " + evenCount);
    }

    public static void mean(int x) {
        orignialX = x;
        while(x > 0) {
            System.out.println("enter a number");
            userInput = s.nextInt();
            count += userInput;
            x--;
        }
        System.out.println("The mean of the numbers you entered is: "+ count/orignialX );
    }

    public static void main(String[] args) {

        eoCount(5);
        mean(4);
    }
}
