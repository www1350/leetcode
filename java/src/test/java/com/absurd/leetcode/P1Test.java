package com.absurd.leetcode;

import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Administrator on 2016/10/23.
 */
public class P1Test {
    @Test
    public void twoSumSolution(){
        int[] nums = {3,2,4};
        int target = 6;
        int a[] =  P1.twoSum(nums,target);
        assertThat(a,is(equalTo( new int[]{1, 2})));

    }

}
