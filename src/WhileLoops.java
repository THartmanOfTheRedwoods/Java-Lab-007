/**
 *
 * @Author Cxrdary
 * @Author Trevor Hartman
 * @Version 1.0
 *
 */
import java.util.Scanner;

public class WhileLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void eoCount() {
        System.out.println("Enter numbers odd or even, enter -1 to exit.");
        int evenNumber = 0;
        int oddNumber = 0;
        int loopInt = 0;
        while (loopInt != -1 ) {
            loopInt = s.nextInt();
            int oddOrEven = loopInt%2;
            if (oddOrEven == 0) {
                evenNumber += loopInt;
                System.out.println("The total of your even numbers is " + evenNumber);
            } else {
                oddNumber += loopInt;
                System.out.println("The total of your odd numbers is "+ oddNumber);
            }
            System.out.println("Enter -1 if you want to exit");
        }
    }

    public static void mean() {
        int inputNumber = 0;
        int numSum = 0;
        int numCount = 0;
        System.out.println("Enter numbers to calculate a mean, enter -1 to exit.");
        while (inputNumber != -1){
            inputNumber = s.nextInt();
            numSum += inputNumber;
            numCount++;
            System.out.println("Your mean is currently " + numSum/numCount +" enter -1 to exit.");
        }

    }

    public static void main(String[] args) {
        eoCount();
        mean();
    }
}
