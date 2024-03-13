public class FeelingFruity {
    //Calculates the meaning of all elements
    public static int banana(int[] a) {
        //Stores kiwi to 1
        int kiwi = 1;
        //The loops counter
        int i = 0;
        while (i < a.length) {
            kiwi = kiwi * a[i];
            i++;
        }
        return kiwi;
    }
    //Method to find the index
    public static int grapefruit(int[] a, int grape) {
        //int i= The loops counter
        for (int i = 0; i < a.length; i++) {
            if (a[i] == grape) {
                return i;
            }
        }
        return -1;
    }
    //Method, counts how often an elements comes
    public static int pineapple(int[] a, int apple) {
        //Counts how often. Not a loop counter
        int pear = 0;
        for (int pine: a) {
            if (pine == apple) {
                pear++;
            }
        }
        return pear;
    }
    // Main method, entry point of the program
    public static void main(String[] args) {
    }
}
