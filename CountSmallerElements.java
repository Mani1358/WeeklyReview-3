package com.blz.weeklyreview3;

public class CountSmallerElements {
    static int countSmallerElements(int[] arr, int n, int numb) {
        int i = 0;
        for (i = 0; i < n; i++) {
            if (arr[i] > numb)
                break;
        }
        return i;
    }

    public static void main(String[] args) {
        int arr[] = {2, 6, 4, 5, 12, 18, 30, 26};
        int num = 25;
        int n = arr.length;
        System.out.println(countSmallerElements(arr, n, num));
    }
}
