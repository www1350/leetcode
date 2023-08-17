package com.absurd.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * P2357
 *
 * @author Absurd
 * @version 2023/08/17 22:41
 **/
public class P2357 {
    public int minimumOperations(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                set.add(nums[i]);
            }
        }
        int count = 0;

        while(set.size()>0){
            int mini =  Integer.MAX_VALUE;
            for (Integer e:set) {
                mini = e< mini ?e: mini;
            }
            Set<Integer> set2 = new HashSet<>();
            for (Integer e:set) {
                if (e != mini){
                    set2.add(e-mini);
                }
            }
            set = set2;
            count++;

        }
        return count;

    }
}
