//Calculates the product of all elements
public class FeelingFruity {
  
    public static int banana(int[] a) {
        //Represents accumulated product
        int kiwi = 1;
        int i = 0;
        while (i < a.length) {
            kiwi = kiwi * a[i];
            i++;
        }
        return kiwi;
    }
    // Searches for a value and returns it if found
    public static int grapefruit(int[] a, int grape) {
        // Shows found value or -1 if not found
        for (int i = 0; i < a.length; i++) {
            if (a[i] == grape) {
                return i;
            }
        }
        return -1;
    }
    // Counts how many times a value is in the input
    public static int pineapple(int[] a, int apple) {
        int pear = 0;
        for (int pine: a) {
            if (pine == apple) {
                pear++;
            }
        }
        return pear;
    }
  
}
