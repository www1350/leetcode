package com.absurd.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Absurd
 * @version P513.java, v 0.1 2023年08月25日 16:54 Absurd
 */
public class P513 {
    /**
     * 给定一个二叉树的 根节点 root，请找出该二叉树的 最底层 最左边 节点的值。
     *
     * 假设二叉树中至少有一个节点。
     *
     * 示例 1:
     *
     *
     *
     * 输入: root = [2,1,3]
     * 输出: 1
     * 示例 2:
     *
     *
     *
     * 输入: [1,2,3,4,null,5,6,null,null,7]
     * 输出: 7
     * 提示:
     *
     * 二叉树的节点个数的范围是 [1,104]
     * -231 <= Node.val <= 231 - 1
     * @param root
     * @return
     */
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNodeWithDir> queue = new LinkedList<>();
        queue.add(new TreeNodeWithDir(root,true));
        int result = -1;
        // 1/ 2 3 /4 5 6 /7
        while (!queue.isEmpty()){
            int queueLength =  queue.size();
            for(int i=0;i<queueLength;i++){
                TreeNodeWithDir treeNodeWithDir =  queue.poll();
                if(i==0){
                    result = treeNodeWithDir.node.val;
                }
                if (treeNodeWithDir.node.left != null){
                    queue.add(new TreeNodeWithDir(treeNodeWithDir.node.left, true));

                }
                if (treeNodeWithDir.node.right != null){
                    queue.add(new TreeNodeWithDir(treeNodeWithDir.node.right, false));
                }
            }

        }
        return result;

    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public class TreeNodeWithDir {
        TreeNode node;
        boolean left;
        TreeNodeWithDir(TreeNode node,boolean left) {
            this.node = node;
            this.left = left;
        }
    }
}