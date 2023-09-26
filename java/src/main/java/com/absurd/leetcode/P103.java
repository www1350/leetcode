package com.absurd.leetcode;

import java.util.*;

/**
 * 给你二叉树的根节点 root ，返回其节点值的 锯齿形层序遍历 。（即先从左往右，再从右往左进行下一层遍历，以此类推，层与层之间交替进行）。
 *
 *
 *
 * 示例 1：
 *
 *
 * 输入：root = [3,9,20,null,null,15,7]
 * 输出：[[3],[20,9],[15,7]]
 * 示例 2：
 *
 * 输入：root = [1]
 * 输出：[[1]]
 * 示例 3：
 *
 * 输入：root = []
 * 输出：[]
 *
 *
 * 提示：
 *
 * 树中节点数目在范围 [0, 2000] 内
 * -100 <= Node.val <= 100
 * @author absurd
 * @version P103.java, v 0.1 2023年09月26日 11:48 absurd
 */
public class P103 {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null){
            return result;
        }

        Deque<TreeNode> queue =  new LinkedList<>();
        queue.add(root);
        boolean isLeft = true;
        while (!queue.isEmpty()){
            int queueSize = queue.size();
            List<Integer> levelList = new ArrayList<>();
            for(int i=0;i<queueSize;i++){
                TreeNode node = null;
                if (isLeft){
                    node = queue.pollFirst();
                    queue.add(node);
                }else {
                    node = queue.pollLast();
                    queue.addFirst(node);
                }
                levelList.add(node.val);
            }
            result.add(levelList);
            isLeft = !isLeft;
            for(int i=0;i<queueSize;i++){
                TreeNode node = queue.poll();
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
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
}