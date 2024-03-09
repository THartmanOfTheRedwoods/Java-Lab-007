public class FeelingFruity {
  
    public static int banana(int[] a) {
        int kiwi = 1; //Stores the product
        int i = 0; //loop variable
        while (i < a.length) {
            kiwi = kiwi * a[i];
            i++;
        }
        return kiwi; //Calculates the product of array "a" and its elements, and returns it
    }
      
    public static int grapefruit(int[] a, int grape) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == grape) {//variable "grape" stores the integer
                return i;
            }
        }
        return -1;//Returns first index of array "a" with equal value of "grape" variable, or it returns -1
    }
    
    public static int pineapple(int[] a, int apple) {
        int pear = 0;//counter variable calculating elements of array "a" equal to apple variable
        for (int pine: a) {
            if (pine == apple) {
                pear++;
            }
        }
        return pear;//Returns elements in array "a" with equal number to integer variable apple
    }
  
}
