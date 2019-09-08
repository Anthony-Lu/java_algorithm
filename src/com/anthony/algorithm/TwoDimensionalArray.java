package com.anthony.algorithm;

/**
 * 题目描述:
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * Created by Anthony on 2019/9/9 0:30
 * 1  2  3  4  5
 * 2  3  4  5  6
 * 7  8  9  10 11
 */
public class TwoDimensionalArray {

    public static boolean find(int[][] array, int target) {
        //边界条件判断
        if (array.length == 0 || array[0].length == 0) {
            return false;
        }
        //定义二维数组的行数和列数
        int m = array.length;
        int n = array[0].length;
        //定义一开始查找的元素位置，默认为最右上角的元素位置 这个例子里就是元素5所在的位置
        int i = 0, j = n - 1;
        while (i < m && j >= 0) {
            //如果要查找的元素小于右上角元素 则列下表-1 此时就变成了从4开始查找
            /**
             *  1  2  3  4
             *  2  3  4  5
             *  7  8  9  10
             */
            if (target < array[i][j]) {
                j--;
            }
            //如果要查找的元素大于右上角元素 则行下标+1 此时就变成了从6开始查找
            /**
             *  2  3  4  5  6
             *  7  8  9  10 11
             */
            else if (target > array[i][j]) {
                i++;
            } else {
                return true;
            }
        }
        return false;
    }

}
