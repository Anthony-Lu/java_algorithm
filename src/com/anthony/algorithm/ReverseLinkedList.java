package com.anthony.algorithm;

/**
 * 题目描述：反转单链表
 * 输入1->2->3->4 输出 4->3->2->1
 * Created by Anthony on 2019/9/25 23:05
 */
public class ReverseLinkedList {
    static class Node{
        Node next;
        int val;
        public Node(int val){
            this.val = val;
        }
    }

    //循环
    //1->2->3->4
    public Node reverseByLoop(Node head){
        Node pre = null;
        Node next = null;
        while (head != null){
            next = head.next;//next = 2; next = 3;
            head.next = pre;//head.next = null; head.next = 1;
            pre = head;//pre = 1;pre = 2;
            head = next;//head = 2;head = 3;
        }
        return pre;
    }

    //递归
    public Node reverseByRecursive(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node temp = head.next;
        Node newHead = reverseByRecursive(head.next);
        temp.next = head;
        head.next = null;
        return newHead;
    }
}
