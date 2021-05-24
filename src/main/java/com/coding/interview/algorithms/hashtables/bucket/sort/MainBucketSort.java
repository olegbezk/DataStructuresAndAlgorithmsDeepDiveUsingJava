package com.coding.interview.algorithms.hashtables.bucket.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainBucketSort {

    public static void main(String[] args) {

        int[] intArray = { 54, 46, 83, 66, 95, 92, 43 };

        bucketSort(intArray);

        for (int i : intArray) {
            System.out.println(i);
        }
    }

    public static void bucketSort(int[] input) {
        List<Integer>[] buckets = new List[10];

        for (int i = 0; i < buckets.length; i++) {
            // using LinkedList for the buckets
            // buckets[i] = new LinkedList<>();

            // using ArrayList for the buckets
            buckets[i] = new ArrayList<>();
        }

        for (int k : input) {
            buckets[hash(k)].add(k);
        }

        for (List<Integer> bucket : buckets) {
            Collections.sort(bucket);
        }

        int j = 0;
        for (List<Integer> bucket : buckets) {
            for (int value : bucket) {
                input[j++] = value;
            }
        }
    }

    private static int hash(int value) {
        return value / 10;
    }
}
