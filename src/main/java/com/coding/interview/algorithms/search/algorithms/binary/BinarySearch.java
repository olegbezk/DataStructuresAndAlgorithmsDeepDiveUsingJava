package com.coding.interview.algorithms.search.algorithms.binary;

public class BinarySearch {

    public static void main(String[] args) {

        int[] intArray = { -22, -15, 1, 7, 20, 35, 55 };

        System.out.println(iterativeBinarySearch(intArray, -15));
        System.out.println(iterativeBinarySearch(intArray, 35));
        System.out.println(iterativeBinarySearch(intArray, 8));
        System.out.println(iterativeBinarySearch(intArray, 1));

        System.out.println();

        System.out.println(recursiveBinarySearch(intArray, -15));
        System.out.println(recursiveBinarySearch(intArray, 35));
        System.out.println(recursiveBinarySearch(intArray, 8));
        System.out.println(recursiveBinarySearch(intArray, 1));
    }

    /**
     * Recursive search works ONLY with sorted array
     *
     * @param input array to search
     * @param value to find in searched array
     * @return index for value in the input array or -1 if nothing was found
     */
    public static int iterativeBinarySearch(int[] input, int value) {
        int start = 0;
        int end = input.length;

        while (start < end) {
            int midpoint = (start + end) / 2;
            System.out.println("Midpoint is: " + midpoint);
            if (input[midpoint] == value) {
                return midpoint;
            } else if (input[midpoint] < value) {
                start = midpoint + 1;
            } else {
                end = midpoint;
            }
        }
        return -1;
    }

    /**
     * Recursive binary search works ONLY with sorted array
     *
     * @param input array
     * @param value to search
     * @return index for value in the input array or -1 if nothing was found
     */
    public static int recursiveBinarySearch(int[] input, int value) {
        return recursiveBinarySearch(input, 0, input.length, value);
    }

    private static int recursiveBinarySearch(int[] input, int start, int end, int value) {
        if (start >= end) {
            return -1;
        }
        int midpoint = (start + end) / 2;
        System.out.println("Midpoint is: " + midpoint);

        if (input[midpoint] == value) {
            return midpoint;
        } else if (input[midpoint] < value) {
            return recursiveBinarySearch(input, midpoint + 1, end, value);
        } else {
            return recursiveBinarySearch(input, start, midpoint, value);
        }
    }
}
