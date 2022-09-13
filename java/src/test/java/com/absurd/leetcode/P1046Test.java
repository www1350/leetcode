package com.absurd.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class P1046Test {
    @Test
    public void lastStoneWeight(){
        P1046 p1046 = new P1046();
        Assert.assertEquals(p1046.lastStoneWeight(new int[]{2,7,4,1,8,1}), 1);
    }
}
