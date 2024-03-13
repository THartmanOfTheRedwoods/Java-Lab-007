import java.util.Arrays;

public class ArrayExploration {

    public static int indexOfMax(int[] arr) {
        int max = 0;


        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;

        //this can be written as an enhanced for loop.
        //We don't need to know where the largest value is in the array, only what it is.
    }

    public static boolean[] sieve(int n) {

        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true); // Initialize all elements to true (assuming prime)

        isPrime[0] = false;
        isPrime[1] = false;
        // 0 and 1 are not prime

        // Use Sieve to mark non-primes
        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                // Mark multiples of i as non-prime
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        return isPrime;
    }

    public static boolean areFactors(int n, int[] factors) {

        for (int factor : factors) {
            // Check if factor is less than or equal to 0 or if n is not divisible by factor
            if (factor <= 0 || n % factor != 0) {
                return false;  // Not a factor, return false immediately
            }
        }

        // If all elements passed the checks, return true
        return true;
    }

    //check if a number is even
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean arePrimeFactors(int n, int[] factors) {

        int product = 1;
        for (int factor : factors) {
            // Check prime
            if (factor <= 1 || (factor > 2 && isEven(factor))) {
                return false;  // Factor is not prime
            }
            if (factor > 2) {
                for (int i = 3; i * i <= factor; i += 2) {  // Optimized loop for checking divisibility
                    if (factor % i == 0) {
                        return false;  // Factor is not prime
                    }
                }
            }
            product *= factor;
        }

        // Check if the product matches n
        return product == n;
    }

    public static int[] letterHist(String text) {
        if (text == null || text.isEmpty()) {
            return new int[26]; // Return empty histogram for empty string
        }

        int[] histogram = new int[26]; // Initialize histogram with 26 elements for all letters (a-z)

        // Traverse the string only once
        for (char c : text.toCharArray()) {
            int index = Character.toLowerCase(c) - 'a'; // Convert to lowercase and get index (0-25)
            if (index >= 0 && index < 26) {
                histogram[index]++; // Increment count for the corresponding character
            }
        }

        return histogram;
    }
}

