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
    public static int mus(int[] zoo) {//this is a method mus that take an array of integers zoo and return datatype int
        int fus = 0; //declares a variable named fus of type int and initializes it with the value 0
        for (int i = 0; i < zoo.length; i++) {////this is a loop that start at 0, while i is less than the number of the a array then it will increment/increase it by one.
            fus += zoo[i]; //used to increment the value of the variable and zoo[i] refers to the value of the element at index i in the array zoo.
        }
        return fus;////return value of variable
    }
    public static void main(String[] args) {
        int[] bob = make(5);
        dub(bob);
        System.out.println(mus(bob));
    }
}