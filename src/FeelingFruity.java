public class FeelingFruity {
  
    // Banana helps us calculate the product of all elements in an array.
    public static int banana(int[] a) {
        int kiwi = 1;
        int i = 0;
        while (i < a.length) {
            kiwi = kiwi * a[i];
            i++;
        }
        return kiwi;
    }
      
    // Grapefruit helps us find the first location of a specific value within the array.
    public static int grapefruit(int[] a, int grape) {
            for (int i = 0; i < a.length; i++) {
            if (a[i] == grape) {
                return i;
            }
        }
        return -1;
    }
    
    // Pineapple helps us track the number of times a specific value appears in an array.
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
