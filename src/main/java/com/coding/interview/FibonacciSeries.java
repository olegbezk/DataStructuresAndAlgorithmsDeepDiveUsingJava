package com.coding.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        //input to print Fibonacci series upto how many numbers
        System.out.println("Enter number upto which Fibonacci series to print: ");
        int number = new Scanner(System.in).nextInt();

        System.out.println("Fibonacci series upto " + number + " numbers : ");
        //printing Fibonacci series upto number
        Map<Integer, Long> memo = new HashMap<>();
        for (int i = 1; i <= number; i++) {
            System.out.print(fib(i, memo) + " ");
        }
    }

    /**
     * Classic solution for Fibonacci number using recursion.
     * This program uses tail recursion to calculate Fibonacci number
     * for a given number
     *
     * @return Fibonacci number
     */
    public static long fibonacci(int number) {
        if (number <= 2) {
            return 1;
        }

        return fibonacci(number - 1) + fibonacci(number - 2);
    }

    public static long fib(int number, Map<Integer, Long> memo) {

        if (memo.containsKey(number)) {
            return memo.get(number);
        }

        if (number <= 2) {
            return 1;
        }

        memo.put(number, fib((number - 1), memo) + fib((number - 2), memo));

        return memo.get(number);
    }

    /*
     * Java program to calculate Fibonacci number using loop or Iteration.
     * @return Fibonacci number
     */
    public static int fibonacci2(int number) {
        if (number <= 2) {
            return 1;
        }
        int fibo1 = 1, fibo2 = 1, fibonacci = 1;
        for (int i = 3; i <= number; i++) {

            //Fibonacci number is sum of previous two Fibonacci number
            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;

        }
        return fibonacci; //Fibonacci number

    }
}
