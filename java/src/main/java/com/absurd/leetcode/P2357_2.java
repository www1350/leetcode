package com.absurd.leetcode;

import java.util.*;

/**
 * P2357
 *
 * @author Absurd
 * @version 2023/08/17 22:41
 **/
public class P2357_2 {
    public int minimumOperations(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                set.add(nums[i]);
            }
        }

        return set.size();


    }
}
