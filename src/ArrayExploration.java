import java.util.Arrays;

public class ArrayExploration {
    public static int indexOfMax (int[] array) {
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static boolean[] sieve(int n) {
        boolean[] primeNumbers = new boolean[n];
        for (int i = 2; i < n; i++) {
            primeNumbers[i] = true;
        }
        for (int i = 2; i * i < n; i++) {
            if (primeNumbers[i]) {
                for (int j = i * i; j < n; j += i) {
                    primeNumbers[j] = false;
                }
            }
        }
        return primeNumbers;
    }

    public static boolean areFactors(int n, int[] factors) {
        for (int factor : factors) {
            if (n % factor != 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for(int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean arePrimeFactors(int n, int[] primeFactors) {
        for (int factor : primeFactors) {
            if (n % factor != 0 || !isPrime(factor)) {
                return false;
            }
        }
        return true;
    }

    public static int[] letterHist(String string) {
        int histogram[] = new int[26];
        for (char character : string.toLowerCase().toCharArray()) {
            if (Character.isLetter(character)) {
                int index = character - 'a';
                histogram[index]++;
            }
        }
        return histogram;
    }

    public static void main(String[] args) {
        int[] testArray = {2, 3, 5, 6, 7, 13, 23, 17};
        int[] testArray2 = {2, 6, 7};
        int[] testPrimeFactorArray = {3,11};
        int testN = 42;
        int testNPrime = 13;

        //test indexOfMax()
        System.out.println("indexOfMax = " + indexOfMax(testArray)); // max index should be 6

        //test sieve()
        System.out.println("sieve = " + Arrays.toString(sieve(testNPrime))); //returns eval of 0-12

        //test areFactors()
        System.out.println("areFactors = " + areFactors(testN, testArray)); //false
        System.out.println("areFactors = " + areFactors(testN, testArray2)); //true

        //test arePrimeFactors()
        System.out.println("arePrimeFactors = " + arePrimeFactors(testN, testArray)); // false
        System.out.println("arePrimeFactors = " + arePrimeFactors(33, testPrimeFactorArray)); //true

        //test isPrime()
        System.out.println("isPrime = " + isPrime(testN)); //false
        System.out.println("isPrime = " + isPrime(testNPrime)); //true

        //test letterHist()
        System.out.println("letterHist = " + Arrays.toString(letterHist("This string is a test of the letterHist method")));


    }
}
