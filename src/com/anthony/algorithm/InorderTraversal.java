package com.anthony.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树的中序遍历
 * Created by luxb on 2021/3/20
 */
public class InorderTraversal {
     //* Definition for a binary tree node.
     static class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;

         TreeNode() {
         }

         TreeNode(int val) {
             this.val = val;
         }

         TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
             this.left = left;
             this.right = right;
         }
     }

    private static List<Integer> result =  new ArrayList<>();

    public static List<Integer> inorderTraversal(TreeNode root) {
        inOrder(root);
        return result;
    }

    private static void inOrder(TreeNode root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        result.add(root.val);
        inOrder(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        root.left = left;
        root.right = right;
        inorderTraversal(root);
        System.out.println(result);
    }
}
