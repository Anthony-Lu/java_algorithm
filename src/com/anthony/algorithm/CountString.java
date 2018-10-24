package com.anthony.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * Java统计字符串出现的次数
 * Created by Anthony on 2018/10/24
 */
public class CountString {

    /**
     *
     * @param str
     * @return
     */
    public static Map<Character ,Integer> countStr(String str){
        Map<Character, Integer> map = new HashMap<>();
        char[] cs = str.toCharArray();
        for(char c : cs){
            if (map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }

        }
        return map;

    }

    /**
     * 字符串压缩
     * 要求输入“aaabbccaadd”，输出“3a2b2c2a2d”
     * @param str
     * @return
     */
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
    public static void main(String[] args) {
        String str = "aaaffbbaad";
        String s = compressString(str);
        System.out.println(s);
    }

}
