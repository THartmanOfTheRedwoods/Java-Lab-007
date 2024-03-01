public class FeelingFruity {

    // Calculates the product of all elements in an array
    public static int banana(int[] a) {
        int kiwi = 1; //Accumulator for the kiwi
        int i = 0; // Index for iterating through the array
        while (i < a.length) {
            kiwi = kiwi * a[i]; // Multiply the product with the current element
            i++; // Move to the next element
        }
        return kiwi; // Return the product of all elements
    }
    // Searches for the index of a specified value in the given array.
    public static int grapefruit(int[] a, int grape) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == grape) {
                return i; // Return the index of the target value if found
            }
        }
        return -1; // Return -1 if not found
    }
    // Counts the occurrences of a specified value in the given array.
    public static int pineapple(int[] a, int apple) {
        int pear = 0; // Counter for the occurrences of the target value
        for (int pine: a) {
            if (pine == apple) {
                pear++; // Increment the counter if the current element equals the target
            }
        }
        return pear; // Return the total count of occurrences
    }
  
}
