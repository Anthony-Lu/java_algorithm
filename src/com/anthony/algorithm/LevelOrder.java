package com.anthony.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 二叉树的层次遍历
 *  input:
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 *
 *   output :
 *   [
        [3],
        [9,20],
        [15,7]
 *  ]
 * Created by luxb on 2021/6/20
 */
public class LevelOrder {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);

        root.left = new TreeNode(9);
        TreeNode rightRoot = new TreeNode(20);

        rightRoot.left  = new TreeNode(15);
        rightRoot.right  = new TreeNode(7);

        root.right = rightRoot;
        List<List<Integer>> lists = new LevelOrder().levelOrder(root);

        System.out.println(lists);


    }
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return result;
        }
        helper(root, 0);
        return result;
    }

    public void helper(TreeNode treeNode, int level) {
        if (result.size() == level) {
            result.add(new ArrayList<>());
        }
        result.get(level).add(treeNode.val);
        if (treeNode.left != null) {
            helper(treeNode.left, level + 1);
        }
        if (treeNode.right != null) {
            helper(treeNode.right, level + 1);
        }
    }
}
