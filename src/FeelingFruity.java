public class FeelingFruity {
  
    //The method multiplies all of the elements that fall under the 'a' category and return the result
    public static int banana(int[] a) {
        // 'kiwi' is storing the product of all elements in the array
        int kiwi = 1;
        // 'i' is the counter, it controls the loops profession through the array
        int i = 0;
        while (i < a.length) {
            kiwi = kiwi * a[i];
            i++;
        }
        return kiwi;
    }
      
    // The method returns the index of the first occurrence of 'grape' in the array 'a', or returns -1 if 'grape' is not in the array
    public static int grapefruit(int[] a, int grape) {
        // 'i' is the counter, controlling the loops progression as it goes through the array
        for (int i = 0; i < a.length; i++) {
            if (a[i] == grape) {
                return i;
            }
        }
        return -1;
    }

    // The method counts the times 'apple' appears in the array 'a' and returns the count
    public static int pineapple(int[] a, int apple) {
        // 'pear' is the accumulator, it stores the count of apple
        int pear = 0;
        // 'pine' is the current element in the array as we go through it
        for (int pine: a) {
            if (pine == apple) {
                pear++;
            }
        }
        return pear;
    }
  
}
