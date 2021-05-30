package com.coding.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        //input to print Fibonacci series upto how many numbers
        System.out.println("Enter number up to which Fibonacci series to print: ");
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

    /**
     * Map implementation with O(n) time complexity and O(n) stack size in memory
     *
     * @param number number
     * @param memo   memorize container
     * @return fib number
     */
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


    /**
     * Using array instead of Map to memorize calculations
     */
    private Integer[] cache = new Integer[31];

    public int fib(int number) {
        if (number <= 1) {
            return number;
        }
        cache[0] = 0;
        cache[1] = 1;
        return memorize(number);
    }

    public int memorize(int number) {
        if (cache[number] != null) {
            return cache[number];
        }
        cache[number] = memorize(number - 1) + memorize(number - 2);
        return memorize(number);
    }

    /**
     * Java program to calculate Fibonacci number using loop or Iteration.
     * Time complexity is O(n) and space complexity is O(1) - variables fibo1, fibo2 & fibonacci will be reused
     *
     * @return Fibonacci number
     */
    public static int fibonacci2(int number) {
        if (number <= 2) {
            return 1;
        }
        int fibo1 = 1, fibo2 = 1, fibonacci = 1;
        for (int i = 3; i <= number; i++) {

            //Fibonacci number is sum of previous two Fibonacci numbers
            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;

        }
        return fibonacci;

    }

    /**
     * Use the golden ratio formula to calculate the Nth Fibonacci number
     * Time and space complexity is O(1) both
     *
     * @param number num
     * @return fib num
     */
    public int goldenFib(int number) {
        double goldenRatio = (1 + Math.sqrt(5)) / 2;
        return (int) Math.round(Math.pow(goldenRatio, number) / Math.sqrt(5));
    }
}
