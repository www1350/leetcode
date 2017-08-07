package com.absurd.leetcode;

import java.util.*;

/**
 * https://leetcode.com/problems/3sum/description/
 * Created by wangwenwei on 17/8/7.
 */
public class P15 {

    /****
     * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
     * Note: The solution set must not contain duplicate triplets.
     * For example, given array S = [-1, 0, 1, 2, -1, -4],
     * A solution set is:
     * [
     * [-1, 0, 1],
     * [-1, -1, 2]
     * ]
     * @param nums
     * @return
     */
    public List<List<Integer>> threeSum(int[] nums) {
        //a+b=-c
        Arrays.sort(nums);
        //-4,-1,-1,0,1,2
        List allList = new ArrayList();
        int aa = Integer.MAX_VALUE;
        for(int i=0;i<nums.length-1;i++){
            if ( nums[i] ==aa ) continue;
            int bb = Integer.MAX_VALUE;
            int cc = nums.length;
            for (int j=i+1;j<nums.length;j++){
                if ( nums[j] ==bb || cc<=j) continue;
                int c = -(nums[i]+nums[j]);
                int a = Arrays.binarySearch(nums,j+1,cc,c);
                if (a>j) {
                    List e = new ArrayList();
                    e.add(nums[i]);
                    e.add(nums[j]);
                    e.add(c);
                    allList.add(e);
                    cc = a;
                }
                bb = nums[j];
            }
            aa = nums[i];
        }
        return allList;
    }
}
