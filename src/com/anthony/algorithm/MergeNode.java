package com.anthony.algorithm;

/**
 * 题目描述:合并两个有序的单链表
 * 输入两个链表 1->2->3,1->3->4->5
 * 输出1->1->2->3->3->4->5
 * Created by Anthony on 2019/9/25 0:09
 */
public class MergeNode {
    static class Node {
        Node next;
        int val;

        public Node(int val) {
            this.val = val;
        }
    }

    public Node merge(Node node1, Node node2) {
        if (node1 == null) {
            return node2;
        }
        if (node2 == null) {
            return node1;
        }
        Node result;
        if (node1.val <= node2.val) {
            result = node1;
            node1.next = merge(node1.next, node2);

        } else {
            result = node2;
            node2.next = merge(node1, node2.next);
        }
        return result;
    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        node1.next = node2;
        node2.next = node3;

        Node node4 = new Node(1);
        Node node5 = new Node(3);
        Node node6 = new Node(4);

        node4.next = node5;
        node5.next = node6;
        MergeNode mergeNode = new MergeNode();
        Node newNode = mergeNode.merge(node1, node4);
        while (newNode != null) {
            System.out.println(newNode.val + "");
            newNode = newNode.next;
        }
    }
}
