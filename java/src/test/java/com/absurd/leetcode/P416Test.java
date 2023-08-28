package com.absurd.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Absurd
 * @version P416Test.java, v 0.1 2023年08月28日 20:35 Absurd
 */
public class P416Test {
    @Test
    public void canPartition(){
        P416 p416 = new P416();
        Assert.assertEquals(p416.canPartition(new int[]{1,5,11,5}), true);
        Assert.assertEquals(p416.canPartition(new int[]{1,2,3,5}), false);


    }
}