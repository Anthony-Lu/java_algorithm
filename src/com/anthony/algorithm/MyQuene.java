package com.anthony.algorithm;

import java.util.Stack;

/**
 * 题目描述：用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 * Created by Anthony on 2019/9/12 0:14
 */
public class MyQuene {
    private Stack<Integer> stack1 = new Stack<Integer>();
    private Stack<Integer> stack2 = new Stack<Integer>();
    public int pop(){
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }
    public void push(int element){
        stack1.push(element);
    }
}
