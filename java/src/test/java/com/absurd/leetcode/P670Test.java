package com.absurd.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class P670Test {
    @Test
    public void maximumSwap(){
        P670 p670 = new P670();
        Assert.assertEquals(p670.maximumSwap(9973),9973);
        Assert.assertEquals(p670.maximumSwap(1993),9913);

    }
}
