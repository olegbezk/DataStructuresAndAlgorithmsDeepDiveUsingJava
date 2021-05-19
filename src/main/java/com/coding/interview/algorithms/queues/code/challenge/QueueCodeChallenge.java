package com.coding.interview.algorithms.queues.code.challenge;

import java.util.LinkedList;

public class QueueCodeChallenge {

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

    public static boolean checkForPalindrome(String word) {

        String preparedString = word.replaceAll("[^a-zA-Z0-9]", "");

        String[] split = preparedString.split("");

        LinkedList<String> stackedQueue = new LinkedList<>();

        for (String s : split) {
            stackedQueue.push(s); // add to the stack
        }

        StringBuilder stringBuilder = new StringBuilder();

        while (stackedQueue.size() != 0) {
            stringBuilder.append(stackedQueue.pollFirst()); // retrieve and remove a first element from the queue
        }

        return stringBuilder.toString().equalsIgnoreCase(preparedString);
    }
}
