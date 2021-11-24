package com.tree;


import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class inorderTraversal {
    public List<Integer> solution(Solution.TreeNode root) {
        List<Integer> ans = new LinkedList<>();
        Deque<Solution.TreeNode> stack = new LinkedList<>();
        while(root!=null || !stack.isEmpty()){
            while(root != null){
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();
            ans.add(root.val);
            root = root.right;
        }
        return ans;
    }
}
