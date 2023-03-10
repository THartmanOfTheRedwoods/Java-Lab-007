/**
 * @author Trevor Hartman
 * @author Linh Dinh
 *
 * @since version 1.0
 */
import java.util.Scanner;

public class ForLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void forSum() {
        System.out.println("Number?");
        int input = s.nextInt();
        int sum = 0;
        for(int i = 1; i <= input; i++ ){
            sum += i;
        }
        System.out.println("The sum is " + sum);
    }

    public static void rangeSum() {
        System.out.println("Number?");
        int x = s.nextInt();
        System.out.println("Number?");
        int y = s.nextInt();
        if(x<y){
            int sum = x;
           for(int i = 1; i <= (y - x); i++){
                sum = sum + i + x;
           }
            System.out.println("The sum is: " + sum);
        }
        else if (y<x){
            int sum = y;
            for (int i = 1; i <= (x-y); i++){
                sum = sum + i + y;
            }
            System.out.println("The sum is: " + sum);

        }
        else{
            System.out.println("The sum is: " + 0);
        }
    }

    public static void factorial() {
        System.out.println("Number: ");
        int n = s.nextInt();
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial *= i;
        }

        System.out.println("Factorial: " + factorial);
    }

    public static void main(String[] args) {
        forSum();
        rangeSum();
        factorial();
    }
}
