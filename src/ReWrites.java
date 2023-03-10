/**
 *
 *@authorTrevorHartman
 *@authorAaronJohnson
 *
 *@sinceVersion1.0
 */
import java.util.Scanner;

class ReWrites {
    private final static Scanner s = new Scanner(System.in);

    public static void avgRewrite() {
        Scanner in = new Scanner(System.in);
        String l;
        double sum = 0.0;
        int count = 0;
        System.out.println("Ths program will calculate the average of numbers entered. Begin entering numbers. Enter \"Q\" to quit.");
        for (l = in.nextLine();!(l = s.nextLine()).toUpperCase().equals("Q"); count++) {
            try {
                sum += Integer.parseInt(l);
            } catch (NumberFormatException nfe) {}

        }System.out.printf("Average is: %f%n", (sum/count));
    }
    public static void sumRewrite() {
        Scanner in = new Scanner(System.in);
        System.out.println("Type positive integers to sum, enter 0 to stop the program...");
        int x = -1;
        int sum = 0;
        x = Integer.parseInt(in.nextLine());
        while (x > 0 && x != 0) {
            try { x = Integer.parseInt(in.nextLine());
            System.out.println("Adding " + x);
            sum += x;
            System.out.println("Your sum is: " + sum);}
            catch (NumberFormatException nfe) {}
        }

    }
    public static void main(String[] args) {
        avgRewrite();
        sumRewrite();
    }
}