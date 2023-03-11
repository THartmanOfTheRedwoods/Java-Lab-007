/**
 *
 * @author Trevor Hartman
 * @author Geng Cha
 *
 * @since Version 1.0
 *
 */
import java.util.Scanner;

public class ForLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void forSum() {

        System.out.println("COMRADE I NEED A NUMBER");
        int numberBeingSummed = s.nextInt();
        int sum = 0;

        for (int everyNumberBefore = 0; everyNumberBefore <= numberBeingSummed; everyNumberBefore++) {
            sum = sum + everyNumberBefore;
        }

        System.out.printf("DA Sum is: %d%n", sum);
    }

    public static void rangeSum() {

        System.out.println("COMRADE I NEED A NUMBER");
        int num1 = s.nextInt();
        System.out.println("COMRADE IMMA NEED ANOTHER ONE");
        int num2 = s.nextInt();
        int sum = 0;

            if (num2 > num1){
                for (int jimmyChoo = num1; jimmyChoo <= num2; jimmyChoo++)
                    sum = sum + jimmyChoo;

                System.out.printf("DA Sum is: %d%n", sum);
        } else {

            for (int jimmyChoo = num2; jimmyChoo <= num1; jimmyChoo++)
                sum = sum + jimmyChoo;
            System.out.printf("DA Sum is: %d%n", sum);
        }
    }

    public static void factorial() {

        System.out.println("HEY, YOU, I NEED A NUMBER TO FACTORIAL, NOW!!!!!");
        int term = s.nextInt();
        int theFacts = 1;

        for (int manyMustFall = 1; manyMustFall <= term; manyMustFall++)

            theFacts = theFacts * manyMustFall;

        System.out.println(theFacts);

    }

    public static void main(String[] args) {
        forSum();
        rangeSum();
        factorial();
    }
}
