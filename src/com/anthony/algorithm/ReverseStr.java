package com.anthony.algorithm;

/**
 * 反转字符串
 * Created by Anthony on 2019/9/8 23:57
 */
public class ReverseStr {
    public static String reverseStr1(String str) {
        if (str == null || str.length() == 1) {
            return str;
        }
        return reverseStr1(str.substring(1)) + str.charAt(0);
    }

    public static String reverseStr2(String str) {
        String result = "";
        if (str == null || str.length() == 0) {
            return result;
        }
        char[] chars = str.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            result += chars[i];
        }
        return result;
    }
}
