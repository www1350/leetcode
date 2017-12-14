package com.absurd.leetcode;

import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Administrator on 2016/10/23.
 */
public class P1_2Test {
    @Test
    public void twoSumSolution(){
        int[] nums = {0,3,4,0};
        int target = 0;
        int a[] =  P1_2.twoSum(nums,target);
        assertThat(a,is(equalTo( new int[]{0, 3})));

    }

}
