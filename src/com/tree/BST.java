package com.tree;

import com.common.TreeNode;

public class BST {
    /**
     * 98. 验证二叉搜索树
     *
     * 中序遍历  左子节点 小于 中间节点  小于 右子节点
     */
    long pre = Long.MIN_VALUE;

    public boolean isValidBST(TreeNode root) {

        if (! isValidBST(root.left)) return false;
        if (root.val <= pre) return false;
        pre = root.val;
        return isValidBST(root.right);

    }

}
