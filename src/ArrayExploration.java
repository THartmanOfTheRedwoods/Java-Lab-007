import java.util.Arrays;


public class ArrayExploration {
    public static int indexOfMax(int[] inputArray) {
        int maxIndex = 0;
        //going to be used to compare index and their elements
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] > inputArray[maxIndex]) { //compares index value with another, if index value is bigger that become new index max to compare
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static boolean[] sieve(int n) {
        boolean[] primArray = new boolean[n];
        Arrays.fill(primArray, true);
        primArray[0] = false;
        primArray[1] = false;
        for (int p = 2; p * p < n; p++) {
            for (int m = p * p; m < n; m = m + p) {
                primArray[m] = false;
            }
        }
        return primArray;
    }

    public static boolean areFactors(int n, int[] factors) {
        for (int f : factors) {
            if (n % f != 0)
                return false;
        }
        return true;
    }

    public static boolean arePrimeFactors(int n, int[] pFactors) {
        int prod = 1;
        for (int p : pFactors) {
            prod *= p;
        }
        if (prod != n) {
            return false;
        }
        for (int p : pFactors) {
            if (p <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(p); i++) {
                if (p % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int[] letterHist(String s) {
        int[] histogram = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char letter = s.toLowerCase().charAt(i);
            if (letter >= 'a' && letter <= 'z') {
                histogram[letter - 'a']++;
            }
        }
        return histogram;
    }
    public static void main(String[] args) {
        int[] testArray = {400, 6, 18, 49, 29, 43, 19, 4, 8};
        //                 0,1, 2, 3, 4, 5, 6, 7, 8
        System.out.println("The index \"" + indexOfMax(testArray) + "\" contains the highest value");
        int test = 210;
        boolean[] result = sieve(test);
        System.out.print("Prime numbers up to " + test + " are: ");
        for (int i = 0; i < test; i++) {
            if (result[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        int[] testFactors = {2, 3, 5, 7};
        boolean areFactors = areFactors(test, testFactors);
        System.out.print("The numbers: ");
        for (int i = 0; i < testFactors.length; i++) {
            System.out.print(testFactors[i]);
            if (i < testFactors.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" are factors of " + test + ", " + areFactors + "!");
        boolean aPR = arePrimeFactors(test, testFactors);
        System.out.print("The numbers: ");
        for (int i = 0; i < testFactors.length; i++) {
            System.out.print(testFactors[i]);
            if (i < testFactors.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" are all prime and they are factors of " + test + ", " + aPR + "!");
        System.out.println(Arrays.toString(letterHist("abanana")));
    }
}