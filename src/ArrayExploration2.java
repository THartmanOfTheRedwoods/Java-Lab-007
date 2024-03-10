import java.util.Arrays;

public class ArrayExploration2 {
    public static boolean[] sieve(int n) {
        boolean[] prime = new boolean[n];
        for (int i = 2; i < n; i++) {
            prime[i] = true;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (prime[i]) {
                for (int j = i * i; j < n; j += i) {
                }
            } System.out.println();
        }
        return prime;
    }
    public static void main(String[] args){
    boolean[] prime = sieve(10);
System.out.println(Arrays.toString(prime));
}}
