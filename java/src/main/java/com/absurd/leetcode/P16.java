package com.absurd.leetcode;

import java.util.Arrays;

/**
 * Given an array nums of n integers and an integer target,
 * find three integers in nums such that the sum is closest to target.
 * Return the sum of the three integers. You may assume that each input would have exactly one solution.
 * Example:
 * Given array nums = [-1, 2, 1, -4], and target = 1.
 * The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 * @author wangwenwei
 * @time 2018/7/30
 */
public class P16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int minValue = Integer.MAX_VALUE;
        int result = nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length-2;i++){
            if (i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1;
            int k=nums.length-1;
            while (j<k){
                int tempTotal = nums[i]+nums[j]+nums[k];
                if (minValue > Math.abs(tempTotal - target)){
                    minValue = Math.abs(tempTotal - target);
                    result = tempTotal;
                }
                if (tempTotal < target){
                    tempTotal = nums[i]+nums[++j]+nums[k];
                }else if (tempTotal > target){
                    tempTotal = nums[i]+nums[j]+nums[--k];
                }else {
                    return target;
                }

            }
        }
        return result;
    }
}
