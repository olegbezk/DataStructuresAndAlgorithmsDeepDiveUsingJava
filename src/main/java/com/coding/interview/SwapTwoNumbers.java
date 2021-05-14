package com.coding.interview;

import java.util.Scanner;

public class SwapTwoNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        swap1(in);
        swap2(in);
    }

    /**
     * Using 3-rd variable
     *
     * @param in system in
     */
    public static void swap1(Scanner in) {
        System.out.println("Enter x and y");
        int x, y, temp;

        x = in.nextInt();
        y = in.nextInt();

        System.out.println("Before the swapping x = " + x + " y = " + y);

        temp = x;
        x = y;
        y = temp;

        System.out.println("After the swapping x = " + x + " y = " + y);
    }

    /**
     * Using only 2 variables
     *
     * @param in system in
     */
    public static void swap2(Scanner in) {
        System.out.println("Enter x and y");
        int x, y;

        x = in.nextInt();
        y = in.nextInt();

        System.out.println("Before the swapping x = " + x + " y = " + y);

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After the swapping x = " + x + " y = " + y);
    }
}
