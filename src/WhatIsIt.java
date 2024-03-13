public class WhatIsIt {
    // The method creates an array of size 'n' with values from 1 to 'n'
    public static int[] make(int n) {
        // 'a' is the array to be filled and returned
        int[] a = new int[n];
        // 'i' is the counter, controlling the loops progression through the array
        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
        }
        return a;
    }
    // The method doubles all elements in the array 'jub'
    public static void dub(int[] jub) {
        // 'i' is the counter, controlling the loop's progression through the array
        for (int i = 0; i < jub.length; i++) {
            jub[i] *= 2;
        }
    }
    // The method calculates the sum of all elements in the array 'zoo' and returns it
    public static int mus(int[] zoo) {
        // 'fus; is the accumulator, storing the sum of all elements
        int fus = 0;
        // 'i' is the counter, controlling the loops progression through in the array
        for (int i = 0; i < zoo.length; i++) {
            fus += zoo[i];
        }
        return fus;

    }
    // The main method creates an arrazy of size 5, doubles each element, and then prints the sum
    public static void main(String[] args) {
        //'bob' is the array created by the 'make' method
        int[] bob = make(5);
        dub(bob);
        System.out.println(mus(bob));
    }
}