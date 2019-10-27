package com.anthony.algorithm;

import java.util.Arrays;

/**
 * 归并排序
 * 时间复杂度O(nlogn)
 * Created by Anthony on 2018/10/22
 */
public class MergeSort {
    public static int[] sort(int a[], int low, int high) {
        int mid = (low + high) / 2;
        if (low < high) {
            sort(a, low, mid);
            sort(a, mid + 1, high);
            merge(a, low, mid, high);
        }
        return a;
    }
    private static void merge(int[] array, int start, int mid, int end) {
        int[] arr = new int[end + 1]; // 定义一个临时数组，用来存储排序后的结果
        int low = start; // 临时数组的索引
        int left = start;
        int center = mid + 1;
        // 取出最小值放入临时数组中
        while (start <= mid && center <= end) {
            arr[low++] = array[start] > array[center] ? array[center++] : array[start++];
        }
        // 若还有段序列不为空，则将其加入临时数组末尾
        while (start <= mid) {
            arr[low++] = array[start++];
        }
        while (center <= end) {
            arr[low++] = array[center++];
        }
        // 将临时数组中的值copy到原数组中
        for (int i = left; i <= end; i++) {
            array[i] = arr[i];
        }
    }
    public static void main(String[] args) {
        int[] a = {12,4,1,8,0,20};
        int[] sort = sort(a, 0, a.length-1);
        System.out.println(Arrays.toString(sort));
    }
}

