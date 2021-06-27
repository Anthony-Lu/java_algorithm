package com.anthony.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * 2
 *     1
 *   3
 * 二叉树的中序遍历
 * Created by luxb on 2021/3/20
 */
public class InorderTraversal {
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result =  new ArrayList<>();
        inOrder(root,result);
        return result;
    }

    private static void inOrder(TreeNode root,List<Integer> list){
        if(root == null){
            return;
        }
        inOrder(root.left,list);
        list.add(root.val);
        inOrder(root.right,list);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        root.right = left;
        left.left = right;
        System.out.println(inorderTraversal(root));
    }
}
