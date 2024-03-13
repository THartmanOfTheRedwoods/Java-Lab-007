
public class ArrayExploration {



    public static int indexOfMax(int[] array){
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxIndex) {
                maxIndex = array[i];

            }

        }
        return maxIndex;

    }
/**
    public static boolean[] sieve(int n) {
        //boolean[] primeN = new boolean[n];

 if (n <= 1) {
 return false;
 }
 for (int i = 2; i * i <= n; i++){
 return false;
 }
 return true;

    }
    */

    public static boolean areFactors(int n, int[] factors) {
        for (int factor : factors) {
            if (n % factor != 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean arePrimeFactors(int n, int[] factors){
        if (!areFactors(n, factors)) {
            return false;
        }
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++){
            return false;
        }
        return true;
    }


    public static int[] letterHist(String string){
        int[] histog = new int[26];
        string = string.toLowerCase();

        for (char letter : string.toCharArray()) {
            if (letter >= 'a' && letter <= 'z') {
                int index = letter -'a';
                histog[index]++;
            }
        }
        return histog;
    }


    public static void main(String[] args) {

        System.out.println("a");

    }
}
