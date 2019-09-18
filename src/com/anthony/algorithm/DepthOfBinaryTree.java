package com.anthony.algorithm;

/**
 * 题目描述：求二叉树的深度
 * Created by Anthony on 2019/9/19 0:01
 */
public class DepthOfBinaryTree {
    class Node{
        int val;
        Node left;
        Node right;
        public Node(int val) {
            this.val = val;
        }
    }

    public int getDepth(Node root){
        if(root == null){
            return 0;
        }
        int left = getDepth(root.left) + 1;
        int right = getDepth(root.right) + 1;
        return left > right ? left :right ;
    }
}
