public class FeelingFruity {

    /* The banana method takes the integer in the ith element and multiplies it by the integer stored
    in the integer variable kiwi. It then returns that value and the loop begins again with the next
    element stored in the integer array. Once the integer i is less than the length of the integer
     array, the loops ends. */
    public static int banana(int[] a) {
        int kiwi = 1;
        int i = 0;
        while (i < a.length) {
            kiwi = kiwi * a[i];
            i++;
        }
        return kiwi;
    }

    /*The grapefruit method takes the ith element stored in the integer array, a, and compares it to integer
    grape. If the integer in the ith element in the integer array is equal to the integer stored in the
    variable grape, the loop returns the integer i. If the loop is false at the if statement, the loop returns -1.
    Once the integer i is less than the length of the integer array length, the loops ends.
     */
    public static int grapefruit(int[] a, int grape) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == grape) {
                return i;
            }
        }
        return -1;
    }


    /*The method pineapple takes a value from the integer array, a, and if a is equal to the value of apple, it adds
    1 to the value of pear. Once, the entire index of a has been checked, the loop ends and the value stored in pear will return.
     */
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
