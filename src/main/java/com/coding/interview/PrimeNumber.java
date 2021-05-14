package com.coding.interview;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int number = Integer.MAX_VALUE;
        System.out.println("Enter number to check if prime or not ");
        while (number != 0) {
            number = scnr.nextInt();
            System.out.printf("Does %d is prime? \n", number);
            isPrimeNumberOrNot(number);
        }
    }

    public static void isPrimeNumberOrNot(int num) {

        boolean isPrime = true;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(num + " - number is prime");
        } else {
            System.out.println(num + " - number is not a prime");
        }
    }
}
