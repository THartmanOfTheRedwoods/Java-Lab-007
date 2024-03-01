# Loops and Strings - Java Lab 6

**Instructions:**
1. Fork this repository to your GitHub account.
2. Clone the forked repository locally to your machine.
3. Create a new branch named Feature01.

## Part 1: Loop Execution Analysis

**Objective:**
The purpose of this exercise is to practice reading code and recognizing the traversal patterns. The methods in [FeelingFruity.java](src/FellingFruity.java) are hard to read, because instead of using meaningful names for the variables and methods, they use names of fruit.

For each method, write a one sentence COMMENT above or adjacent to the method that describes what the method does, without getting into the details of how it works. And for each variable, identify the role it plays.

## Submission
Follow these steps for submission:
1. Create a Feature01 branch of your code if you haven't already.
2. Commit your working code for the exercises to your local copy/Feature01 branch.
3. Push it to your Remote/origin branch (i.e., GitHub: Feature01 -> origin/Feature01).
4. Issue a Pull request to my instructor repo.
5. **Make sure to COPY the Pull request URL and submit it for the lab/assignment in Canvas.**

-----------



Exercise 7.2 What is the output of the following program? Describe in a
few words what mus does. Draw a stack diagram just before mus returns.
124 Chapter 7 Arrays and References
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
public static int mus(int[] zoo) {
int fus = 0;
for (int i = 0; i < zoo.length; i++) {
fus += zoo[i];
}
return fus;
}
public static void main(String[] args) {
int[] bob = make(5);
dub(bob);
System.out.println(mus(bob));
}
Exercise 7.3 Write a method called indexOfMax that takes an array of
integers and returns the index of the largest element. Can you write this
method by using an enhanced for loop? Why or why not?
Exercise 7.4 The Sieve of Eratosthenes is “a simple, ancient algorithm for
finding all prime numbers up to any given limit” (https://en.wikipedia.
org/wiki/Sieve_of_Eratosthenes).
Write a method called sieve that takes an integer parameter, n, and returns
a boolean array that indicates, for each number from 0 to n - 1, whether the
number is prime.
7.11 Exercises 125
Exercise 7.5 Write a method named areFactors that takes an integer n
and an array of integers, and returns true if the numbers in the array are all
factors of n (which is to say that n is divisible by all of them).
Exercise 7.6 Write a method named arePrimeFactors that takes an integer
n and an array of integers, and that returns true if the numbers in the array
are all prime and their product is n.
Exercise 7.7 Write a method called letterHist that takes a string as a
parameter and returns a histogram of the letters in the string. The zeroth
element of the histogram should contain the number of a’s in the string (upper-
and lowercase); the 25th element should contain the number of z’s. Your
solution should traverse the string only once.
Exercise 7.8 Two words are anagrams if they contain the same letters and
the same number of each letter. For example, “stop” is an anagram of “pots”,
“allen downey” is an anagram of “well annoyed”, and “christopher mayfield”
is an anagram of “hi prof the camel is dry”. Write a method that takes two
strings and checks whether they are anagrams of each other.
