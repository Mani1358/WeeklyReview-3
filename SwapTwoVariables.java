package com.blz.weeklyreview3;

public class SwapTwoVariables {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After Swapping:" + "x= " + x + ",y = " + y);

    }
}
