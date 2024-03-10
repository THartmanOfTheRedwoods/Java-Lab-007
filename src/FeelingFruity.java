public class FeelingFruity {
  

    //This method takes an integer array a as input and returns the product of all elements in the array.
    public static int banana(int[] a) {
        int kiwi = 1; //initializes kiwi to 1.
        int i = 0;
        while (i < a.length) { //iterates through array. while loop, multiplying each element with kiwi.
            kiwi = kiwi * a[i];
            i++;
        }
        return kiwi; //returns value of kiwi, represents the product of all elements in the array.
    }
      
    // This method takes an integer array a and an integer grape as input and returns the index of the first occurrence of grape in the array.
    public static int grapefruit(int[] a, int grape) {
        for (int i = 0; i < a.length; i++) { //iterates through array `a` using for loop { and checks if each element is equal to grape}.
            if (a[i] == grape) {
                return i; //If a match is found, it returns the index of the matching element.
            }
        }
        return -1; //If no match is found, it returns -1 to indicate that grape is not present in the array.
    }
    
    //This method takes an integer array `a` and an integer apple as input and returns the count of occurrences of `apple` in the array.
    public static int pineapple(int[] a, int apple) {
        int pear = 0; //initializes variable pear to 0.
        for (int pine: a) { //iterates through the array a using an enhanced for loop and increments pear
            if (pine == apple) { //whenever an element in the array is equal to apple
                pear++;
            }
        }
        return pear; //returns the value of pear, which represents the count of occurrences of apple in the array.
    }
  
}
