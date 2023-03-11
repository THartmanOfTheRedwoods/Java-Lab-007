import java.nio.file.LinkPermission;
import java.util.Scanner;

public class ForLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void forSum() {
        System.out.println("Please enter a whole number:");
        int inp = 0;
        try {
            inp = Integer.parseInt(s.nextLine());
        } catch (Exception e) {
            System.err.println("Error: not valid input");
            return;
        }
        int sum = 0;
        for (int i = inp; i != 0; i--){
            sum += i;
        }
        System.out.println("The sum is: " + sum);
    }

    public static void rangeSum() {

        System.out.println("Please two whole numbers:\nFirst number:");

        int inp1 = 0;
        try {inp1 = Integer.parseInt(s.nextLine());}
        catch(Exception e) {
            System.err.println("Error: Not a valid input");
            return;
        }

        System.out.println("Second number:");

        int inp2 = 0;
        try {inp2 = Integer.parseInt(s.nextLine());}
        catch(Exception e) {
            System.err.println("Error: Not a valid input");
            return;
        }

        int a, b;
        a = (inp1 < inp2) ? inp2 : inp1;
        b = (a == inp1) ? inp2 : inp1;

        int sum = 0;
        for (int i = a; i >= b; i-- ) {
            sum += i;
        }

        System.out.println("The sum is: " + sum);
    }

    public static void factorial() {

        System.out.println("Please enter a whole number:");
        int inp = 0;
        try {
            inp = Integer.parseInt(s.nextLine());
        } catch (Exception e) {
            System.err.println("Error: not valid input");
            return;
        }

        int prod = 1;
        for (int i = inp; i > 0; i--) {
            prod = prod * i;
        }

        System.out.println("Factorial: " + prod);
    }

    public static void main(String[] args) {
        forSum();
        rangeSum();
        factorial();


    }
}
