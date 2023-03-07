/**
 * @author Trevor Hartman
 * @author Adrienne van Summern
 * @since version 1.0
 */
import java.util.Scanner;

public class ForLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void forSum() {
        System.out.println("Number?");
        int sum = 0;
        int n = Integer.valueOf(s.nextLine());
        for(int i=0; i <= n; i++){
            sum = sum + i;
        }
        System.out.println("The sum is " + sum);
    }

    public static void rangeSum() {
        int rSum = 0;
        System.out.println("Number? ");
        int a = Integer.valueOf(s.nextLine());
        System.out.println("Number? ");
        int b = Integer.valueOf(s.nextLine());
        if (a>b){
            for(int i=b; i<=a; i++){
                rSum = rSum + i;
            }
        }
        else if (b>a) {
            for(int i=a; i<=b; i++){
                rSum = rSum + i;
            }
        }
        else{
            System.out.println("please enter two different numbers");
            return;
        }
        System.out.println(rSum);
    }

    public static void factorial() {
        System.out.println("Number:");
        int product = 1;
        int n = Integer.valueOf(s.nextLine());
        for(int i=n; i > 0; i--){
            product = product * i;
        }
        System.out.println("The factorial is " + product);
    }

    public static void main(String[] args) {
        forSum();
        rangeSum();
        factorial();
    }
}
