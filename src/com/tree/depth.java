package com.tree;

import com.common.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class depth {
    /**
     * 树的最大深度
     * 1 深度遍历
     * 2 广度遍历
     */

    int maxDep = 0;
    public int maxDepth(TreeNode root) {
        if(root == null)return 0;
        dfs(root,1);
        return maxDep;
    }

    private void dfs(TreeNode root, int level) {
        if (root == null){
            return;
        }

        //处理逻辑  已访问
        if(level > maxDep)maxDep = level;

        // 处理子节点
        dfs(root.left,level+1);
        dfs(root.right,level+1);
    }


    //  广度遍历

    public int maxDepth_BFS(TreeNode root){
        int max  = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()){
            int size = queue.size();
            while (size!=0){
                TreeNode node = queue.remove();
                if (node.left!=null)queue.offer(node.left);
                if (node.right!=null)queue.offer(node.right);
                size--;
            }
            max++;
        }
        return max;

    }

}
