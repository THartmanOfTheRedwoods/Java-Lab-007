import java.util.Arrays;

public class ArrayExploration {
    public static int indexOfMax(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
        int maxIndex = 0;
        int maxValue=  array[0];

        for (int i =1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxIndex = i;
                maxValue = array[i];
            }
        }

        return maxIndex;

    }

    public static boolean[] sieve(int n) {
        boolean [] primes = new boolean[n];

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
    public static boolean areFactors ( int n, int[] factors) {
        for (int factor : factors) {
            if (!isPrime(factor)) {
                return false;
            }
            if (n % factor != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean arePrimeFactors(int n, int[] factors) {
        for (int factor : factors) {
            if (!isPrime(factor)) {
                return false;
            }
            if (n % factor != 0) {
                return false;
            }
        }

        return true;
    }
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int[] letterHist(String str) {
        int[] histogram = new int[26];

        str = str.toLowerCase();

        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                int index = ch - 'a';
                histogram[index]++;
            }
        }
        return histogram;
    }

    public static void main(String[] args) {
        int[] numbers = {3, 9, 2, 4, 7, 5};
        System.out.println("index of max: " + indexOfMax(numbers));

        boolean[] primes = sieve(30);
        System.out.println("Sieve of Eratosthenes: ");
        for (int i = 0; i < primes.length; i++) {
            if (primes[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        int[] factors = {2, 3, 5};
        int n = 30;
        System.out.println("Factors of " + n + ": " + areFactors(n, factors));

        int[] primeFactors = {2, 3, 5};
        System.out.println("Prime factors of " + n + ": " + arePrimeFactors(n, primeFactors));

        String text = "Hello, World!";
        System.out.println("Letter histogram: " + Arrays.toString(letterHist(text)));
    }
}
