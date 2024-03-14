public class FeelingFruity {
  //Multiply each element in an array by the product of the previous two elements
    public static int banana(int[] a) {
        int kiwi = 1; //Begin sequence
        int i = 0; //Index
        while (i < a.length) {
            kiwi = kiwi * a[i];
            i++;
        }
        return kiwi;
    }
      
   //Return indexes of elements in an array that match a provided variable
    public static int grapefruit(int[] a, int grape) { //a is an array
        for (int i = 0; i < a.length; i++) { //loop through each index
            if (a[i] == grape) { //check elements against 'grape' for match
                return i;
            }
        }
        return -1;
    }

    //Count how many times 'apple' appears in an array
    public static int pineapple(int[] a, int apple) { // 'a' is an array. 'apple' is the value to find inside array
        int pear = 0; // counter
        for (int pine: a) { //pine == elements in array
            if (pine == apple) {
                pear++;
            }
        }
        return pear;
    }
  
}
