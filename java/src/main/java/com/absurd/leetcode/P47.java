package com.absurd.leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/***
 * 给定一个可包含重复数字的序列 nums ，按任意顺序 返回所有不重复的全排列。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [1,1,2]
 * 输出：
 * [[1,1,2],
 *  [1,2,1],
 *  [2,1,1]]
 * 示例 2：
 *
 * 输入：nums = [1,2,3]
 * 输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 *  
 *
 * 提示：
 *
 * 1 <= nums.length <= 8
 * -10 <= nums[i] <= 10
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/permutations-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class P47 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        // 1,1,2
        // 1--1--2
        // 1--2
        // 2
        Arrays.sort(nums);
        backStack(res, deque, nums, used);
        return res;
    }

    private void backStack(List<List<Integer>> res, ArrayDeque<Integer> deque, int[] nums,boolean[] used) {
        if (deque.size() == nums.length) {
            res.add(new ArrayList<>(deque));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (i>0 && nums[i] == nums[i-1]){
                continue;
            }
            if (used[i]){
                continue;
            }
            deque.addLast(nums[i]);
            used[i]=true;
            backStack(res, deque, nums,used);
            deque.removeLast();
            used[i]=false;

        }
    }
}
