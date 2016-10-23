package com.absurd.leetcode;

/**
 * <a>https://leetcode.com/problems/two-sum</>
 * Created by Administrator on 2016/10/23.
 */
public class P1 {
    /***
     *
     * Given nums = [2, 7, 11, 15], target = 9,
     *
     *Because nums[0] + nums[1] = 2 + 7 = 9,
     *return [0, 1].
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        int size = nums.length;
        int[] res = new int[2];
        for(int i=0;i<size-1;i++){
            for(int j=i+1;j<size;j++){
                if(nums[i]+nums[j]==target){
                    res[0]=i;
                    res[1]=j;
                    return res;
                }

            }
        }
        return res;
    }
}
