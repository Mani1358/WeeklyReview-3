package com.blz.weeklyreview3;

public class NthEvenFibonacciNumber {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(evenFib(n));
    }

    static long evenFib(int n) {
        if (n < 1)
            return n;
        if (n == 1)
            return 2;
        return ((4 * evenFib(n - 1)) + evenFib(n - 2));
    }
}
