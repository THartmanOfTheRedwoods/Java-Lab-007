public class FeelingFruity {

    // this method multiplies numbers in an array with a loop counter.
    public static int banana(int[] a) { //a = user defined array. i = loop counter
        int kiwi = 1;
        int i = 0;
        while (i < a.length) {
            kiwi = kiwi * a[i];
            i++;
        }
        return kiwi;
    }

    //this method uses a similar loop counter foundation but instead is used only to find the
    //value of grape. it gives you the value of the loop counter if grape is found. if not,
    //you get -1 causes the loop to stop and give up on finding grape.
    public static int grapefruit(int[] a, int grape) { //a = array. grape = user defined variable. i = loop counter
        for (int i = 0; i < a.length; i++) {
            if (a[i] == grape) {
                return i;
            }
        }
        return -1;
    }

    // this final method is also to be called with an array. The function of the method
    // is to find numbers that equal the value of apple. You plug in all the numbers,
    // and the method searches for apple. it outputs how many times 'apple' was found.
    public static int pineapple(int[] a, int apple) { //a = array. apple = user defined variablr. pear = loop counter
        int pear = 0;
        for (int pine: a) {
            if (pine == apple) {
                pear++;
            }
        }
        return pear;
    }
  
}
