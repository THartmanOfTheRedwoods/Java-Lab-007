public class FeelingFruity {

    // Multiplies all elements of the array.
    public static int banana(int[] a) {
        int kiwi = 1; // Accumulates the multiplication result.
        int i = 0; // Index variable for array traversal.
        while (i < a.length) {
            kiwi = kiwi * a[i]; // Multiplies the current element with kiwi
            i++; // Move to the next element
        }
        return kiwi; // Returns the multiplication
    }

    // Searches for a specific element
    public static int grapefruit(int[] a, int grape) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == grape) {
                return i; // Returns the index of the first usage of grape.
            }
        }
        return -1; // Returns -1 if grape is not found.
    }

    // Counts occurrences of a specific element in the array.
    public static int pineapple(int[] a, int apple) {
        int pear = 0; // Counter for the occurrences of apple
        for (int pine: a) {
            if (pine == apple) {
                pear++; // Increment the counter if apple is found
            }
        }
        return pear; // Returns the total count of apple
    }

}


