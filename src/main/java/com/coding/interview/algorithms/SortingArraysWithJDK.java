package com.coding.interview.algorithms;

import java.util.Arrays;

public class SortingArraysWithJDK {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        // Use Java Doc to get description for used algorithms
        Arrays.parallelSort(intArray);

        for (int j : intArray) {
            System.out.print(j + " ");
        }
    }
}
