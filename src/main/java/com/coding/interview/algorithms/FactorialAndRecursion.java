package com.coding.interview.algorithms;

public class FactorialAndRecursion {
    public static void main(String[] args) {
        System.out.println("Iteration factorial: " + iterationFactorial(6));
        System.out.println("Iteration factorial, second implementation: " + iterationFactorial2(6));
        System.out.println("Recursion factorial: " + recursionFactorial(6));
    }

    public static int iterationFactorial(int number) {

        if (number == 0) {
            return 1;
        }

        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static int iterationFactorial2(int number) {

        if (number == 0) {
            return 1;
        }

        int factorial = 1;

        while (number != 0) {
            factorial = factorial * number;
            number--;
        }

        return factorial;
    }

    public static int recursionFactorial(int number) {

        if (number == 0) {
            return 1;
        }

        return number * recursionFactorial(number - 1);
    }
}
