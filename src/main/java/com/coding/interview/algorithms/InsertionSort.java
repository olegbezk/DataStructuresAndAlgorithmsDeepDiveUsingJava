package com.coding.interview.algorithms;

public class InsertionSort {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        System.out.println("Iteration insertion sort");

        insertionSort(intArray);

        for (int j : intArray) {
            System.out.print(j + " ");
        }

        System.out.println("\n" + "Recursion insertion sort");

        int[] intArray2 = {20, 35, -15, 7, 55, 1, -22};

        recursiveInsertionSort(intArray2, intArray2.length);

        for (int j : intArray2) {
            System.out.print(j + " ");
        }
    }

    public static void recursiveInsertionSort(int[] input, int numberOfItems) {

        if (numberOfItems < 2) {
            return;
        }

        recursiveInsertionSort(input, numberOfItems -1);

        int newElement = input[numberOfItems - 1];

        int i;

        for (i = numberOfItems - 1; i > 0 && input[i - 1] > newElement; i--) {
            input[i] = input[i - 1];
        }

        input[i] = newElement;
    }

    public static void insertionSort(int[] input) {

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < input.length; firstUnsortedIndex++) {

            int newElement = input[firstUnsortedIndex];

            int i;

            for (i = firstUnsortedIndex; i > 0 && input[i - 1] > newElement; i--) {
                input[i] = input[i - 1];
            }

            input[i] = newElement;
        }
    }
}
