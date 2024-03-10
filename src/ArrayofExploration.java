public class ArrayofExploration {
    public static boolean[] sieve(int n) {
        boolean[] isPrime = new boolean[n];

        for (int i = 0; i < n; i++) {
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

    public static boolean areFactors(int n, int[] array) {
        for (int num : array) {
            if (n % num != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean arePrimeFactors(int n, int[] array) {
        for (int num : array) {
            if (!isPrime(num) || n % num != 0) {
                return false;
            }
        }
        return true;
    }

    public static int[] letterHist(String str) {
        int[] histogram = new int[26];
        for (char ch : str.toLowerCase().toCharArray()) {
            if (Character.isLetter(ch)) {
                histogram[ch - 'a']++;
            }
        }
        return histogram;
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

    public static void main(String[] args) {
        int n = 50;
        boolean[] primes = sieve(n);
        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2; i < primes.length; i++) {
            if (primes[i]) {
                System.out.print(i + " ");
            }
        }
    }
}

