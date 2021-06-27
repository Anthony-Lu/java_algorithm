package com.anthony.algorithm;

/**
 *
 *  * 题目描述:合并两个有序的单链表
 *  * 输入两个链表 1->2->3,1->3->4->5
 *  * 输出1->1->2->3->3->4->5
 * Created by luxb on 2021/6/20
 */
public class MergeTwoLists {
    public static class ListNode {
        int val;
        ListNode next = null;
        public ListNode(int val) {
            this.val = val;
        }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            ListNode head = this;
            while (head != null){
                sb.append(head.val + "  ");
                head = head.next;
            }
            return sb.toString();
        }
    }

    public ListNode mergeTwoLists (ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        while (l1 != null && l2 != null){
            if(l1.val < l2.val){
                head.next = l1;
                l1 = l1.next;
            }else{
                head.next = l2;
                l2 = l2.next;
            }
            head = head.next;
        }
        head.next = l1 == null ? l2 : l1;
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(2);
        l2.next.next = new ListNode(4);
        ListNode listNode = new MergeTwoLists().mergeTwoLists(l1, l2);
        System.out.println(listNode.toString());
    }
}
