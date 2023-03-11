import java.util.Scanner;

/**
 * @author Trevor Hartman
 *
 * @author crazyne55
 */
public class WhileLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void eoCount() {
        String l;int num;
        int even = 0;
        int odd = 0;
        System.out.println("This program counts how many even and odd integer the user inputs. Enter \"Q\" to exit.");
        while(!(l = s.nextLine()).toUpperCase().equals("Q")) {
            num = Integer.parseInt(l);
            if(num%2==0) {
                even++;
            }else if(num%2==1) {
                odd++;
            }
        }
        System.out.printf("Results | Even: %s | Odd: %s%n", even, odd);
    }

    public static void mean() {
        String l;int num;
        int val = 0;
        int count = 0;
        System.out.println("This program calculates the mean of the user input. Enter \"Q\" to exit.");
        while(!(l = s.nextLine()).toUpperCase().equals("Q")) {
            num = Integer.parseInt(l);
            val += num;
            count++;
        }
        System.out.printf("Results | Mean: %s", (val/(count*1.0)));
        // the *1.0 is to ensure it doesn't do integer division
    }

    public static void main(String[] args) {
        eoCount();
        mean();
    }
}
