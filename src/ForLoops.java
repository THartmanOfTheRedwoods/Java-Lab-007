import java.util.Scanner;

public class ForLoops {
    // Sum of 1+2+3....
    private final static Scanner s = new Scanner(System.in);
   //Asks for num
    public static void forSum() { System.out.print("Number? ");
        int n = s.nextInt();
        int sum = 0;
        //Uses loop to add until it reaches the number
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("The sum is " + sum);
    }
    // Sums a range/interval of numbers.
    public static void rangeSum() {
        // Prompt the user to enter two numbers
        System.out.print("Number? ");
        int n1 = s.nextInt();
        System.out.print("Number? ");
        int n2 = s.nextInt();

        // Smaller and larger
        int start = Math.min(n1, n2);
        int end = Math.max(n1, n2);

        int sum = 0;
        //Uses loop to add until it reaches the number starting form the smaller 1
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        System.out.println("The sum is: " + sum);
    }

    public static void factorial() {

        // Prompt the user to enter a number

        System.out.print("Number: ");
        int n = s.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial: " + fact);

    }

    public static void main(String[] args) {
        // Call the three methods
        forSum();
        rangeSum();
        factorial();
    }
}
