import java.util.Arrays;

public class ArrayExploration {
    public static int indexOfMax(int[] a) {
        //index of thd largest element
        int maxI = 0; //It initializes maxI to 0, which represents the index of the maximum element.
        for (int i=1; i<a.length; i++) { //It iterates through the elements of the array using a for loop, starting from index 1.
            if (a[i] > a[maxI]) { //It compares each element with the element at index maxI, updating maxI if the current element is greater.
                maxI = i;
            }
        }
        return maxI; //Finally, it returns maxI, which holds the index of the maximum element.
    }


    public static int indexOfMaxEF(int[] a) { //Enhanced for-loop
        int maxI = 0;
        int i=maxI;
        for (int v : a) {
            if (v > a[maxI]) {
                maxI = i;
            }
            i++;
        }
        return maxI;
    /*
    * This method is similar to indexOfMax, but it uses an enhanced for-loop
     (for (int v : a)) to iterate over the elements of the array.
     * */
    }

    /*
    algorithm Sieve of Eratosthenes is
    input: an integer n > 1.
    output: all prime numbers from 2 through n.

    let A be an array of Boolean values, indexed by integers 2 to n,
    initially all set to true.

    for i = 2, 3, 4, ..., not exceeding √n do
        if A[i] is true
            for j = i2, i2+i, i2+2i, i2+3i, ..., not exceeding n do
                set A[j] := false

    return all i such that A[i] is true.
    */

    public static boolean[] sieve(int n) {
        boolean[] isPrime = new boolean[n + 1]; //It initializes a boolean array isPrime of size n + 1, where each element represents whether the corresponding number is prime.
        Arrays.fill(isPrime, true); //It initializes all elements of isPrime to true.
        isPrime[0] = isPrime[1] = false;
        for(int i=2; i * i <= n; i++) { //It iterates through numbers from 2 to the square root of n, marking multiples of each prime number as non-prime.
            if (isPrime[i]) {
                for (int j = i * i; j<=n; j += i) {
                    isPrime[j] = false;
                } //Finally, it returns the isPrime array, where isPrime[i] is true if i is prime and false otherwise.
            }
        }
        return isPrime;
    }


    public static boolean areFactors(int n, int[] a) {
        //This method checks if all elements of an integer array a are factors of a given integer n.
        for (int v : a ) { //It first checks if all elements of a are factors of n using the areFactors method.
            if (n % v != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean arePrimeFactors (int n, int[] a) {
        if (!areFactors(n, a)) {
            return false;
        }
        boolean[] primes = sieve(a[indexOfMax(a)]);
        for (int v : a) {
            if (!primes[v]) {
                return false;
            }
        }
        return true;
    }

    public static int[] letterHist(String sentence) {
        int[] letterFreq = new int[26];
        Arrays.fill(letterFreq, 0);
        String lcSentence = sentence.toLowerCase();
        for (int i=0; i<lcSentence.length(); i++) {
            int index = (int)lcSentence.charAt(i) - 'a';
            if (index < 0 || index > 25) { continue; }
            letterFreq[index]++;

        }
        return letterFreq;
    }

    public static void pageBreak() {
        System.out.println("-----");
    }



    public static void main(String[] args) {
        System.out.printf("%s%n",
                Arrays.toString("abcdefghijklmnopqrstuvwxys".split("")));
                System.out.printf("%s%n",
                Arrays.toString(
                        letterHist("Hello World!")));

        pageBreak();

        int[] myA = new int[]{5,10,20,11,6,3};
        int index = indexOfMax(myA);
        System.out.printf(
                "Max Index of %s is %d%n", Arrays.toString(myA), indexOfMaxEF(myA));

        pageBreak();

        int n = 14;
        System.out.printf("The primes less than %d are %s%n",
                n,
                Arrays.toString(sieve(n))
        );

        pageBreak();

        int[] myB = new int[]{5,10,20};
        int myN = 100;
        System.out.printf("Are the numbers in the array %s factors of %d, %b%n",
                Arrays.toString(myB), myN, areFactors(myN, myB));

        pageBreak();

        myB = new int[]{5,7,4};
        myN = 140;
        System.out.printf("Are the numbers in the array %s factors of %d, %b%n",
                Arrays.toString(myB), myN, arePrimeFactors(myN, myB));
    }
}
