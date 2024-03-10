public class FeelingFruity {

    //calculates the elements in the array
    public static int banana(int[] a) {
        int kiwi = 1; //memory storage or accumulator
        int i = 0; //loop index
        while (i < a.length) {
            kiwi = kiwi * a[i];
            i++; //move to next element
        }
        return kiwi;
    }

    // looks for a value in the array
    public static int grapefruit(int[] a, int grape) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == grape) {
                return i; //returns if found
            }
        }
        return -1; //if not found it ends method
    }

    // counts how many times the value appears in the array
    public static int pineapple(int[] a, int apple) {
        int pear = 0; //stores how many times apple appears
        for (int pine: a) {
            if (pine == apple) {
                pear++;
            }
        }
        return pear;
    }
  
}
