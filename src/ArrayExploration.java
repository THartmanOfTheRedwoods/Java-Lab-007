public class ArrayExploration {

    public static int indexOfMax(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }

        int index = 0;
        int value = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > value) {
                value = array[i];
                index = i;
            }
        }

        return index;
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
        if (factors == null || factors.length == 0) {
            return false;
        }
        for (int factor : factors) {
            if (n % factor != 0) return false;
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
    public static boolean arePrimeFactors(int n, int[] primeFactors) {
        for (int factor : primeFactors) {
            if (!isPrime(factor) || n % factor != 0) {
                return false;
            }
        }
        return true;
    }
    public static int[] letterHist(String str) {
        int[] histogram = new int[26];
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                int index = Character.toLowerCase(ch) - 'a';
                histogram[index]++;
            }
        }
        return histogram;
    }
    public static void main(String[] args) {
        int n = 30;
        int[] primeFactors = {2, 3, 5, 7};
        boolean result = arePrimeFactors(n, primeFactors);
        System.out.println("Are the numbers in the array prime factors of " + n + "? " + result);

        String inputString = "Hello World";
        int[] letterHistogram = letterHist(inputString);
        System.out.println("Letter Histogram:");
        for (int i = 0; i < 26; i++) {
            char letter = (char) ('a' + i);
            System.out.println(letter + ": " + letterHistogram[i]);
        }
    }
}



