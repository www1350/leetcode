package com.absurd.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Absurd
 * @version P495Test.java, v 0.1 2023年08月18日 17:33 Absurd
 */
public class P495Test {
    @Test
    public void findPoisonedDuration(){
        P495 p495 = new P495();
        Assert.assertEquals(4, p495.findPoisonedDuration(new int[]{1,4},2));
        Assert.assertEquals(3, p495.findPoisonedDuration(new int[]{1,2},2));
        Assert.assertEquals(9, p495.findPoisonedDuration(new int[]{1,2,3,4,5},5));

    }
}