package com.anthony.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * 题目描述:在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置, 如果没有则返回 -1.
 * Created by Anthony on 2019/9/18 0:24
 */
public class FirstNotRepeatingChar {
    public int findStr(String str){
        int len = str.length();
        if(str == null || len == 0){
            return -1;
        }
        Map<Character,Integer> map = new HashMap<>(16);
        for(int i = 0;i < len;i++){
            char c = str.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c) + 1);
            }else{
                map.put(c,1);
            }
        }
        for(int j = 0;j < len;j++){
            Integer count = map.get(str.charAt(j));
            if(count == 1){
                return j;
            }
        }
        return -1;
    }
    public int FirstNotRepeatingChar(String str) {
        int len = str.length();
        if(len == 0)
            return -1;
        char [] s = str.toCharArray();
        int [] m = new int[256];
        for(int i = 0; i < len; i++){
            m[s[i]]++;
        }
        for(int i = 0; i < len; i++){
            if(m[s[i]] == 1)
                return i;
        }
        return -1;
    }
}
