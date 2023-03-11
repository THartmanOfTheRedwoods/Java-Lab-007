/**
 *
 * @author Trevor Hartman
 * @author Geng Cha
 *
 * @since Version 1.0
 *
 */
import java.util.Scanner;
public class WhileLoops {
    private final static Scanner s = new Scanner(System.in);
    public static void eoCount() {

        int bigCount = 0;
        int even = 0;
        int odd = 0;
        System.out.println("Type in 10 numbers bubu");

        while (bigCount <= 10){

            int num = s.nextInt();
            s.nextLine();

            if (num % 2 == 0) {
                even = even + 1;

            } else if (num % 2 == 1) {
                odd = odd + 1;

            }
            bigCount++;
        }
        System.out.printf("OMG you just entered %d odd numbers and %d even numbers. AMAZING%n", odd, even);
    }

    public static void mean() {

        int siuuuuuuu = 0;
        int count = 0;
        System.out.println("Enter 10 mo number ma bruder: ");

        while (count <= 10) {
            int num = s.nextInt();
            s.nextLine();

            siuuuuuuu += num;
            count++;
        }
        System.out.println("AYO the mean is " + siuuuuuuu/count);
    }

    public static void main(String[] args) {
        eoCount();
        mean();
    }
}
