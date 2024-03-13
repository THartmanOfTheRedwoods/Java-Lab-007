import java.util.Arrays;

public class ArrayExploration {

    public static int indexOfMax(int[] array) {
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static boolean[] sieve(int n) {
        boolean[] primes = new boolean[n];
        Arrays.fill(primes, true);
        primes[0] = primes[1] = false;
        for (int i = 2; i * i < n; i++) {
            if (primes[i]) {
                for (int j = i * i; j < n; j += i) {
                    primes[j] = false;
                }
            }
        }
        return primes;
    }

    public static boolean areFactors(int n, int[] factors) {
        for (int factor : factors) {
            if (n % factor != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean arePrimeFactors(int n, int[] primeFactors) {
        boolean[] primes = sieve(n + 1);
        for (int factor : primeFactors) {
            if (n % factor != 0 || !primes[factor]) {
                return false;
            }
        }
        return true;
    }

    public static int[] letterHist(String str) {
        int[] histogram = new int[26];
        for (char ch : str.toLowerCase().toCharArray()) {
            if (Character.isLetter(ch)) {
                histogram[ch - 'a']++;
            }
        }
        return histogram;
    }

    public static void main(String[] args) {
        // Test the methods here
        int[] array = {3, 1, 5, 7, 9, 2, 8, 6};
        System.out.println("Index of max element: " + indexOfMax(array));

        int n = 20;
        System.out.println("Prime numbers up to " + n + ": " + Arrays.toString(sieve(n)));

        int[] factors = {2, 4, 5};
        System.out.println("Are factors: " + areFactors(20, factors));

        int[] primeFactors = {2, 3, 5};
        System.out.println("Are prime factors: " + arePrimeFactors(30, primeFactors));

        String str = "Hello, World!";
        System.out.println("Letter histogram: " + Arrays.toString(letterHist(str)));
    }
}
