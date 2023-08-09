package com.absurd.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class P198Test {
    @Test
    public void rob() {
        P198 p198 = new P198();
        Assert.assertEquals(p198.rob(new int[]{1,2,3,1}), 4);
    }
}
