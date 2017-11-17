package com.bacazy.problem.newcoder;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for binary tree
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
public class MinimunDepthOfTree {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int run(TreeNode root) {
        if (root == null){
            return 0;
        }
        int depth = 0;
        List<TreeNode> current = new ArrayList<>();
        List<TreeNode> next = null;
        current.add(root);
        depth++;
        while (current.size() > 0){
            next = new ArrayList<>();
            for (TreeNode node:current){
                if (node.left == null && node.right == null){
                    return depth;
                }
                if (node.left != null){
                    next.add(node.left);
                }
                if (node.right != null){
                    next.add(node.right);
                }
            }
            current = next;
            depth++;
        }

        return depth;
    }
}
