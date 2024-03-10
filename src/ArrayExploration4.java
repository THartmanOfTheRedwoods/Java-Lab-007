import java.util.Arrays;
public class ArrayExploration4 {


        public static boolean arePrimeFactors(int n, int... factors) {

            if (n < 0) {
                System.exit(1);
            }

            if (factors.length == 0) {
                return false;
            }

            for (int factor : factors) {
                if (factor <= 1 || !isPrime(factor)) {
                    return false;
                }
            }
            int product = 1;
            for (int factor : factors) {
                product *= factor;
            }
            return product == n;
        }

        private static boolean isPrime(int n) {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }

        public static void main(String[] args) {
            System.out.println(arePrimeFactors(81, 3, 3, 3, 3)); // true
            System.out.println(arePrimeFactors(10, 1, 2, 4, 5)); // false
        }
    }
