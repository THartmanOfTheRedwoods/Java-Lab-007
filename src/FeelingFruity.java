public class FeelingFruity {
  
    public static int banana(int[] a) { // It calculates all the elements of the array by having i run through each of the elements and having kiwi translate the result as an int, so it can be returned.
        int kiwi = 1;
        int i = 0;
        while (i < a.length) {
            kiwi = kiwi * a[i];
            i++;
        }
        return kiwi;
    }
      
    public static int grapefruit(int[] a, int grape) { // It runs through all the elements of the array to see if one of them matches grape, if it does return grapes value, if it doesn't return -1.
        for (int i = 0; i < a.length; i++) {
            if (a[i] == grape) {
                return i;
            }
        }
        return -1;
    }
    
    public static int pineapple(int[] a, int apple) { // Detects if the value of apple is present in the array at any point, if it is return 1, if not return 0 through pear.
        int pear = 0;
        for (int pine: a) {
            if (pine == apple) {
                pear++;
            }
        }
        return pear;
    }
}
