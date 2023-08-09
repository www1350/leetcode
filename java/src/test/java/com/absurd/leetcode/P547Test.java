package com.absurd.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class P547Test {
    @Test
    public void findCircleNum(){
        P547 p547 = new P547();
        Assert.assertEquals(p547.findCircleNum(new int[][]{{1,0,0,1},{0,1,1,0},{0,1,1,1},{1,0,1,1}}),1);
    }
}
