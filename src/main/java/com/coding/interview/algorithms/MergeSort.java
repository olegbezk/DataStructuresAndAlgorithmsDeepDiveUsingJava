package com.coding.interview.algorithms;

public class MergeSort {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        mergeSort(intArray, 0, intArray.length);

        System.out.println("Ascending merge sort");

        for (int j : intArray) {
            System.out.print(j + " ");
        }

        System.out.println("\n" + "Descending merge sort");

        descendingMergeSort(intArray, 0, intArray.length);

        for (int j : intArray) {
            System.out.print(j + " ");
        }
    }

    public static void descendingMergeSort(int[] intArray, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;

        descendingMergeSort(intArray, start, mid);
        descendingMergeSort(intArray, mid, end);
        descendingMerge(intArray, start, mid, end);
    }

    public static void mergeSort(int[] intArray, int start, int end) {

        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;

        mergeSort(intArray, start, mid);
        mergeSort(intArray, mid, end);
        merge(intArray, start, mid, end);
    }

    private static void descendingMerge(int[] input, int start, int mid, int end) {

        if (input[mid - 1] >= input[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] >= input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);
    }

    private static void merge(int[] input, int start, int mid, int end) {

        if (input[mid - 1] <= input[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];

        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);
    }
}
