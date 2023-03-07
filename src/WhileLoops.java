/**
 * @author Trevor Hartman
 * @author Adrienne van Summern
 * @since version 1.0
 */
import java.util.Scanner;

public class WhileLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void eoCount() {
        int a;
        int evenNum = 0;
        int oddNum = 0;
        int checkPt = 0;
        while(true){
            System.out.println("Enter an even or odd number, or enter 0 to show even-odd count");
            a = Integer.valueOf(s.nextLine());
            checkPt = a;
            if (checkPt == 0){
                System.out.println("You have "+evenNum+" even numbers, and "+oddNum+" odd numbers");
                return;
            }
            if (a % 2 == 0){
                evenNum ++;
            }
            else{
                oddNum ++;
            }
        }
    }

    public static void mean() {
        int numOfNums = 0;
        int checkPt = 0;
        double avg = 0;
        int temp = 0;

        int sum = 0;
        while(true){
            System.out.println("Input number, or enter 0 to get result");
            temp = Integer.valueOf(s.nextLine());
            sum = sum + temp;
            checkPt = temp;
            if (checkPt == 0){
                System.out.println("The mean is " + avg);
                break;
            }
            numOfNums++;
            avg = sum/(double)numOfNums;
        }
    }

    public static void main(String[] args) {
        eoCount();
        mean();
    }
}
