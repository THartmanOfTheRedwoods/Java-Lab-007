public class ArrayExploration {
    public static int indexOfMax(int[] arr) {
        int maxIndex = 0;
        int max = arr[0];

        for (int num : arr) {
            if (num > max) {
                max = num;
                maxIndex = arr.length - 1;
                for (int i = 1; i < arr.length; i++) {
                    if (arr[i] == max) {
                        maxIndex = i;
                        break;
                    }
                }
            }
        }
        return maxIndex;
    }


    public static boolean[] sieve(int n) {
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);

        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }


    public static boolean areFactors(int n, int[] factors) {
        for (int factor : factors) {
            if (n % factor != 0) {
                return false;
            }
        }
        return true;
    }


    public static boolean arePrimeFactors(int n, int[] factors) {
        boolean allPrime = true;
        int product = 1;

        for (int factor : factors) {
            if (!isPrime(factor)) {
                allPrime = false;
                break;
            }
            product *= factor;
        }

        return allPrime && product == n;
    }


    public static int[] letterHist(String str) {
        int[] histogram = new int[26];

        for (char c : str.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                histogram[c - 'a']++;
            }
        }
        return histogram;
    }
}
}
