package com.absurd.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class P79Test {
    @Test
    public void exist(){
        P79 p = new P79();
        Assert.assertFalse(p.exist(new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}}, "ABCB"));
    }
}
