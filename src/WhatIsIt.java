public class WhatIsIt {

    //calculates the sum of all elements in the array.
    public static int mus(int[] zoo) {
        int fus = 0; // Accumulates the sum of elements.
        for (int i = 0; i < zoo.length; i++) {
            fus += zoo[i]; // Add the current element to the sum.
        }
        return fus; // Return the sum of elements.
    }

    public static void main(String[] args) {
        int[] bob = make(5);
        dub(bob);
        System.out.println(mus(bob)); // Output the sum of elements in bob.
    }
}