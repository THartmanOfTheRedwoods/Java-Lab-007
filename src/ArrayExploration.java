import java.util.Arrays;
public class ArrayExploration {

    public static int indexOfMax(int[] a){
        int max = 0;

        for(int i = 1 ; i < a.length ; i++){
            if(a[i] > a[max]){
                //Trying to find the highest value within the myA array
                max = i;
            }
        }
        return max;
    }

    //Enhanced loop version of previous
    public static int indexOfMaxEF(int[] a){
        int max = 0;
        int i = max;
        for(int v : a){
            if(a[v] > a[max]){
                max = i;
            }
            i++;
        }
        return max;
    }

    public static boolean[] sieve(int n){
        boolean [] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for(int i = 2; i * i <= n; i++){
            if(isPrime[i]){
                for(int j = i * i; j <= n; j += i){
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }

    public static boolean areFactors(int n, int [] a){
        for(int v : a){
            if(n % v != 0){
                return false;
            }
        }
        return true;
    }

    public static boolean arePrimeFactors(int n, int[] a){
        if(!areFactors(n, a)){
            return false;
        }
        boolean[] primes = sieve(a[indexOfMax(a)]);
        for(int v : a){
            if(primes[v]){
                return false;
            }
        }
        return true;
    }

    public static int[] letterHist(String sentence){
        int[] letterFreq = new int[26];
        Arrays.fill(letterFreq, 0);
        String lcSentence = sentence.toLowerCase();
        for(int i = 0; i < lcSentence.length(); i++){
            int index = (int)lcSentence.charAt(i) - 'a';
            if(index < 0 || index > 25) {
                continue;
            }
            letterFreq[index]++;
        }
        return letterFreq;
    }
    public static void main(String[] args){

        int[] myA = new int [] {5,10,20,11,6,3};
                            // 0, 1, 2, 3, 4, 5
        int index = indexOfMax(myA);
        System.out.printf(
                "Max Index of %s is %d%n",
                Arrays.toString(myA), index, indexOfMax(myA));
        //Says its 2 but is really 20 because 20 is 2 being stored in the myA array

        int n = 14;
        System.out.printf("The primes less than %d are %s%n", n, Arrays.toString(sieve(n)));

        int[] myB = new int[]{5,10,20};
        int myN = 100;
        System.out.printf("Are the numbers in the array %s, factors of %d, %b%n", Arrays.toString(myB), myN, areFactors(myN, myB));

        myB = new int[]{5,7,3};
        //5x7x3 = 105
        myN = 105;
        System.out.printf("Are the numbers in the array %s, factors of %d, %b%n", Arrays.toString(myB), myN, areFactors(myN, myB));

        System.out.printf("%s%n", Arrays.toString("abcdefghijklmnopqrstuvwxyz".split("")));
        System.out.printf("%s%n", Arrays.toString(letterHist("Hello World!")));
    }
}
