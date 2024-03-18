public class FeelingFruity {

    public static int banana(int[] a) {     // returns the product of all the elements in the array

        int kiwi = 1;
        int i = 0;
        while (i < a.length) {
            kiwi = kiwi * a[i];
            //stores the products of the elements
            i++;
        }
        return kiwi;
    }
      
    public static int grapefruit(int[] a, int grape) {// finds if the given key is in the array, and returns the index if found. otherwise returns -1
        for (int i = 0; i < a.length; i++) {
            if (a[i] == grape) {
                //grape is the variable needed to be found in the array
                return i;
            }
        }
        return -1;
    }
    
    public static int pineapple(int[] a, int apple) {// returns how many times the given key was found in the array
        int pear = 0;
        //pear is the counter for the amount of times that variable is found in array
        for (int pine: a) {
            //pine extracts and stores each element throughout each iteration
            if (pine == apple) {
                //apple is the variable needed to be found in the array

                pear++;
            }
        }
        return pear;
    }
  
}
