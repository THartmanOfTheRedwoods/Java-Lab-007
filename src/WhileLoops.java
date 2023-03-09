/**
 * @author Trevor Hartman
 * @author Michael Thoreon
 * @since 1.0
 */

import java.util.Scanner;

public class WhileLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void eoCount() {
        int odds = 0;
        int evens = 0;
        int iterations = 0;
        System.out.println("Enter up to 10 even and odd numbers, and we'll keep track of them.");
        while(iterations <10){
            int numbler = s.nextInt();
            if(numbler % 2 != 0){
                odds +=1;
            } else {evens +=1;}
            System.out.printf("%d odd numbers, %d even numbers.", odds, evens);
            iterations += 1;
        }
        System.out.println("End of eoCount program.");
    }

    public static void mean() {
        float dataSetSize = 0;
        float numblerSum = 0;
        System.out.println("Enter the first of 10 numbers you would like to average.");
        while(dataSetSize <= 10){
            System.out.println("Enter the next number you want to average.");
            int numbler = s.nextInt();
            numblerSum += numbler;
            dataSetSize += 1;
            float result = (numblerSum / dataSetSize);
            System.out.println(result);
        }
        System.out.println("End of mean program.");
    }

    public static void main(String[] args) {
        eoCount();
        mean();
    }
}
