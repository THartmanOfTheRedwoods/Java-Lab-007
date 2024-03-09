public class FeelingFruity {
  
    public static int banana(int[] a) { //multiplies the numbers in the array together
        int kiwi = 1; //used to hold the total
        int i = 0; //used as a loop counter
        while (i < a.length) {
            kiwi = kiwi * a[i];
            i++;
        }
        return kiwi;
    }
      
    public static int grapefruit(int[] a, int grape) { //searches the array for a value and returns it.
        for (int i = 0; i < a.length; i++) { //sets i as a loop counter
            if (a[i] == grape) { //grape is the value searched for
                return i;
            }
        }
        return -1;
    }
    
    public static int pineapple(int[] a, int apple) { //counts the number of times a value occurs in an array
        int pear = 0; // to hold the number of times the value occurs
        for (int pine: a) {
            if (pine == apple) {
                pear++;
            }
        }
        return pear;
    }
  
}
