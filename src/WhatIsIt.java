public class WhatIsIt {
    // Method to create an array of integers from 1 to n
    public static int[] make(int n) {
        // Puts the size of n
        int[] a = new int[n];
        // Places an element with integers starting from 1
        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
        }
        return a;
    }

    // Method to double each element in the input array
    public static void dub(int[] jub) {
        for (int i = 0; i < jub.length; i++) {
            // Doubles the elements
            jub[i] *= 2;
        }
    }

    // Method to find the sum of all elements in the input array
    public static int mus(int[] zoo) {
        // Mus: Finds the sum of the elements
        // Has a variable hold the sum
        int fus = 0;
        // Add each element to the sum
        for (int i = 0; i < zoo.length; i++) {
            fus += zoo[i];
        }
        return fus;
    }

    // Main method where the program execution starts
    public static void main(String[] args) {
        // Integers from 1 to 5
        int[] bob = make(5);
        // Doubles each element
        dub(bob);
        System.out.println(mus(bob));
    }
}
