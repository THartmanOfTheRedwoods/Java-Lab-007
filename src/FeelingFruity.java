public class FeelingFruity {

    // banana multiplies an array of numbers
    public static int banana(int[] a) {
        int kiwi = 1; // kiwi is initialized, and will become the end result of the multiplication
        int i = 0; // i is the array indexer
        while (i < a.length) {
            kiwi = kiwi * a[i];
            i++;
        }
        return kiwi;
    }

    // grapefruit checks if a given number (grape) is in a given array (a)
    public static int grapefruit(int[] a, int grape) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == grape) {
                return i; // i will return the first position in the array where grape is found
            }
        }
        return -1;
    }

    // pineapple returns the amount of times apple appears in array a
    public static int pineapple(int[] a, int apple) {
        int pear = 0; // initializes variable - amount of times apple in a
        for (int pine: a) {
            if (pine == apple) {
                pear++;
            }
        }
        return pear;
    }

    // added main method for testing purposes
    public static void main(String[] args) {

        int[] test = {3,10,10,2,10};
        int tester = 10;

        System.out.println(banana(test));
        System.out.println(grapefruit(test, tester));
        System.out.println(pineapple(test, tester));
    }

}
