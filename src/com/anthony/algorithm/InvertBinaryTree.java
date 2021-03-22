package com.anthony.algorithm;

/**
 * Created by Anthony on 2019/10/27 23:39
 */
public class InvertBinaryTree {
    static class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public static void invertBinaryTree(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode node = root.left;
        root.left = root.right;
        root.right = node;
        invertBinaryTree(root.left);
        invertBinaryTree(root.right);
    }
}
