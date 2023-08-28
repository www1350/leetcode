package com.absurd.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Absurd
 * @version P322Test.java, v 0.1 2023年08月28日 19:49 Absurd
 */
public class P322Test {
    @Test
    public void coinChange(){
        P322 p322 = new P322();
        Assert.assertEquals(p322.coinChange(new int[]{1, 2, 5}, 11), 3);
        Assert.assertEquals(p322.coinChange(new int[]{2}, 3), -1);
    }
}