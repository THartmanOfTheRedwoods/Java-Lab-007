/**
 * @author Alexei Iachkov
 * @date 3-9-24
 * @version 2.0
 */

import java.util.Arrays;

public class ArrayExploration {

    public static int indexOfMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static boolean[] sieve(int n) {
        boolean[] primes = new boolean[n];
        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;
        for (int i = 2; i * i < n; i++) {
            if (primes[i]) {
                for (int j = i * i; j < n; j += i) {
                    primes[j] = false;
                }
            }
        }
        return primes;
    }

    public static boolean areFactors(int n, int[] arr) {
        for (int factor : arr) {
            if (n % factor != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean arePrimeFactors(int n, int[] arr) {
        int product = 1;
        for (int factor : arr) {
            if (n % factor != 0) {
                return false;
            }
            product *= factor;
        }
        return isPrime(product);
    }

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

    public static int[] letterHist(String str) {
        int[] hist = new int[26];
        for (char c : str.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                hist[c - 'a']++;
            }
        }
        return hist;
    }

    public static void main(String[] args) {
        int[] arr = {7, 3, 8, 2, 9, 5, 6, 1, 4};
        System.out.println("Maximum value in the array: " + indexOfMax(arr));
        System.out.println("Prime numbers up to 10: " + Arrays.toString(sieve(10)));
        System.out.println("Factors of 24: " + areFactors(24, new int[]{1, 2, 3, 4, 6, 12}));
        System.out.println("Prime factors of 27: " + arePrimeFactors(27, new int[]{1, 3, 9}));
        System.out.println("Letter histogram: " + Arrays.toString(letterHist("seven-up")));
    }
}