package com.absurd.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class P231Test {
    @Test
    public void isPowerOfTwo(){
        P231 p = new P231();
        Assert.assertFalse(p.isPowerOfTwo(1073741825));
    }
}
