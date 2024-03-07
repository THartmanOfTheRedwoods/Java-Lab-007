public class FeelingFruity {
  
    public static int banana(int[] a) { //this is a method banana that take an array of integers and return datatype int
        int kiwi = 1; //declares a variable named kiwi of type int and initializes it with the value 1
        int i = 0; //declares a variable named i of type int and initializes it with the value 0
        while (i < a.length) { //The loop condition i < a.length ensures that the loop continues as long as the index i is less than the length of the array a
            kiwi = kiwi * a[i];//is used to update the value of the variable
            i++;//used to increment the value of the variable
        }
        return kiwi; //return a value
    }
      
    public static int grapefruit(int[] a, int grape) { //this is a method grapefruit that take an array of integers a, integer grape and return datatype int
        for (int i = 0; i < a.length; i++) {//this is a loop that start at 0, while i is less than the number of the a array then it will increment/increase it by one.
            if (a[i] == grape) { // compares the value of the element
                return i; // return the value
            }
        }
        return -1;//Returns a primitive value
    }
    
    public static int pineapple(int[] a, int apple) {//this is a method pineapple that take an array of integers a, integer apple and return datatype int
        int pear = 0; //declares a variable named pear of type int and initializes it with the value 0
        for (int pine: a) {//This is an enhanced for loop
            if (pine == apple) { //compares the value of the variable
                pear++;//used to increment the value of the variable
            }
        }
        return pear; //return value of variable
    }
  
}
