package com.tree;


import java.util.HashMap;

public class rebuild {
}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */

//         输入某二叉树的前序遍历和中序遍历的结果，请构建该二叉树并返回其根节点。

//        假设输入的前序遍历和中序遍历的结果中都不含重复的数字。

/**
 * 思路：
 * 以中序遍历 为基准  可以采用递归 将数组分为两部分  左子树  右子树  每次分别处理这两个就可以
 * 先序遍历 可以知道每次的根节点
 */

class Solution {
    int[] preorder;
    HashMap<Integer, Integer> dic = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        for (int i = 0; i < inorder.length; i++) dic.put(inorder[i], i);
        return recur(0, 0, inorder.length - 1);
    }



    private TreeNode recur(int root, int left, int right) {
        if (left > right) return null;
        TreeNode node = new TreeNode(preorder[root]);
        int i = dic.get(preorder[root]);
        node.left = recur(root + 1, left, i - 1);
        //根节点索引 +  左子树 长度  +1
        node.right = recur(root + i - left + 1, i + 1, right);
        return node;

    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
