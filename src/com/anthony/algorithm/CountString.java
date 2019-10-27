package com.anthony.algorithm;

import java.util.HashMap;
import java.util.Map;
/**
 * Java统计字符串出现的次数
 * Created by Anthony on 2018/10/24
 */
public class CountString {
    /**
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
}
