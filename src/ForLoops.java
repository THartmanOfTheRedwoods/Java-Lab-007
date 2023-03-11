import java.util.Scanner;

/**
 * @author Trevor Hartman
 *
 * @author crazyne55
 */
public class ForLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void forSum() {
        System.out.println("forSum: i counts up from 0 to inputted number, adding it's value to the sum at each point.");
        System.out.print("Number? ");
        int indMax = Integer.parseInt(s.nextLine());
        int sum = 0;
        for(int i = 0; i <= indMax; i++) {
            sum += i;
        }
        System.out.printf("The sum is: %s%n",sum);
    }

    public static void rangeSum() {
        System.out.println("rangeSum: same as forSum, but the second number you input is the starting number for i.");
        System.out.print("Number? ");
        int indMax = Integer.parseInt(s.nextLine());
        System.out.print("Number? ");
        int indMin = Integer.parseInt(s.nextLine());
        int sum = 0;
        for(int i = indMin; i <= indMax; i++) {
            sum += i;
        }
        System.out.printf("The sum is: %s%n",sum);
    }

    public static void factorial() {
        System.out.println("factorial: counts down from the inputted number to 1, multiplying the value.");
        System.out.print("Number? ");
        int indMax = Integer.parseInt(s.nextLine());
        int mul = 1;
        for(int i = indMax; i > 0; i--) {
            mul *= i;
        }
        System.out.printf("Factorial: %s%n",mul);
    }

    public static void main(String[] args) {
        forSum();
        rangeSum();
        factorial();
    }
}
