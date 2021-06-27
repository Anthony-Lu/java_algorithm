package com.anthony.algorithm;

import java.util.HashSet;
import java.util.Set;

/**
 * 给你两个单链表的头节点 headA 和 headB ，请你找出并返回两个单链表相交的起始节点。如果两个链表没有交点，返回 null 。
 * Created by luxb on 2021/6/27
 */
public class GetIntersectionNode {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        Set<ListNode> set = new HashSet<>();
        ListNode node = headA;
        while (node != null) {
            set.add(node);
            node = node.next;
        }
        node = headB;
        while (node != null) {
            if (set.contains(node)) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public static void main(String[] args) {
        ListNode headA = new ListNode(8);

        ListNode headB = new ListNode(4);
        headB.next = new ListNode(1);
        headB.next.next = new ListNode(8);
        headB.next.next.next = new ListNode(4);
        headB.next.next.next.next = new ListNode(5);

        System.out.println(getIntersectionNode(headA, headB));

    }
}
