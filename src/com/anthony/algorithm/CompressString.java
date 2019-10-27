package com.anthony.algorithm;

/**
 * 字符串压缩
 * 要求输入“aaabbccaadd”，输出“3a2b2c2a2d”
 * Created by Anthony on 2019/10/27 23:31
 */
public class CompressString {
    public static String compressString(String str){
        char first = str.charAt(0);
        int count = 1;
        StringBuilder sb = new StringBuilder();
        for(int i = 1;i<str.length();i++){
            char second = str.charAt(i);
            if(first == second){
                count ++;
                continue;
            }
            sb.append(count).append(first);
            first = second;
            count = 1;
        }
        return sb.append(count).append(first).toString();
    }
}
