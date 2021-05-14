package com.coding.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FindUniqueValuesInTwoArrays {
    public static void main(String[] args) {

        int[] firstArray = {1, 2, 4, 5, 8};
        int[] secondArray = {3, 2, 5, 7, 8};

        ArrayList<Integer> unMatch = new ArrayList<>();

        for (int i = 0; i < firstArray.length; i++) {
            boolean contains = false;

            for (int k = 0; k < secondArray.length; k++) {
                if (firstArray[i] == secondArray[k]) {
                    contains = true;
                    break;
                }
            }
            if (!contains) {
                unMatch.add(firstArray[i]);
            }

        }
        for (int i = 0; i < secondArray.length; i++) {
            boolean contains = false;
            for (int k = 0; k < firstArray.length; k++) {
                if (secondArray[i] == firstArray[k]) {
                    contains = true;
                    break;
                }
            }
            if (!contains) {
                unMatch.add(secondArray[i]);
            }
        }

        System.out.println(unMatch);

        for (Map.Entry<Integer, Integer> entry : fillMap(firstArray, secondArray)) {
            if (entry.getValue() == 1) {
                System.out.println("This value is unique: " + entry.getKey());
            }
        }

        findDuplicates(firstArray, secondArray);
        findDuplicates(secondArray, firstArray);
    }

    public static Set<Map.Entry<Integer, Integer>> fillMap(int[] firstArray, int[] secondArray) {

        HashMap<Integer, Integer> entries = new HashMap<>();

        for (Integer i : firstArray) {
            entries.put(i, entries.get(i) == null ? 1 : entries.get(i) + 1);
        }

        for (Integer i : secondArray) {
            entries.put(i, entries.get(i) == null ? 1 : entries.get(i) + 1);
        }

        return entries.entrySet();
    }

    public static void findDuplicates(int[] firstArray, int[] secondArray) {
        boolean contains = false;
        List<Integer> list = new ArrayList<>();
        for (int k : firstArray) {
            for (int i : secondArray) {
                if (k == i) {
                    contains = true;
                    break;
                }
            }

            if (!contains) {
                list.add(k);
            } else {
                contains = false;
            }
        }
        System.out.println(list);
    }
}
