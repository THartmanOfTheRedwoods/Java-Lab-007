import java.util.Arrays;

public class ArrayExploration {

    public static int indexOfMax(int[] array) {
        int maxIndex = 0;
        int maxValue = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
                maxIndex = i;
            }
        }

        return maxIndex;
    }

    public static boolean[] sieve(int n) {
        boolean[] primes = new boolean[n];
        for (int i = 2; i < n; i++) {
            primes[i] = true;
        }

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
        for (int factor : primeFactors) {
            if (!isPrime(factor) || n % factor != 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int[] letterHist(String input) {
        int[] histogram = new int[26];

        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                int index = Character.toLowerCase(ch) - 'a';
                histogram[index]++;
            }
        }

        return histogram;
    }

    public static void main(String[] args) {
        int[] testArray = {3, 1, 5, 9};
        int[] testArray2 = {2, 3, 5, 7, 11};

        System.out.println(indexOfMax(testArray));
        System.out.println(Arrays.toString(sieve(20)));
        System.out.println(areFactors(45,testArray));
        System.out.println(arePrimeFactors(2310,testArray2));
        System.out.println(Arrays.toString(letterHist("This will be converted into a histogram of how many times each letter of the alphabet appears in this string.")));

    }
}
