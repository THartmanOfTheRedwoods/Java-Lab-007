public class FeelingFruity {
    //banana takes an array of integers and returns the integer kiwi
    public static int banana(int[] a) {
        int kiwi = 1; //initializes the integer kiwi to a value of 1
        int i = 0;
        while (i < a.length) {
            kiwi = kiwi * a[i];
            i++;
        }
        return kiwi;
    }
      // grapefruit takes the array of integers a and the single integer grape and returns negative 1
    public static int grapefruit(int[] a, int grape) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == grape) {
                return i;
            }
        }
        return -1;
    }
    //pineapple takes the array of integers a and the single integer apple and returns the integer pear
    public static int pineapple(int[] a, int apple) {
        int pear = 0; // initializes the variable pear to a value of 0
        for (int pine: a) {
            if (pine == apple) {
                pear++; // increments the value of pear by one
            }
        }
        return pear;
    }
  
}
