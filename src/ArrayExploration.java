public class ArrayExploration {

    public static int indexOfMax(int[] array) {
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static boolean [] sieve(int n){
        boolean[] primes = new boolean[n];
        for (int i = 2; i < n; i++) {
            primes [i] = true;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (primes[i]) {
                for (int j = i * i; j < n; j += i){
                    primes [j] = false;
                }
            }
        }
        return primes;
    }
    public static boolean areFactors (int n, int [] array) {
        for (int i : array) {
            if (n % i != 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean arePrimeFactors(int n, int[] array) {
        int product = 1;
        for (int i : array) {
            if (!isPrime(i)){
                return false;
            }
            product *=i;
        }
        return product == n;
    }
    private static boolean isPrime(int n){
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int [] letterHist(String s) {
        int[] hist = new int [26];
        for (char c : s.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)){
                hist[c - 'a'] ++;
            }
        }
        return hist;
    }
}