/**
 * @author Trevor Hartman
 * @author Alexei Iachkov
 * @date 3-9-24
 * @version 1.0
 */
public class FeelingFruity {

    //Multiplies all the values in the array together and returns the result
    public static int banana(int[] a) {
        int kiwi = 1; //Keeps track of the product of all the numbers in the array
        int i = 0; //Helps to iterate through the array
        while (i < a.length) {
            kiwi = kiwi * a[i];
            i++;
        }
        return kiwi;
    }
      
    //Finds the position of the first occurrence of the given value in the array
    public static int grapefruit(int[] a, int grape) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == grape) {
                return i; //First occurrence
            }
        }
        return -1; //Value not found
    }
    
    //Counts how many times a given value appears in the array
    public static int pineapple(int[] a, int apple) {
        int pear = 0; //Keeps track of the number of times the value appears
        for (int pine: a) {
            if (pine == apple) {
                pear++;
            }
        }
        return pear;
    }
  
}
