# Arrays and References - Java Lab 7

**Instructions:**
1. Fork this repository to your GitHub account.
2. Clone the forked repository locally to your machine.
3. Create a new branch named Feature01.

## Part 1: Recognizing Traversal Patterns

**Objective:**
The purpose of this section is to practice reading code and recognizing the traversal patterns.

1. The methods in [FeelingFruity.java](src/FeelingFruity.java) are hard to read, because instead of using meaningful names for the variables and methods, they use names of fruit.
    * For each method, write a one sentence COMMENT above or adjacent to the method that describes what the method does, without getting into the details of how it works.
    * For each variable, identify the role it plays.

2. What is the output of the program in [WhatIsIt.java](src/WhatIsIt.java)?
    * Describe in a COMMENT, above the declaration of **mus**, using a few words, what **mus** does.
    * Place a breakpoint just before **mus** returns and run the program in **debug** mode.
    * Take a screenshot of the **Stack Diagram** at this point.

## Part 2: Array Exploration

**Objective:**
The purpose of this section is to practice writing methods to use arrays.

1. Create a new Java class file named **ArrayExploration.java**
2. Write a method called **indexOfMax** that takes an array of integers and returns the index of the largest element.
     * Can you write this method by using an enhanced for loop?
     * Why or why not?
* It is not possible to use an enhanced for loop because it doesnt provide access to the index of elements, the enhanced for loop i used when you need to iterate over the elements of an array. But since we need to return the index of the max element we need to use a traditional loop.

3. The [Sieve of Eratosthenes](https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes) is "a simple, ancient algorithm for finding all prime numbers up to any given limit."
    * In the same class, write a method called **sieve** that takes an integer parameter, **n**, and returns a **boolean array** that indicates, for each number from 0 to n - 1, whether the number is prime.

4. Next write a method named **areFactors** that takes an integer **n** and an **array of integers**, and **returns true** if the numbers in the array are all factors of **n**
     * HINT: this means that **n** would be divisible by all of them.

5. Write a method named **arePrimeFactors** that takes an integer **n** and an **array of integers**, and that **returns true** if the numbers in the array are all **prime** and their **product is n**.

6. Write a method called **letterHist** that takes a string as a parameter and returns a **histogram** of the letters in the string.
     * The zeroth element of the histogram should contain the number of **a’s** in the string (case-insensitive i.e. upper and lower)
     * The 25th element should contain the number of **z’s**.
     * Your solution should traverse the string only **once**.
   
## Submission
Follow these steps for submission:
1. Create a Feature01 branch of your code if you haven't already.
2. Commit your working code for the exercises to your local copy/Feature01 branch.
3. Push it to your Remote/origin branch (i.e., GitHub: Feature01 -> origin/Feature01).
4. Issue a Pull request to my instructor repo.
5. **Make sure to COPY the Pull request URL and submit it for the lab/assignment in Canvas.**