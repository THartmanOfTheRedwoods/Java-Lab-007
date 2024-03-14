import java.util.Arrays;

public class ArrayExploration {

    // Method to find the index of the largest element using an enhanced for loop.
    // Enhanced for loop cannot be used for finding the index of the largest element because it does not provide access to the index.
    // Using a regular for loop is more suitable for this task.
    public static int indexOfMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1; // Return -1 for empty or null array.
        }

        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    // Method to generate a boolean array indicating prime numbers up to n using Sieve of Eratosthenes algorithm.
    public static boolean[] sieve(int n) {
        boolean[] primes = new boolean[n];
        Arrays.fill(primes, true); // Assume all numbers are prime initially.
        primes[0] = primes[1] = false; // 0 and 1 are not prime.

        for (int i = 2; i * i < n; i++) {
            if (primes[i]) {
                for (int j = i * i; j < n; j += i) {
                    primes[j] = false; // Mark multiples of prime numbers as not prime.
                }
            }
        }
        return primes;
    }

    // Method to check if the numbers in the array are all factors of n.
    public static boolean areFactors(int n, int[] factors) {
        for (int factor : factors) {
            if (n % factor != 0) {
                return false; // If any number is not a factor, return false.
            }
        }
        return true;
    }

    // Method to check if the numbers in the array are all prime and their product is n.
    public static boolean arePrimeFactors(int n, int[] primeFactors) {
        int product = 1;
        for (int factor : primeFactors) {
            if (!isPrime(factor)) {
                return false; // If any factor is not prime, return false.
            }
            product *= factor;
        }
        return product == n;
    }

    // Method to check if a number is prime.
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to generate a histogram of letters in a string.
    public static int[] letterHist(String str) {
        int[] histogram = new int[26];
        for (char ch : str.toLowerCase().toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                histogram[ch - 'a']++; // Increment the count for the corresponding letter.
            }
        }
        return histogram;
    }

    // Example usage in a main method:
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 15};
        System.out.println("Index of max: " + indexOfMax(arr)); // Output: 2 (index of 20)

        boolean[] primes = sieve(20);
        System.out.println("Primes up to 20: " + Arrays.toString(primes)); // Output: array indicating prime numbers

        int[] factors = {2, 3};
        System.out.println("Are factors: " + areFactors(12, factors)); // Output: true (12 is divisible by 2 and 3)

        int[] primeFactors = {2, 3};
        System.out.println("Are prime factors: " + arePrimeFactors(12, primeFactors)); // Output: true (2 * 3 = 12)

        String str = "Hello World";
        System.out.println("Letter histogram: " + Arrays.toString(letterHist(str))); // Output: histogram of letters
    }
}