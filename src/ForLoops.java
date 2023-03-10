/**
 *
 *@authorTrevorHartman
 *@authorAaronJohnson
 *
 *@sinceVersion1.0
 */
import java.util.Scanner;

public class ForLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void forSum() {
        System.out.print("Number? ");
        int end = s.nextInt();
        int i = end;
        int sum = 0;
        for (i = 1; i <= end; i++){
            sum = sum + i;
        }
        System.out.println("the sum is: " + sum);
    }

    public static void rangeSum() {
        System.out.print("Number? ");
        int from = s.nextInt();
        System.out.print("Number? ");
        int to = s.nextInt();
        int sum = 0;
        if(from > to){
            for(to = to; to <= from; to++){
                sum = sum + to;
            }
            System.out.println("The sum is: " + sum);
        } else {
            for(from = from; from <= to; from++){
                sum = sum + from;
            }
            System.out.println("The sum is: " + sum);
        }
    }

    public static void factorial() {
       System.out.print("Number? ");
        int n = s.nextInt();
        int f1 = 1;
        int i = f1;
        for (i = 2; i <= n; i++)
            f1 *= i;
        System.out.printf("The factorial of %d is %d", n, f1);
    }

    public static void main(String[] args) {
        forSum();
        rangeSum();
        factorial();
    }
}
