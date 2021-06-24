package com.anthony.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anthony on 2019/10/10 0:05
 */
public class PrintListFromTailToHead {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);

        node1.next = node2;
        node2.next = node3;
        List<Integer> integers = printListFromTailToHead(node1);
        for (Integer integer : integers) {
            System.out.println(integer);
        }
    }

    public static List<Integer> printListFromTailToHead(ListNode listNode) {
        List<Integer> arrayList = new ArrayList<Integer>();
        if (listNode == null) {
            return arrayList;
        }
        printListFromTailToHead(listNode.next);
        arrayList.add(listNode.val);
        return arrayList;
    }
}
