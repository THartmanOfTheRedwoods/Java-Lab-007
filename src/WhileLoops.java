import java.util.Scanner;

public class WhileLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void eoCount() {
        int evenCount = 0;
        int oddCount = 0;
        int input = s.nextInt();

        //Runs until -1 is entered
        while (input != -1) {
            if (input % 2 == 0) {
                //Adds to even
                evenCount++;
                //Adds to odd
            } else {
                oddCount++;
            }
            input = s.nextInt();
        }
        System.out.println("Even count: " + evenCount);
        System.out.println("Odd count: " + oddCount);
    }

//Gets mean of seperate group of numbers
    public static void mean() {
        int sum = 0;
        int count = 0;
        int input = s.nextInt();
//Runs until -1 is entered
        while (input != -1) {
            sum += input;
            count++;
            input = s.nextInt();
        }
        //Calculates mean
        double mean = (double) sum / count;
        System.out.println("Mean: " + mean);
    }

    public static void main(String[] args) {
        eoCount();
        mean();
    }
}
