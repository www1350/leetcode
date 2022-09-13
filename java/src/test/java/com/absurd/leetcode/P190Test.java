package com.absurd.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class P190Test {
    @Test
    public void reverseBits(){
        P190 p190 = new P190();
        Assert.assertEquals(p190.reverseBits(43261596),964176192);
    }
}
