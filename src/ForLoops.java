/**
 * @author Trevor Hartman
 * @author MK Ripley
 * @since Version 1.0
 * 3/10/2023
 */

import java.util.Scanner;

public class ForLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void forSum() {

        System.out.print("Number? ");
        int total = 0;
        int n = Integer.parseInt(s.nextLine());
        for(int i=0; i <= n; i++){
            total += i;
        }
        System.out.printf("The arithmetic series of 0 to %d is %d\n", n, total);

    }

    public static void rangeSum() {
        int total = 0;
        System.out.print("First number? ");
        int n0 = Integer.parseInt(s.nextLine());
        System.out.print("Second number? ");
        int nf = Integer.parseInt(s.nextLine());

        if (n0>nf){
            for(int i=nf; i<=n0; i++){
                total += i;
            }
        }
        else if (nf>n0) {
            for(int i=n0; i<=nf; i++){
                total += i;
            }
        }

        System.out.printf("The arithmetic series of %d to %d is %d\n", n0, nf, total);
    }

    public static void factorial() {
        int total = 1;
        System.out.println("Number?");
        int n = Integer.parseInt(s.nextLine());
        for(int i=n; i > 0; i--){
            total *= i;
        }
        System.out.printf("The factorial of %d is %d\n", n, total);
    }

    public static void main(String[] args) {
        forSum();
        rangeSum();
        factorial();
    }
}
