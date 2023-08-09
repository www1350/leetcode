package com.absurd.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class P997Test {
    @Test
    public void sortedSquares(){
        P997 p997 = new P997();
        Assert.assertArrayEquals(p997.sortedSquares(new int[]{-3,0,2}), new int[]{0,4,9});

        Assert.assertArrayEquals(p997.sortedSquares(new int[]{-1,2,2}), new int[]{1,4,4});

        Assert.assertArrayEquals(p997.sortedSquares(new int[]{-4,-1,0,3,10}), new int[]{0,1,9,16,100});

        Assert.assertArrayEquals(p997.sortedSquares(new int[]{1}), new int[]{1});

        Assert.assertArrayEquals(p997.sortedSquares(new int[]{-1}), new int[]{1});
    }
}
