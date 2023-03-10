import java.util.Scanner;

public class WhileLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void eoCount() {

        final double LOG2 = Math.log(2);
        int i;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an even number for all even or odd for all odd to 100!");
        i = s.nextInt();
        while (i < 100) {
            System.out.println(i + LOG2);
            i = i + 2;
        }
    }

    public static void mean() {

        System.out.println("Enter numbers (Type 0 to finish)");
        double x = -1;
        double num = 0;
        double sum = 0;

            while(x != 0){

                x = s.nextDouble();
                sum+= x;
                num++;
            }
            System.out.println("The mean is " +Math.ceil(sum / num));
            }

    public static void main(String[] args) {
        eoCount();
        mean();
    }
}
