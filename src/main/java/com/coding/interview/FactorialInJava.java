package com.coding.interview;

public class FactorialInJava {

    public static void main(String[] args) {
        System.out.println("Factorial by recursion: " + factorialRec(5));
        System.out.println("Factorial by iteration: " + factorialIter(6));
    }

    public static int factorialRec(int number) {
        if (number == 0) {
            return 1;
        }
        return number * factorialRec(number - 1);
    }

    public static int factorialIter(int number) {
        int result = 1;
        while (number != 0) {
            result = result * number;
            number --;
        }
        return result;
    }
}
