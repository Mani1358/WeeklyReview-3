package com.blz.weeklyreview3;

public class CountSmallerElements {
    static int countSmallerElements(int[] arr, int n, int num) {
        int i = 0;
        for (i = 0; i < n; i++) {
            if (arr[i] > num)
                break;
        }
        return i;
    }

    public static void main(String[] args) {
        int arr[] = {2, 6, 4, 5, 12, 18, 26, 30};
        int num = 25;
        int n = arr.length;
        System.out.println(countSmallerElements(arr, n, num));
    }
}
