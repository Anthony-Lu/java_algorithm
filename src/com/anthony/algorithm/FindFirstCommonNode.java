package com.anthony.algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 题目描述：输入两个单向链表，找出它们的第一个公共结点
 * Created by Anthony on 2019/9/29 23:39
 */
public class FindFirstCommonNode {
    static class Node {
        Node next;
        int val;

        public Node(int val) {
            this.val = val;
        }
    }

    public Node solution(Node head1, Node head2) {
        Node node1 = head1;
        Node node2 = head2;
        Map<Node, Integer> map = new HashMap<>();
        while (node1 != null) {
            map.put(node1, node1.val);
            node1 = node1.next;
        }

        while (node2 != null) {
            if (map.containsKey(node2)) {
                return node2;
            }
            node2 = node2.next;
        }
        return null;
    }

    public static void main(String[] args) {
        String s = "afagvwgw232";
        String s1 = s.replaceAll("[^(A-Za-z)]", "");
        System.out.println(s1);


        String[] a = {"1", "2"};
        List<String> objects = Arrays.asList(a);

        objects.forEach(e -> {
            System.out.println(e);
        });

    }
}
