public class FeelingFruity {
  
   // Multiplies all the elements of the array
    public static int banana(int[] a) {
        int kiwi = 1; //Product of the elements
        int i = 0;// Index for the iterating over the array
        while (i < a.length) {
            kiwi = kiwi * a[i]; //Updates kiwi
            i++; // Move to the next element
        }
        return kiwi; //Return the product
    }

    // Finds the index of the first occurrence of grape
    public static int grapefruit(int[] a, int grape) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == grape) {
                return i; // return grape if found
            }
        }
        return -1; //return -1 if grape cant be found
    }

    // Counts the number of occurrences of apple
    public static int pineapple(int[] a, int apple) {
        int pear = 0; // Counter for the occurrences of apple
        for (int pine: a) {
            if (pine == apple) {
                pear++; // Increment pear for each apple
            }
        }
        return pear; //return the total count of apple
    }
  
}
