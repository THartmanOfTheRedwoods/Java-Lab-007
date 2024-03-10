import java.util.Arrays;
public class ArrayExploration3 {

        public static boolean areFactors(int n, int... factors) {
            if (n < 0) {
                System.exit(1);
            }
            Arrays.sort(factors);
            for (int factor : factors) {
                if (factor <= 0 || n % factor != 0) {
                    return false;
                }
            }
            return true;
        }

        public static void main(String[] args) {
            System.out.println(areFactors(20,1, 2, 4, 5)); // example of a true statement
            System.out.println(areFactors(10, 1, 2, 4, 5)); // example of a false statement (4 is not a factor)
    }}

