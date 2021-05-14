package com.coding.interview;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println("Input word to check for palindrome: ");
        Scanner scanner = new Scanner(System.in);
        String word = "";

        while (!word.equalsIgnoreCase("stop")) {
            word = scanner.next();

            checkForPalindrome(word);
        }
    }

    public static void checkForPalindrome(String word) {
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }
        System.out.println("Reversed word is: " + reverse);

        if (reverse.equals(word)) {
            System.out.println("Reversed string is a palindrome");
        } else {
            System.out.println("Reversed string is not a palindrome");
        }
    }
}
