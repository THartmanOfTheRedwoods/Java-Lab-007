public class FeelingFruity {
  
    //this runs 1x0 then 1x1 then 1x2, and so on while i < a.length, which a.length from int[] a which is decided on the array provided in main.
    public static int banana(int[] a) {
        int kiwi = 1;
        int i = 0;
        while (i < a.length) {
            kiwi = kiwi * a[i];
            i++;
        }
        return kiwi;
    }

    //This runs i++ as long as i<a.length with int[] a being provided in main, if it is equal to grape then it just gives what i is, if at any point i>grape it returns as -1 (not possible).
    public static int grapefruit(int[] a, int grape) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == grape) {
                return i;
            }
        }
        return -1;
    }

    //This runs if pine == apple and then outputs pear with 1 but if pine != apple pear stays as 0
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
