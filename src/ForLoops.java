/**
 * @author Trevor Hartman
 * @author Rachelle Iloff
 * created 3/10/2023
 * @since version 1.0
 */
import java.util.Scanner;

public class ForLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void forSum() {
        System.out.println("Number?");
        int sum = 0;
        int n = Integer.parseInt(s.nextLine());
        for(int i=1; i <=n; i++){
            sum = sum + i;
        }
        System.out.printf("The sum is %d\n",+ sum);
    }
    public static void rangeSum() {
        System.out.println("Please enter a number");
        int a = s.nextInt();
        System.out.println("Please enter a second number");
        int b = s.nextInt();
        int n = 0;
        for (int i = a; i <= b; i++){
            n += i;
        }
        System.out.println("Your sum is: "+ n);
    }

    public static void factorial() {
        System.out.println("Number:");
        int a = 1;
        int n = s.nextInt();
        for(int i=n; i > 0; i--){
            a = a * i;
        }
        System.out.println("The factorial is " + a);
    }
    public static void main(String[] args) {
        forSum();
        rangeSum();
        factorial();
    }
}
