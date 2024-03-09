import java.util.Arrays;
public class ArrayExploration {

    public static int indexofMax(int[] array) {
        int maxIndex = 0;
        for (int i =1; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static boolean[] sieve(int n) {
        boolean [] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        isPrime [0] = isPrime [1] = false;

        for (int i = 2; i * i <= n; i++) {
    if (isPrime[i]) {
        for (int j = i * i; j < n; j += i) {
    isPrime[j] = false;
        }
    }
        }
        return isPrime;
    }
        public static boolean areFactors(int n, int [] factors) {
            for (int factor : factors) {
                if (n % factor != 0) {
                    return false;
                }
            }
            return true;
        }

        public static boolean arePrimeFactors(int n, int[] primeFactors) {
            boolean [] isPrime = sieve(n);
            for (int factor : primeFactors) {
                if (!isPrime[factor]) {
                    return false;
                }
            }
            int product = 1;
            for (int factor : primeFactors) {
                product *= factor;
            }
            return product == n;
            }

        public static int[] letterHist(String input) {
            int[] histogram = new int[26];

            for (char ch : input.toLowerCase().toCharArray()) {
                if (Character.isLetter(ch)) {
                    int index = ch - 'a';
                    histogram[index]++;
                }
            }
            return histogram;
        }
}

