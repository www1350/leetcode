package com.absurd.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class P724Test {

    @Test
    public void pivotIndex(){
        P724 p = new P724();
        Assert.assertEquals(p.pivotIndex(new int[]{1,7,3,6,5,6}),  3);
    }
}
