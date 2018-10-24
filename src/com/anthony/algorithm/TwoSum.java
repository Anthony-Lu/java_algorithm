package com.anthony.algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Java解决Two Sum问题
 * Created by Anthony on 2018/10/22
 */
public class TwoSum {
    public static int[] twoSum(int[] a, int target) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    public static int[] newTwoSum(int[] a, int taget) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(taget - a[i])) {
                result[0] = map.get(taget - a[i]);
                result[1] = i;
                return result;
            }
            map.put(a[i], i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 0, 6};
        int[] ints = newTwoSum(a, 6);
        System.out.println(Arrays.toString(ints));
    }
}
