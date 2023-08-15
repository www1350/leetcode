package com.absurd.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * P1110
 *
 * @author Absurd
 * @version 2023/08/15 23:21
 **/
public class P1110 {
    /***
     * 给出二叉树的根节点 root，树上每个节点都有一个不同的值。
     *
     * 如果节点值在 to_delete 中出现，我们就把该节点从树上删去，最后得到一个森林（一些不相交的树构成的集合）。
     *
     * 返回森林中的每棵树。你可以按任意顺序组织答案。
     *
     *
     *
     * 示例 1：
     *
     *
     *
     * 输入：root = [1,2,3,4,5,6,7], to_delete = [3,5] 输出：[[1,2,null,4],[6],[7]] 示例 2：
     *
     * 输入：root = [1,2,4,null,3], to_delete = [3] 输出：[[1,2,4]]
     *
     *
     * 提示：
     *
     * 树中的节点数最大为 1000。 每个节点都有一个介于 1 到 1000 之间的值，且各不相同。 to_delete.length <= 1000 to_delete 包含一些从 1 到 1000、各不相同的值。
     * 
     * @param root
     * @param to_delete
     * @return
     */
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        Set<Integer> deleteSet = Arrays.stream(to_delete).boxed().collect(Collectors.toSet());
        List<TreeNode> resultList = new ArrayList();
        dfs(root, resultList, deleteSet);
        // add root
        if (!deleteSet.contains(root.val)) {
            resultList.add(root);
        }
        return resultList;
    }

    private TreeNode dfs(TreeNode root, List<TreeNode> resultList, Set<Integer> deleteSet) {
        if (root == null) {
            return null;
        }
        root.left = dfs(root.left, resultList, deleteSet);
        root.right = dfs(root.right, resultList, deleteSet);
        // no delete
        if (!deleteSet.contains(root.val)) {
            return root;
        }
        // delete left
        if (root.left != null) {
            resultList.add(root.left);
        }
        // delete right
        if (root.right != null) {
            resultList.add(root.right);
        }
        return null;

    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
