package com.absurd.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class P205Test {
    @Test
    public void isIsomorphic(){
        P205 p205 = new P205();
        Assert.assertTrue(p205.isIsomorphic("paper", "title"));

        Assert.assertFalse(p205.isIsomorphic("badc","baba"));
    }
}
