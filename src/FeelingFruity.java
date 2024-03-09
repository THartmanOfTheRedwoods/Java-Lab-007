public class FeelingFruity {
  //multiplies all elements in array
    public static int banana(int[] a) {
        int kiwi = 1; //Accumulates the product of elements
        int i = 0; //index loop
        while (i < a.length) {
            kiwi = kiwi * a[i];
            i++;
        }
        return kiwi;
    }
      //searches for specific element
    public static int grapefruit(int[] a, int grape) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == grape) {
                return i; //returns the index of the element it found
            }
        }
        return -1; // returns -1 if the element was not found
    }
    //counts the occurrences of a specific element in the array
    public static int pineapple(int[] a, int apple) {
        int pear = 0; //counter for occurrences of the element
        for (int pine: a) {
            if (pine == apple) {
                pear++; //increases counter if element is found
            }
        }
        return pear; //returns count
    }
  
}
