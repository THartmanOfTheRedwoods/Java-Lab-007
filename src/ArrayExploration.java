public class ArrayExploration {

    public int indexOfMax(int [] values){
        int maxvalue = 0;
        int number = 0;
        for (int i = 0; i < values.length; i++) {
            if (maxvalue == 0) maxvalue = values[i];
            else {
                if (maxvalue < values[i]) {
                    maxvalue = values[i];
                    number = i;
                }
            }
        }
        return number +1;
    }
    //Yes, you can use an enhanced for loop because there are many accumulation values.
    public void sieve(int n){
        boolean prime[] = new boolean[n + 1];
        for (int i = 0; i <= n; i++)
            prime[i] = true;

        for (int a = 2; a * a <= n; a++) {
            if (prime[a] == true) {
                for (int i = a * a; i <= n; i += a)
                    prime[i] = false;
            }
        }
        for (int i = 2; i <= n; i++) {
            if (prime[i] == true)
                System.out.println(i + "");
        }

    }
    public static boolean areFactors(int n, int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%n !=0) {
                return false;
            }
        }
        return true;
    }
    public static boolean arePrimeFactors(int n, int[] arr){
        boolean prime[] = new boolean[n + 1];
        for (int a = 2; a * a <= n; a++) {
            if (prime[a] == true) {
                for (int i = a * a; i <= n; i += a)
                    prime[i] = false;
            }
        }
        return true;
    }
    public static int[] letterHist(String a) {
        int[] hist = new int[26];
        for (int i = 0; i < a.length(); i++) {
            char b = a.toLowerCase().charAt(i);

            if ('a' <= b && b <= 'z') {
                hist[b - 'a']++;
            }
        }
        return hist;

    }


    public static void main(String args[])
    {
        int n = 30;
        System.out.print("The prime numbers are: " + n);
        ArrayExploration g = new ArrayExploration();
        g.sieve(n);


    }
}
