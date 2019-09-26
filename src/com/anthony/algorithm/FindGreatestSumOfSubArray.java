package com.anthony.algorithm;

/**
 * 题目描述:给定一个int 数组，求该数组中连续子数组的最大和。
 * 比如{6,-3,-2,7,-15,1,2,2} 最大子数组的和为8，即{6,-3,-2,7}
 * 子数组长度最少为1
 * 思路：对于数组中任意一个数x,只要x左边的数加起来的和为正数，那么加上x则能使得整体值变大
 * 用current记录当前值,max记录最大值。
 * Created by Anthony on 2019/9/26 23:34
 */
public class FindGreatestSumOfSubArray {
    public int find(int[] array){
        if(array == null || array.length == 0){
            return 0;
        }
        //初始时令current和max都为第一个元素的值
        int current = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            current = current > 0 ? current + array[i] : array[i];
            if(max < current){
                max = current;
            }
        }
        return max;
    }
}
