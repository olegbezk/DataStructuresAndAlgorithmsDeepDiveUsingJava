package com.coding.interview;

import java.util.HashMap;
import java.util.Map;

public class CanSum {

    public static void main(String[] args) {
        int[] intArray = { 5, 3, 4, 7 };

        Map<Integer, Boolean> memo = new HashMap<>();
        System.out.println(canSum(7, intArray, memo));
    }

    public static boolean canSum(int number, int[] values, Map<Integer, Boolean> memo) {
        if (memo.containsKey(number)) {
            return memo.get(number);
        }

        if (number == 0) {
            return true;
        }

        if (number < 0) {
            return false;
        }

        for (int val : values) {
            int remainder = number - val;
            if (canSum(remainder, values, memo)) {
                memo.put(number, true);
                return true;
            }
        }

        memo.put(number, false);

        return false;
    }

    public static boolean canSum(int number, int[] values) {
        if (number == 0) {
            return true;
        }

        if (number < 0) {
            return false;
        }

        for (int val : values) {
            int remainder = number - val;
            if (canSum(remainder, values)) {
                return true;
            }
        }

        return false;
    }
}
