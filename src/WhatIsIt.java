public class WhatIsIt {
    public static int[] make(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
        }
        return a;
    }
    public static void dub(int[] jub) {
        for (int i = 0; i < jub.length; i++) {
            jub[i] *= 2;
        }
    }
    // Sum if all elements
    public static int mus(int[] zoo) {
        int fus = 0; //Represents accumulated sum
        for (int i = 0; i < zoo.length; i++) {
            fus += zoo[i]; //Adds current element to sum
        }
        return fus; //Returns sum
    }
    public static void main(String[] args) {
        int[] bob = make(5);
        dub(bob);
        System.out.println(mus(bob));
    }
}