import java.util.Arrays;
public class ArrayExploration {
    //Yes, it's possible
    public static int indexOfMax(int[] arr) {
        int maxIndex = 0; //Largest element
        int max = arr[0];
        //The loop, takes the integers
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        //Return largest element
        return maxIndex;
    }

    public static boolean[] sieve(int n) {
        //Integer parameter n
        boolean[] primes = new boolean[n];
        //0 to n - 1
        for (int i = 2; i < n; i++) {
            //Prime initially
            primes[i] = true;
        }
        for (int p = 2; p * p < n; p++) {
            if (primes[p]) {
                for (int i = p * p; i < n; i += p) {
                    primes[i] = false;
                }
            }
        }
        //Return
        return primes;
    }

    public static boolean areFactors(int n, int[] arr) {
        for (int num : arr) {
            //If not divisible, return false
            if (n % num != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean arePrimeFactors(int n, int[] arr) {
        boolean result = true;

        //Is it prime and a factor of n
        for (int num : arr) {
            if (n % num != 0) {
                result = false;
                break;
            }
        }
        //Does it all equal n
        int product = 1;
        for (int num : arr) {
            product *= num;
        }
        if (product != n) {
            result = false;
        }
        return result;
    }

    public static int[] letterHist(String str) {
        int[] histogram = new int[26];
        //Loop traversing once
        //Case insensitive
        for (char ch : str.toLowerCase().toCharArray()) {
            if (Character.isLetter(ch)) {
                //The 25th element
                histogram[ch - 'a']++;
            }
        }

        return histogram;
    }
    // Main method, entry point of the program
    public static void main(String[] args) {
    }
}
