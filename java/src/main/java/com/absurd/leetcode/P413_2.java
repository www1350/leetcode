package com.absurd.leetcode;

public class P413_2 {

    public int numberOfArithmeticSlices(int[] nums) {
        // dp
        if(nums.length<3){
            return 0;
        }
        int[] dp = new int[nums.length];
        int res = 0;
        for(int i=2;i<nums.length;i++){
            if (nums[i] +nums[i-2] == 2 * nums[i-1] ){
                dp[i] = dp[i-1]+1;
                res+=dp[i];
            }
        }
        return res;

    }
}
