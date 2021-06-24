package com.anthony.algorithm;

/**
 * Created by luxb on 2021/06/21 下午5:12
 */
public class ListNode {

    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
    @Override
    public String toString() {
        ListNode head = this;
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.val + "  ");
            head = head.next;
        }
        return sb.toString();
    }
}
