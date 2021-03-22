package com.anthony.algorithm;

import java.util.Stack;
import java.util.regex.Pattern;

/**
 * 根据 逆波兰表示法，求表达式的值。
 *
 * 有效的算符包括 +、-、*、/ 。每个运算对象可以是整数，也可以是另一个逆波兰表达式。
 *
 * 示例:
 * 输入：tokens = ["2","1","+","3","*"]
 * 输出：9
 * 解释：该算式转化为常见的中缀算术表达式为：((2 + 1) * 3) = 9
 * Created by luxb on 2021/3/20
 */
public class EvalRPN {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<String>();
        for (String token : tokens) {
            if(token.matches("\\d")){
                stack.push(token);
            }else if(token.matches("\\+||\\-||\\*||\\/")){
                String e1 = stack.pop();
                String e2 = stack.pop();
                String result = calculation(e1, e2, token);
                stack.push(result);
            }
        }
        return Integer.parseInt(stack.pop());
    }

    private String calculation(String e1,String e2,String operator){
        Integer i = Integer.valueOf(e1);
        Integer j = Integer.valueOf(e2);
        switch (operator){
            case "+":
                return (i + j) + "";
            case "-":
                return (i - j) + "";
            case "*":
                return (i * j) + "";
            case "/":
                return (i / j) + "";
            default:
                throw new RuntimeException("没有匹配的运算符!");
        }
    }

    // (2+1) * 3
    public static void main(String[] args) {

    }
}
