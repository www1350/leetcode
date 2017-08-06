package com.absurd.leetcode;

/**
 * https://leetcode.com/problems/median-of-two-sorted-arrays/description/
 * Created by wangwenwei on 17/8/6.
 */
public class P4 {
    /***
     * There are two sorted arrays nums1 and nums2 of size m and n respectively.
     * Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

     Example 1:
     nums1 = [1, 3]
     nums2 = [2]

     The median is 2.0
     Example 2:
     nums1 = [1, 2]
     nums2 = [3, 4]

     nums1 = [1,4]
     nums2 = [2,3]

     The median is (2 + 3)/2 = 2.5
     * @param nums1
     * @param nums2
     * @return
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int m = nums1.length;
        int n = nums2.length;
        int nums[] = new int[m+n];
        int aaa = 0;
        while(i<m || j<n) {
            if (i==m) nums[aaa++] = nums2[j++];
            else if (j==n) nums[aaa++] = nums1[i++];
            else if (nums1[i] < nums2[j]) {
                nums[aaa++] = nums1[i++];
            }else{
                nums[aaa++] = nums2[j++];
            }
        }
        if((m+n) % 2 ==1) return nums[nums.length>>1];
        else return (nums[nums.length>>1]+nums[nums.length>>1-1])/2.0;
    }
}
