/**
 *
 * @Author Cxrdary
 * @Author Trevor Hartman
 * @Version 1.0
 *
 */
import java.util.Scanner;

public class ForLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void forSum() {
        System.out.println("Number? ");
        int numberSum = 0;
        int userNumber = s.nextInt();
        for (int i=1;i <= userNumber ;i++){
            numberSum += i;
        }
        System.out.println("The sum is "+numberSum);

    }

    public static void rangeSum() {
        System.out.println("Enter your first number");
        int userNum1 = s.nextInt();
        System.out.println("Enter your second number");
        int userNum2 = s.nextInt();
        int lowerUserNum = Math.min(userNum1, userNum2);
        int upperUserNum = Math.max(userNum1, userNum2);
        int userNumSum = 0;
        for (int i = lowerUserNum; i <= upperUserNum; i++){
            userNumSum += i;
        }
        System.out.println("Your lower number is " +lowerUserNum);
        System.out.println("Your upper number is " +upperUserNum);
        System.out.println("Your sum is: "+ userNumSum);
    }

    public static void factorial() {
        System.out.println("Number? ");
        int numberSum = 1;
        int userNumber = s.nextInt();
        for (int i=1;i <= userNumber ;i++){
            numberSum = numberSum * i;
        }
        System.out.println("The sum is "+numberSum);
    }

    public static void main(String[] args) {
        // forSum();
        // rangeSum();
        factorial();
    }
}
