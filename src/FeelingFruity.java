public class FeelingFruity {

    //Calculates the final number of all elements in the given array
    public static int banana(int[] a) {
        int kiwi = 1; // Keeps tally of the total.
        int i = 0;    // Counts the amount of loop throughs.
        while (i < a.length) {
            kiwi = kiwi * a[i];
            i++;
        }
        return kiwi;
    }

    //* Tells you where any given int is in the array by returning the index
    public static int grapefruit(int[] a, int grape) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == grape) {
                return i;
            }
        }
        return -1;
    }

    //Tallies the amount of occurrences of a certain integer in the given array
    public static int pineapple(int[] a, int apple) {
        int pear = 0; // Counter for occurrences
        for (int pine : a) {
            if (pine == apple) {
                pear++;
            }
        }
        return pear;
    }

}