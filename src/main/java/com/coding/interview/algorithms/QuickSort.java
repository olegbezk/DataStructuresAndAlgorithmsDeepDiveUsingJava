package com.coding.interview.algorithms;

public class QuickSort {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        quickSort(intArray, 0, intArray.length);

        for (int j : intArray) {
            System.out.print(j + " ");
        }
    }

    public static void quickSort(int[] input, int start, int end) {
        // one element array
        if (end - start < 2) {
            return;
        }

        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex + 1, end);
    }

    private static int partition(int[] input, int start, int end) {
        // this is using first element as the pivot
        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j) {
            //NOTE: empty loop body
            while (i < j && input[--j] >= pivot);

            if (i < j) {
                input[i] = input[j];
            }
            //NOTE: empty loop body
            while (i < j && input[++i] <= pivot);

            if (i < j) {
                input[j] = input[i];
            }
        }
        input[j] = pivot;

        return j;
    }
}
