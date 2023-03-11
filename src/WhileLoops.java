/**
 * @author Trevor Hartman
 * @author Rachelle Iloff
 * created 3/10/2023
 * @since version 1.0
 */
import java.util.Scanner;

public class WhileLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void eoCount() {
        System.out.println("Enter numbers odd or even.");
        int even = 0;
        int odd = 0;
        int a = 0;
        while (a != -1) {
            a = s.nextInt();
            int oddOrEven = a % 2;
            if (oddOrEven == 0) {
                even += a;
                System.out.println("The total of your even numbers is " + even);
            } else {
                odd += a;
                System.out.println("The total of your odd numbers is " + odd);

            }

        }
    }

    public static void mean() {
        int a = 0;
        int b = 0;
        int finalCount = 0;
        System.out.println("Enter numbers to calculate a mean.");
        while (a!= -1) {
            a = s.nextInt();
            b += a;
            finalCount++;
            System.out.println("Your mean is currently " + b / finalCount + ".");
        }
    }

    public static void main(String[] args) {
        eoCount();
        mean();
    }
}
