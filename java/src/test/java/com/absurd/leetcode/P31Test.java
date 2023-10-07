package com.absurd.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * P31Test
 *
 * @author Absurd
 * @version 2023/10/06 21:29
 **/
public class P31Test {
    @Test
    public void nextPermutation(){
        P31 p31 = new P31();
        int[] arr = new int[]{1,2};
        p31.nextPermutation(arr);
        Assert.assertArrayEquals(arr,new int[]{2,1});
    }
}
