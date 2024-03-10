import java.util.Arrays;

public class ArrayExploration {

    public static void main(String[] args) {
        // example uses
        int[] array = {3, 8, 2, 5, 10, 7};
        System.out.println("Index of max element: " + indexOfMax(array));

        int n = 20;
        boolean[] primes = sieve(n);
        System.out.println("Prime numbers up to " + n + ": " + Arrays.toString(primes));

        int[] factorsArray = {2, 5};
        int number = 20;
        System.out.println("Are factors: " + areFactors(number, factorsArray));

        int[] primeFactorsArray = {2, 5};
        int productNumber = 10;
        System.out.println("Are prime factors: " + arePrimeFactors(productNumber, primeFactorsArray));

        String inputString = "Howdy World! What a wonderfully wicked wild wild west we're livin' in!";
        int[] letterHistogram = letterHist(inputString);
        System.out.println("Letter Histogram: " + Arrays.toString(letterHistogram));
    }

    public static int indexOfMax(int[] array) {

        int maxIndex = 0;
        int maxValue = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxIndex = i;
                maxValue = array[i];
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
        for (int primeFactor : primeFactors) {
            if (!sieve(primeFactor + 1)[primeFactor] || n % primeFactor != 0) {
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
}