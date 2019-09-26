package com.anthony.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * 题目描述：给定一个数组，将数组中的所有奇数调整至偶数的前面
 * 思路:用两个集合分别保存数组中奇数和偶数
 * 最后将偶数的集合添加至奇数集合的后面
 * Created by Anthony on 2019/9/26 23:46
 */
public class ReviseArrayOrder {
    public void reviseOrder(int[] array){
        if(array == null || array.length == 0){
            return ;
        }
        List<Integer> oddNumberList = new ArrayList<>();
        List<Integer> evenNumberList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            int number = array[i];
            if(number % 2 == 0){
                evenNumberList.add(number);
            }else{
                oddNumberList.add(number);
            }
        }
        oddNumberList.addAll(evenNumberList);
        for (int i = 0; i < array.length; i++) {
            array[i] = oddNumberList.get(i);
        }

    }
}
