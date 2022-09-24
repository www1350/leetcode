package com.absurd.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class P40Test {
    @Test
    public void combinationSum2(){
        P40 p = new P40();
        Assert.assertArrayEquals(p.combinationSum2(new int[]{10,1,2,7,6,1,5},8).toArray(), new int[][]{{1,1,6},{1,2,5},{1,7},{2,6}});
    }
}
