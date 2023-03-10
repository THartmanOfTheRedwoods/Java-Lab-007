/**
 *
 *@authorTrevorHartman
 *@authorAaronJohnson
 *
 *@sinceVersion1.0
 */
import java.util.Scanner;

public class WhileLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void eoCount() {
        int numberIn = 0;
        int even1 = 0;
        int odd1 = 0;
        int loopCount = 5;

        while(true){
            if (numberIn == loopCount){
                System.out.println("The total for your even numbers is: " + even1);
                System.out.println("The total for your odd numbers is: " + odd1);
                System.out.printf("Ths method is finished, initiating mean method, watch out!%n%n");
                break;
            }
            System.out.print("Please enter an integer: ");
            int int1 = s.nextInt();
            System.out.printf("Your integer is %d%n", int1);
            if (int1 % 2 == 0){
                System.out.printf("Your integer %d is even and will be added to the total of even numbers.%n", int1);
                even1 = even1 + int1;

            } else {
                System.out.printf("Your integer %d is odd and will be added to the total of even numbers%n", int1);
                odd1 = odd1 + int1;
            }
            numberIn = numberIn + 1;

        }
    }

    public static void mean() {
        int numInputs = 0;
        int loopCount = 5;
        int totalNum = 0;
        System.out.println("Welcome to the mean method, we're gonna get mean!");


        while(true) {
            if (numInputs == loopCount){
                int med = totalNum / 5;
                System.out.printf("The median of your integers input is: %s", med);
                break;
            } else {
                System.out.print("Please enter an integer: ");
                totalNum = totalNum + s.nextInt();
                numInputs = numInputs + 1;
            }
        }
    }

    public static void main(String[] args) {
        eoCount();
        mean();
    }
}
