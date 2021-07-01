package com.anthony.algorithm;

/**
 * 反转从m到n区间内的链表
 * 1<=m<=n<=链表的长度
 *
 * 1-2-3-4-5
 * 1 3 2 4 5
 * 1 4 3 2 5
 * Created by luxb on 2021/07/01 下午8:40
 */
public class ReverseBetween {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(0);  //虚拟头结点往往是有必要的，好处非常明显
        dummy.next = head;
        ListNode pre = dummy;
        for(int i = 1; i < m; i++){
            pre = pre.next;
        }
        head = pre.next;
        for(int i = m; i < n; i++){
            ListNode nex = head.next;
            head.next = nex.next;
            nex.next = pre.next;
            pre.next = nex;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);

        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);

        System.out.println(new ReverseBetween().reverseBetween(listNode, 2, 4));

    }
}
