import java.util.Scanner;

public class ArrayExploration {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }


        int maxIndex = indexOfMax(numbers);
        System.out.println("Index of the largest element: " + maxIndex);

        System.out.print("Enter the limit for finding prime numbers: ");
        int limit = scanner.nextInt();
        boolean[] primes = sieve(limit);
        System.out.println("Prime numbers up to " + limit + ":");
        for (int i = 0; i < primes.length; i++) {
            if (primes[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.print("Enter an integer n: ");
        int n = scanner.nextInt();
        System.out.print("Enter the number of elements in the array: ");
        int numCount = scanner.nextInt();
        int[] factorsArray = new int[numCount];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < numCount; i++) {
            factorsArray[i] = scanner.nextInt();
        }
        System.out.println("Are factors: " + areFactors(n, factorsArray));
        System.out.println("Are prime factors: " + arePrimeFactors(n, factorsArray));

        System.out.print("Enter a string: ");
        scanner.nextLine();
        String inputString = scanner.nextLine();
        int[] histogram = letterHist(inputString);
        System.out.println("Letter Histogram:");
        for (int i = 0; i < histogram.length; i++) {
            if (histogram[i] > 0) {
                char letter = (char) ('a' + i);
                System.out.println(letter + ": " + histogram[i]);
            }
        }

        scanner.close();
    }

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
        boolean[] primes = new boolean[n];
        for (int i = 2; i < n; i++) {
            primes[i] = true;
        }

        for (int p = 2; p * p < n; p++) {
            if (primes[p]) {
                for (int i = p * p; i < n; i += p) {
                    primes[i] = false;
                }
            }
        }

        return primes;
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

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int[] letterHist(String str) {
        int[] histogram = new int[26];

        for (char ch : str.toLowerCase().toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                histogram[ch - 'a']++;
            }
        }

        return histogram;
    }
}