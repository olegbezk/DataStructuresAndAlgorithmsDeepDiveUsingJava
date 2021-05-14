package com.coding.interview;

import java.util.Scanner;

public class ReverseWithoutUsingStringMethods {

    public static void main(String[] args) {
        System.out.println("Input word to reverse: ");
        Scanner scanner = new Scanner(System.in);
        String word = "";

        while (!word.equalsIgnoreCase("stop")) {
            word = scanner.next();
            reverseString1(word);
            reverseString2(word);
            reverseString3(word);
        }
    }

    /**
     * Used string builder to reverse
     *
     * @param word input
     */
    public static void reverseString1(String word) {
        StringBuilder str2 = new StringBuilder();
        str2.append(word);
        str2.reverse();
        System.out.println("Used string builder to reverse");
        System.out.println("Reversed word is: " + str2);
    }

    /**
     * Converted to character array and printed in reverse order
     *
     * @param word input
     */
    public static void reverseString2(String word) {
        char[] chars = word.toCharArray();  // converted to character array and printed in reverse order
        System.out.println("Converted to character array");
        System.out.print("Reversed word is: ");
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }
        System.out.println();
    }

    /**
     * Used split method to print in reverse order
     *
     * @param word input
     */
    public static void reverseString3(String word) {
        String[] token = word.split("");
        System.out.println("Used split method");
        System.out.print("Reversed word is: ");
        for (int i = token.length - 1; i >= 0; i--) {
            System.out.print(token[i] + "");
        }
        System.out.println();
    }
}
