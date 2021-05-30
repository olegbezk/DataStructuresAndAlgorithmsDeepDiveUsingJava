package com.coding.interview;

import java.util.HashMap;
import java.util.Map;

public class GridTraveler {

    public static void main(String[] args) {

        Map<String, Long> memo = new HashMap<>();

        System.out.println(gridTraveler(18, 18, memo));
    }

    public static long gridTraveler(int x, int y) {

        if (x == 1 && y == 1) {
            return 1;
        }

        if (x == 0 || y == 0) {
            return 0;
        }

        return gridTraveler(x - 1, y) + gridTraveler(x, y - 1);
    }

    public static long gridTraveler(int x, int y, Map<String, Long> memo) {

        String key = x + "," + y;

        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        if (x == 1 && y == 1) {
            return 1;
        }

        if (x == 0 || y == 0) {
            return 0;
        }

        memo.put(key, gridTraveler(x - 1, y, memo) + gridTraveler(x, y - 1, memo));

        return memo.get(key);
    }
}
