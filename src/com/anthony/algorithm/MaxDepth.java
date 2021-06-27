package com.anthony.algorithm;

/**
 * 给定一个二叉树，找出其最大深度。
 *
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 * https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/
 * Created by luxb on 2021/6/27
 */
public class MaxDepth {
    public static int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        return Math.max(maxDepth(root.left),maxDepth(root.right)) + 1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);

        root.left = new TreeNode(9);

        TreeNode leftRoot = new TreeNode(20);
        root.right = leftRoot;
        leftRoot.left = new TreeNode(15);
        leftRoot.right = new TreeNode(7);

        System.out.println(maxDepth(root));

    }
}
