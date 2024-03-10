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
        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
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
        int product = 1;
        for (int factor : primeFactors) {
            if (!isPrime(factor) || n % factor != 0) {
                return false;
            }
            product *= factor;
        }
        return product == n;
    }

    public static int[] letterHist(String str) {
        int[] hist = new int[26];
        for (char c : str.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                hist[c - 'a']++;
            }
        }
        return hist;
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
}
