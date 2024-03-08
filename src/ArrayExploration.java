import java.util.Arrays;

public class ArrayExploration {

    /*
    indexOfMax: An enhanced for loop cannot be used because it does not track the index,
    and we are looking for the index of the max element of the array.
     */
    public static int indexOfMax(int[] a) {
        int max=0;
        int index = 0;
        for (int i=0; i<a.length; i++) {
            if (a[i] > max){
                max = a[i];
                index = i;
            }
        }
        return index;
    }

    public static boolean[] sieve(int n) {
        boolean[] isPrime = new boolean[n];
        if (n <= 2) {
            System.err.println("Integer n must be greater than 2.");
            return isPrime;
        }
        isPrime[0] = false;
        isPrime[1] = false;
        isPrime[2] = true;
        for (int i=3; i<n; i++) {
            for (int k=2; k<i; k++){
                if (i%k == 0){
                    isPrime[i] = false;
                    break;
                } else {
                    isPrime[i] = true;
                }
            }
        }
        return isPrime;
    }

    public static boolean areFactors(int n, int[] intArray) {
        boolean result = true;
        for (int integer: intArray) {
            if (n%integer != 0){
                result = false;
                return result;
            }
        }
        return result;
    }

    public static boolean arePrimeFactors(int n, int[] intArray) {
        int product = 1;
        for (int integer : intArray) {
            if (integer == 0 || integer == 1) {
                return false;
            } else {
                for (int k=2; k<integer; k++) {
                    if (integer % k == 0) {
                        return false;
                    }
                }
                product = product * integer;
            }
        }
        if (product == n){
            return true;
        } else {
            return false;
        }
    }

    public static int[] letterHist(String s) {
        String lower = s.toLowerCase();
        int[] alphaHist = new int[26];
        for (char letter : lower.toCharArray()) {
            int index = letter - 'a';
            alphaHist[index]++;
        }
        return alphaHist;
    }

    public static void main(String[] args){
        int array[] = {69, 2, 3, 15, 4, 29, -1};
        System.out.println(indexOfMax(array));

        System.out.println(Arrays.toString(sieve(12)));

        int array2[] = {2, 3, 4, 6};
        int n = 60;
        System.out.println(areFactors(n, array2));

        int array3[] = {2, 4, 5};
        int n2 = 40;
        System.out.println(arePrimeFactors(n2, array3));

        System.out.println(Arrays.toString(letterHist("abcedfghijklmnopqrstuvwxyz")));
    }
}
