package com.absurd.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class P1091Test {
    @Test
    public void shortestPathBinaryMatrix(){
        P1091 p1091 = new P1091();
        Assert.assertEquals(p1091.shortestPathBinaryMatrix(new int[][]{{0,0,0},{1,1,0},{1,1,0}}), 4);
        Assert.assertEquals(p1091.shortestPathBinaryMatrix(new int[][]{{0,0,1,0},{1,0,1,0},{1,1,0,1},{0,0,0,0}}), 4);
    }
}
