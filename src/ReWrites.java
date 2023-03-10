import java.util.Scanner;

class ReWrites {
    private final static Scanner s = new Scanner(System.in);

    public static void avgRewrite() {


        System.out.println("Ths program will calculate the average of \"5\" numbers entered. Begin entering and enter \"0\" to quit.");
        int x = 5;
        float m = 0;
        int y;
        for (int i = 0; i < x; i++) {
                y = s.nextInt();
                m += y;
            }
            m /= x;
            System.out.println("Average is: " + m);

        }
        public static void sumRewrite () {
            Scanner in = new Scanner(System.in);
            System.out.println("Type positive integers to sum. To stop, type 0...");
            int x = 1;
            int sum = 0;

            while (x != 0) {

                    x = in.nextInt();
                    System.out.println("Adding " + x);
                    sum += x;
                }
                System.out.printf("Sum: %d%nGood Bye%n", sum);
        }
        public static void main (String[]args){
            avgRewrite();
            sumRewrite();
        }
    }