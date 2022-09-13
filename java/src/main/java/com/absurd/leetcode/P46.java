package com.absurd.leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * 给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列 。你可以 按任意顺序 返回答案。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [1,2,3]
 * 输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 * 示例 2：
 *
 * 输入：nums = [0,1]
 * 输出：[[0,1],[1,0]]
 * 示例 3：
 *
 * 输入：nums = [1]
 * 输出：[[1]]
 *  
 *
 * 提示：
 *
 * 1 <= nums.length <= 6
 * -10 <= nums[i] <= 10
 * nums 中的所有整数 互不相同
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/permutations
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class P46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        Deque<Integer> deque = new ArrayDeque<>();
        boolean[] visited = new boolean[nums.length];
        dfs(nums,  deque, res ,visited);


        return res;
    }

    /**
     *
     * @param nums
     * @param deque
     * @param res
     * @param visited
     */
    private void dfs(int[] nums,   Deque<Integer> deque, List<List<Integer>> res,boolean[] visited ) {
        if (deque.size() == nums.length){
            res.add(new ArrayList<>(deque));
        }
        for(int i = 0; i< nums.length;i++){
            if (visited[i]) {
                continue;
            }
            deque.offer(nums[i]);
            visited[i] = true;
            dfs(nums,  deque, res, visited);
            visited[i] = false;
            deque.removeLast();
        }
    }

}
