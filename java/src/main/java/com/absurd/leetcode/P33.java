package com.absurd.leetcode;

import java.util.Arrays;

/**
 * 33. Search in Rotated Sorted Array
 * https://leetcode.com/problems/search-in-rotated-sorted-array/description/
 * @author wangwenwei
 * @time 2017/12/18
 */
public class P33 {
    /***
     * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

     (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

     You are given a target value to search. If found in the array return its index, otherwise return -1.

     You may assume no duplicate exists in the array.
     * @param nums
     * @param target
     * @return
     */
    public static int search(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            double midVal;
            if ((nums[mid] < nums[0]) == (target < nums[0])){
                midVal = nums[mid];
            }else{
                midVal = target < nums[0] ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY;
            }

            if (midVal < target)
                low = mid + 1;
            else if (midVal > target)
                high = mid - 1;
            else
                return mid; // key found
        }
        if(low>-1) return -1;
        else return -(low + 1);  // key not found.

    }
}
