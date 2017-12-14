package com.absurd.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * <a>https://leetcode.com/problems/two-sum</>
 * Created by Administrator on 2016/10/23.
 */
public class P1_2 {
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
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<size;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<size-1;i++){
            int find = target - nums[i];
            Integer ind = map.get(find);
            if (ind != null && ind > i){
                res[0]=i;
                res[1]=ind;
                return res;

            }
        }
        return res;
    }
}
