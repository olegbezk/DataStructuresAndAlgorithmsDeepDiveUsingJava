package com.coding.interview.algorithms.stacks.code.challenge;

import java.util.LinkedList;

public class LinkedListCodeChallenge {

    public static void main(String[] args) {
        // should return true
        System.out.println("should return true: " + checkForPalindrome("abccba"));
        // should return true
        System.out.println("should return true: " + checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println("should return true: " + checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println("should return false: " + checkForPalindrome("hello"));
        // should return true
        System.out.println("should return true: " + checkForPalindrome("Don't nod"));
    }

    public static boolean checkForPalindrome(String string) {

        String preparedString = string.replaceAll("[^a-zA-Z0-9]", "");

//        String reversedString = "";
//
//        for (int i = preparedString.length() - 1; i >= 0; i--) {
//            reversedString = reversedString + preparedString.charAt(i);
//        }

        String[] split = preparedString.split("");

        LinkedList<String> stringStack = new LinkedList<>();

        for (String s : split) {
            stringStack.push(s);
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (String s : stringStack) {
            stringBuilder.append(s);
        }

        String reversedString = stringBuilder.toString();

        return reversedString.equalsIgnoreCase(preparedString);
    }
}
