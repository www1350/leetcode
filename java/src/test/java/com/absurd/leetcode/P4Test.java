package com.absurd.leetcode;

import org.junit.Test;

/**
 * Created by wangwenwei on 17/8/6.
 */
public class P4Test {
    @Test
    public void findMedianSortedArrays(){
        int[] nums1 = {1,3};
        int[] nums2 = {2};
        P4 p = new P4();
        System.out.println(p.findMedianSortedArrays(nums1,nums2));


        int[] nums3 = {1,2};
        int[] nums4 = {3,4};
        System.out.println(p.findMedianSortedArrays(nums3,nums4));
    }
}
