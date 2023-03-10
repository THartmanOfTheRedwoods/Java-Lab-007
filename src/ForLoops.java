import java.util.Scanner;

public class ForLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void forSum() {
        System.out.println("Number?");
        int n = s.nextInt();
        int x;
        int sum = 0;
        for (x=3;x<=n;x++) {
            sum = sum + 1 + 2 + 3 ;
        }
        System.out.println("The sum is " +sum);
    }
    public static void rangeSum() {
        System.out.println("Number?");
        int x = s.nextInt();
        System.out.println("Number?");
        int y = s.nextInt();
        int i;
        int sum = 0;
        for ( i = x; i <= y; i++) {
           sum = sum + i;

            System.out.println(sum);
        }
    }
    public static void factorial() {
        System.out.println("Number?");
        int x = s.nextInt();
        int i;
        int sum = 1;
        for ( i = 1; i <= x ; i++) {
            sum = sum * i;


            System.out.println(sum);
        }

    }

    public static void main(String[] args) {
        forSum();
        rangeSum();
        factorial();
    }
}
