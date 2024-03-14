public class FeelingFruity {
  
    // method banana returns the product of the elements of the integer array a
    // kiwi is the current product
    // i is the index
    public static int banana(int[] a) {
        int kiwi = 1;
        int i = 0;
        while (i < a.length) {
            kiwi = kiwi * a[i];
            i++;
        }
        return kiwi;
    }
      
    // method grapeFruit returns the index of the integer grape in the array a, or -1 if grape is not in a
    public static int grapefruit(int[] a, int grape) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == grape) {
                return i;
            }
        }
        return -1;
    }
    
    // method pineapple counts how many times the integer apple occurs in array a
    // pear is the counter, pine is the index
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
