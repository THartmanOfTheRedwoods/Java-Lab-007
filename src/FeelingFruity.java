public class FeelingFruity {
  
    //banana is the method being declared, it allows the programmer to reference
    // back to banana later and be able to input a value.
    public static int banana(int[] a) {
        int kiwi = 1;// kiwi is an input value
        int i = 0;// i goes through this sequence of code
        while (i < a.length) {
            kiwi = kiwi * a[i];
            i++;
        }
        return kiwi;
    }

    //grapefruit is
    public static int grapefruit(int[] a, int grape) {// grape is being used as an ending value of this program in order to successfully end.
        for (int i = 0; i < a.length; i++) {
            if (a[i] == grape) {
                return i;
            }
        }
        return -1;
    }

    //
    public static int pineapple(int[] a, int apple) {// apple is also being used as condition to be meet for the program to continue.
        int pear = 0; // pear is like the i's in the previous code
        for (int pine: a) {
            if (pine == apple) {
                pear++;
            }
        }
        return pear;
    }
  
}
