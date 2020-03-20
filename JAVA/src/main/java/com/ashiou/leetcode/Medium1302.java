/*
Given a binary tree, return the sum of values of its deepest leaves.
 */
package com.ashiou.leetcode;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Medium1302 {
    public int deepestLeavesSum(TreeNode root) {
        int levelSum = 0;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            levelSum = 0;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode r = queue.poll();
                levelSum = levelSum + r.val;
                if (r.left != null) {
                    queue.add(r.left);
                }
                if (r.right != null) {
                    queue.add(r.right);
                }
            }
        }
        return levelSum;
    }
}
