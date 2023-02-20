package com.blz.weeklyreview3;

public class CountSmallerElements {
    static int countSmallerElements(int[] a, int numb) {
        int l = 0, h = a.length - 1, mid = 0;
        while (l < h) {
            mid = (l + h) / 2;
            if (numb == a[mid]) {
                break;

            } else if (numb < a[mid]) {
                h = mid - 1;

            } else {
                l = mid + 1;
            }
        }
        return mid + 1;
    }

    public static void main(String[] args) {
        int arr[] = {2, 6, 4, 5, 12, 18, 30, 26};
        int num = 25;
        System.out.println(countSmallerElements(arr, num));
    }
}
