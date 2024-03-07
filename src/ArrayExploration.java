import java.util.Arrays;

public class ArrayExploration {
    public static int indexOfMax(int[] a){
        int maxI= 0;
        for (int i= 1;i<a.length;i++){
            if(a[i]>a[maxI]){
                maxI = i;
            }
        }
        return maxI;
    }
    public static int indexOfMaxEf(int[] a){
        int maxI= 0;
        int i  = maxI;
        for(int v : a){
            if(v>a[maxI]){
                maxI = i;
            }
            i++;
        }
        return maxI;
    }
    /*
    algorithm Sieve of Eratosthenes is
    input: an integer n > 1.
    output: all prime numbers from 2 through n.

    let A be an array of Boolean values, indexed by integers 2 to n,
    initially all set to true.

    for i = 2, 3, 4, ..., not exceeding √n do
        if A[i] is true
            for j = i^2, i^2+i, i^2+2i, i^2+3i, ..., not exceeding n do
                set A[j] := false

    return all i such that A[i] is true.
     */
    public static boolean[] sieve(int n){
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);
        isPrime[0]= isPrime[1] =false;
       for(int i=2; i*i<=n;i++){
           if(isPrime[i]){
               for(int j = i*i;j<=n;j+=i){
                   isPrime[j]=false;
               }
           }
       }
       return isPrime;
    }
    public static boolean areFactors(int n, int[] a){
        for(int v : a){
            if(n % v !=0){
                //System.out.println("");
                return false;
            }
        }
        return true;
    }
    public static boolean arePrimeFactors(int n, int[] a){
        if(!areFactors(n,a)){
            return false;
        }
        boolean[] prime = sieve(a[indexOfMax(a)]);
        for (int v:a ){
            if (!prime[v]){
                return false;
            }
        }
        return true;
    }
    public static int[] letterHist(String sentence){
        int[] letterfreq = new int[26];
        Arrays.fill(letterfreq, 0);
        String LcSentence = sentence.toLowerCase();
        for(int i=0; i<LcSentence.length();i++){
            int index = (int)LcSentence.charAt(i) - 'a';
            if(index <0 || index >25 ){
                continue;
            }
            letterfreq[index]++;

        }
        return letterfreq;
    }
    public static void main(String[] args) {
        System.out.printf("%s%n", Arrays.toString("abcdefghikjlmnopqrstuvwstuvwxyz".split("")));
        System.out.printf("%s%n",Arrays.toString(letterHist("Helloe World!")));

        /*
        int[] myarray= new int[]{5,10,20,11,6,3};
        int index= indexOfMax(myarray);
        System.out.printf("MAX index of %s is %d and the max value is %d%n",
                Arrays.toString(myarray),indexOfMax(myarray),myarray[index]);
        int n= 14;
        System.out.printf("The Prime less than %d are %s%n", n, Arrays.toString(sieve(n)));

        int[] myB= new int[]{5,10,20,15};
        int myN =100;
        System.out.printf("Are the numberin the array %s a factor of %d, %b%n",
                Arrays.toString(myB),myN,  areFactors(myN, myB));

        myB= new int[]{5,7};
        myN=105;
        System.out.printf("Are the numberin the array %s a factor of %d, %b%n",
                Arrays.toString(myB),myN,  areFactors(myN, myB));
        myB= new int[]{5,7,4};
        myN=145;
        System.out.printf("Are the numberin the array %s a factor of %d, %b%n",
                Arrays.toString(myB),myN,  areFactors(myN, myB));  */
    }

}
