public class FeelingFruity {

    //banana method takes an integer array as an input and returns the product of all the elements in the array
    public static int banana(int[] a) {
        int kiwi = 1; // initialize the product variable to 1
        int i = 0;// initialize the index variable to 0
        while (i < a.length) {
            kiwi = kiwi * a[i];//multiply current element with the product
            i++;//increment the index
        }
        return kiwi;//return product of all elements
    }
      //grapefruit method takes two integers as input "a" and "grape"and Returns the index when searching for the first occurance of grape or returns -1 if not found.
    public static int grapefruit(int[] a, int grape) {// target integer value that the method searches for within the input array
        for (int i = 0; i < a.length; i++) {
            if (a[i] == grape) {
                return i;
            }
        }
        return -1;
    }
    //pineapple method takes a and apple as inputs, counts the occurrences of apple in a and returns the count
    public static int pineapple(int[] a, int apple) {
        int pear = 0;//counts the occurrence of apple in array a
        for (int pine: a) {//represents each element of the input array during iteration
            if (pine == apple) {
                pear++;
            }
        }
        return pear;
    }
  
}
