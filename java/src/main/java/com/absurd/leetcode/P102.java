package com.absurd.leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class P102 {
//    public List<List<Integer>> levelOrder(TreeNode root) {
//
//        List<List<Integer>> res = new ArrayList<>();
//        if (root == null){
//            return res;
//        }
//        Queue<TreeNode> queue = new ArrayDeque();
//        Queue<TreeNode> queue2 = new ArrayDeque();
//        queue.offer(root);
//        do {
//            List<Integer> rt = new ArrayList<>();
//            while (!queue2.isEmpty()) {
//                TreeNode e = queue2.poll();
//                if (e.left != null) {
//                    queue.offer(e.left);
//                }
//                if (e.right != null) {
//                    queue.offer(e.right);
//                }
//            }
//            while (!queue.isEmpty()) {
//                TreeNode e = queue.poll();
//                rt.add(e.val);
//                queue2.offer(e);
//            }
//            if(rt.size()!=0){
//                res.add(rt);
//            }
//        }while (!queue2.isEmpty());
//        return res;
//    }


    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null){
            return res;
        }
        Queue<TreeNode> queue = new ArrayDeque();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> rt = new ArrayList<>();
            res.add(rt);
            //size会变，不能用在循环里
            int n = queue.size();
            for(int i=0;i < n ;i++){
                TreeNode e = queue.poll();
                if (e.left != null) {
                    queue.offer(e.left);
                }
                if (e.right != null) {
                    queue.offer(e.right);
                }
                rt.add(e.val);
            }
        }
        return res;
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


