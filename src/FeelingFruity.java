public class FeelingFruity {

    // This method calculates the product of all elements in the array.
    public static int banana(int[] a) {
        // 'kiwi' is the accumulator for the product.
        int kiwi = 1;
        // 'i' is the loop index.
        int i = 0;
        while (i < a.length) {
            kiwi = kiwi * a[i];
            i++;
        }
        return kiwi;
    }

    // This method finds the index of the first occurrence of 'grape' in the array. If 'grape' is not in the array, it returns -1.
    public static int grapefruit(int[] a, int grape) {
        // 'i' is the loop index.
        for (int i = 0; i < a.length; i++) {
            if (a[i] == grape) {
                return i;
            }
        }
        return -1;
    }

    // This method counts the number of occurrences of 'apple' in the array.
    public static int pineapple(int[] a, int apple) {
        // 'pear' is the counter for the number of occurrences of 'apple'.
        int pear = 0;
        // 'pine' is the current element in the array.
        for (int pine: a) {
            if (pine == apple) {
                pear++;
            }
        }
        return pear;
    }

}
