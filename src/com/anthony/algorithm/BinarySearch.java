package com.anthony.algorithm;

import java.util.Arrays;

/**
 * 二分查找(数组须为有序数组)
 * Created by Anthony on 2018/10/23
 */
public class BinarySearch {
    public static int binarySearch(int[] a, int target) {

        Arrays.sort(a);
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int mid = (high + low) / 2;
            if (a[mid] > target) {
                high = mid - 1;
            } else if (a[mid] < target) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] as = {0, 5, 6, 1, 8, 2};
        int i = binarySearch(as, 2);
        System.out.println(i);
    }
}
