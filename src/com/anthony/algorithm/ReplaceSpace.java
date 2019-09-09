package com.anthony.algorithm;

/**
 *题目描述:
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * Created by Anthony on 2019/9/10 0:16
 */
public class ReplaceSpace {

    public static String replaceSpace(String str){
        if(str == null || str.length() == 0){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int len = str.length();
        for(int i = 0;i < len;i++){
            char c = str.charAt(i);
            if(c == ' '){
                sb.append("%20");
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(replaceSpace("We Are Happy"));
    }
}
