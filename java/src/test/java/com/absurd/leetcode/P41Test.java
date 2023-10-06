package com.absurd.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * P41Test
 *
 * @author Absurd
 * @version 2023/10/06 21:46
 **/
public class P41Test {
    @Test
    public void test(){
        P41 p41 = new P41();
        Assert.assertEquals(p41.firstMissingPositive(new int[]{2147483647}),1);

        Assert.assertEquals(p41.firstMissingPositive(new int[]{7,8,9,11,12}),1);
        Assert.assertEquals(p41.firstMissingPositive(new int[]{3,4,-1,1}),2);
    }
}
