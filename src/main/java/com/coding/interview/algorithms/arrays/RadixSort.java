package com.coding.interview.algorithms.arrays;

public class RadixSort {

    public static void main(String[] args) {

        int[] radixArray = { 4725, 4586, 1330, 8792, 1594, 5729 };

        radixSort(radixArray, 10, 4);

        for (int j : radixArray) {
            System.out.println(j);
        }

        String[] radStringArray = { "bcdef", "dbaqc", "abcde", "omadd", "bbbbb" };

        radixSort(radStringArray, 26, 5);

        for (String j : radStringArray) {
            System.out.println(j);
        }
    }

    public static void radixSort(String[] input, int radix, int width) {

        for (int i = width - 1; i >= 0; i--) {
            radixSingleSort(input, i, radix);
        }
    }

    public static void radixSort(int[] input, int radix, int width) {

         for (int i = 0; i < width; i++) {
             radixSingleSort(input, i, radix);
         }
    }

    private static void radixSingleSort(String[] input, int position, int radix) {

        int numItems = input.length;

        int[] countArray = new int[radix];

        for (String value : input) {
            countArray[getIndex(position, value)]++;
        }

        // Adjust the count array
        for (int j = 1; j < radix; j++) {
            countArray[j] += countArray[j - 1];
        }

        String [] temp = new String[numItems];

        for (int tempIndex = numItems - 1; tempIndex  >= 0; tempIndex--) {
            temp[--countArray[getIndex(position, input[tempIndex])]] = input[tempIndex];
        }

        for (int tempIndex = 0; tempIndex < numItems; tempIndex ++) {
            input[tempIndex] = temp[tempIndex];
        }
    }

    private static int getIndex(int position, String value) {
        return value.charAt(position) - 'a';
    }

    private static void radixSingleSort(int[] input, int position, int radix) {

        int numItems = input.length;

        int[] countArray = new int[radix];

        for (int value : input) {
            countArray[getDigit(position, value, radix)]++;
        }

        // Adjust the count array
        for (int j = 1; j < radix; j++) {
            countArray[j] += countArray[j - 1];
        }

        int [] temp = new int[numItems];

        for (int tempIndex = numItems - 1; tempIndex  >= 0; tempIndex--) {
            temp[--countArray[getDigit(position, input[tempIndex], radix)]] = input[tempIndex];
        }

        for (int tempIndex = 0; tempIndex < numItems; tempIndex ++) {
            input[tempIndex] = temp[tempIndex];
        }
    }

    private static int getDigit(int position, int value, int radix) {
        return value / (int) Math.pow(10, position) % radix;
    }
}
