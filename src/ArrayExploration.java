
import java.util.Arrays;
public class ArrayExploration {

   public static int indexOfMax( int [] a ){
       int x=a[0];
       int index=0;

       for (int i=0 ; i < a.length-1; i++){
            if (x<a[i+1]){
                x=a[i+1];
            }
            else x = x;
        }

       for (int i=0; i<a.length; i++) {
           if (a[i] == x) {
               index = i;
           }
       }
       return index;
    }

    public static void sieve(int n) {
        boolean[] prime = new boolean[n];

        int[] numbers = new int[n];
        for (int i=0;i<n;i++){
            numbers[i]=i+2;
        }
        prime[0] = false;
        prime[1] = false;
        prime[2] = true;

        for (int i = 3; i < n; i++) {
            for (int j = 0; j < n; j++)
                if (i % numbers[j] == 0) {
                    prime[i] = false;
                    if ((i / numbers[j]) == 1){
                    prime[i]=true;}
                    break;
                } else {
                    prime[i] = true;
                }
        }
        String truePrime = Arrays.toString(prime);
        System.out.println("A prime boolean array from 0 to n-1 is:  " + truePrime);
    }

    public static boolean areFactors(int n , int [] a) {
        for (int i=0 ; i<a.length;i++) {
            if (a[i] % n == 0) {
            }
            else return false;
        }
        return true;
    }

    public static boolean arePrimeFactors(int n , int [] a){
        int x=a[0];

        for (int i=0 ; i < a.length-1; i++) {
            if (x < a[i + 1]) {
                x = a[i + 1];
            } else x = x;
        }


       boolean[] prime = new boolean[a.length];
        int[] numbers = new int[x-1];
        for (int i=0;i<(x-1);i++){
            numbers[i]=i+2;
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++)
                if (a[i] % numbers[j] == 0) {
                    prime[i] = false;
                    if ((a[i]/numbers[j])==1){
                        prime[i]=true;}
                    break;
                } else {
                    prime[i] = true;
                }
        }

        int product=1;
        for (int i=0; i<a.length;i++){
            product=product*a[i];
        }


        for (int i=0; i<a.length; i++){
            if (product==n && prime[i]==true){
                continue;
            }
            else return false;
        }
        return true;

    }

    public static void letterHist(String test){
       test=test.toLowerCase();
       int[] histogram=new int[26];
       for (int i=0; i<test.length();i++){
            char letter = test.charAt(i);
            int index = letter - 'a';
            histogram[index]++;
       }
       System.out.println(Arrays.toString(histogram));


    }

    public static void main(String[] args) {
    }
}
