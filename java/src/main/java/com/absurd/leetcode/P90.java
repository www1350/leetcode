package com.absurd.leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/***
 * 给你一个整数数组 nums ，其中可能包含重复元素，请你返回该数组所有可能的子集（幂集）。
 *
 * 解集 不能 包含重复的子集。返回的解集中，子集可以按 任意顺序 排列。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [1,2,2]
 * 输出：[[],[1],[1,2],[1,2,2],[2],[2,2]]
 * 示例 2：
 *
 * 输入：nums = [0]
 * 输出：[[],[0]]
 *  
 *
 * 提示：
 *
 * 1 <= nums.length <= 10
 * -10 <= nums[i] <= 10
 *
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/subsets-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class P90 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        Arrays.sort(nums);
        backStack(res, deque, nums, 0);
        return res;
    }

    private void backStack(List<List<Integer>> res, ArrayDeque<Integer> deque, int[] nums, int start) {
        // 1 2 2
        // 1--2/2(两个需要进行剪枝去掉一个，因为两个是一样的) --2
        // 2--2
        // 2
        res.add(new ArrayList<>(deque));
        for (int i = start ; i<nums.length;i++){
            //剪枝去重
            if(i>start&&nums[i]==nums[i-1]){
                continue;
            }
            deque.addLast(nums[i]);
            backStack(res, deque, nums, i+1);
            deque.pollLast();
        }

    }
}
