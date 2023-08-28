package com.absurd.leetcode;

import java.util.Arrays;

/**
 * @author Absurd
 * @version P416.java, v 0.1 2023年08月28日 20:22 Absurd
 */
public class P416 {
    /**
     * 给你一个 只包含正整数 的 非空 数组 nums 。请你判断是否可以将这个数组分割成两个子集，使得两个子集的元素和相等。
     *
     *
     *
     * 示例 1：
     *
     * 输入：nums = [1,5,11,5]
     * 输出：true
     * 解释：数组可以分割成 [1, 5, 5] 和 [11] 。
     * 示例 2：
     *
     * 输入：nums = [1,2,3,5]
     * 输出：false
     * 解释：数组不能分割成两个元素和相等的子集。
     *
     *
     * 提示：
     *
     * 1 <= nums.length <= 200
     * 1 <= nums[i] <= 100
     * @param nums
     * @return
     */
    public boolean canPartition(int[] nums) {
        // 是否存在一个子集，总和为原集合一半
        int target = Arrays.stream(nums).sum() ;
        if (target%2 == 1){
            return false;
        }
        target = target /2;

        // dp 状态定义:dp[i]表示总和为i，值false不存在true存在
        boolean[] dp = new boolean[target+1];
        dp[0] = true;
        for(int i=0;i<nums.length;i++){
            for (int j=target;j>=nums[i];j--){
                dp[j] = dp[j]  || dp[j-nums[i]];
            }
        }

        return dp[target];

    }
}