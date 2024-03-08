import java.util.Arrays;
public class ArrayExploration {
/* Book pg 119 explains that we can't use Enhanced for loops when
we "need to refer to the index, as in search operations." Basically, the method is designed for strings,
not integers, in an array. */


    // indexOfMax using a regular for loop.
    public static int indexOfMax(int[] numbers) {
        if (numbers.length == 0) {
            return -1; // Handle empty array
        }
        int maxIndex = 0;
        for (int i = 0; i < numbers.length; i++) { // Using a regular for loop to access the index
            if (numbers[i] > numbers[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    // Here's the Sieve of Eratosthenes for prime numbers
    public static boolean[] sieve(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);

        isPrime[0] = isPrime[1] = false; // 1 is not a prime anymore.
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }

    // This checks if all numbers in array are factors of n
    public static boolean areFactors(int n, int[] factors) {
        for (int factor : factors) {
            if (n % factor != 0) {
                return false;
            }
        }
        return true;
    }

    // This ought to check if all numbers in the array are prime factors, and their product is n
    public static boolean arePrimeFactors(int n, int[] factors) {
        if (!areFactors(n, factors)) {
            return false;
        }
        boolean[] isPrime = sieve(n);
        for (int factor : factors) {
            if (!isPrime[factor]) {
                return false;
            }
        }
        return true;
    }

    // Letter histogram for a string (case-insensitive)
    public static int[] letterHist(String str) {
        int[] histogram = new int[26];
        str = str.toLowerCase();
        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                histogram[c - 'a']++;
            }
        }
        return histogram;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 5, 3, 7};
        int indexOfMax = indexOfMax(numbers);
        System.out.println("Index of max element: " + indexOfMax);
    }
}
// It finishes with exit code 0.  That's good, right?  2 methods aren't being used, but did I
// follow the directions right?