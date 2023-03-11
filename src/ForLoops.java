import java.util.Scanner;

public class ForLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void forSum() {
        System.out.print("Enter integer: ");
        int n = s.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("The sum is " + sum);
    }

    public static void rangeSum() {
        System.out.print("Number? ");
        int x = s.nextInt();
        System.out.print("Number? ");
        int y = s.nextInt();

        int start = Math.min(x, y);
        int end = Math.max(x, y);

        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }

        System.out.println("The sum is: " + sum);
    }


        public static void factorial() {
            System.out.print("Number? ");
            int n = s.nextInt();

            int factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }

            System.out.println("Factorial: " + factorial);
        }


        public static void main (String[]args){
            forSum();
            rangeSum();
            factorial();
        }
}
