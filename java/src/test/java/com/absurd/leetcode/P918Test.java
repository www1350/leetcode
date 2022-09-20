package com.absurd.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class P918Test {
    @Test
    public void maxSubarraySumCircular(){
        P918 p918 = new P918();
        Assert.assertEquals(p918.maxSubarraySumCircular(new int[]{1,-2,3,-2}),3);
        Assert.assertEquals(p918.maxSubarraySumCircular(new int[]{-1,3,-3,9,-6,8,-5,-5,-6,10}),20);

        Assert.assertEquals(p918.maxSubarraySumCircular(new int[]{-3,-2,-3}),-2);

    }
}
