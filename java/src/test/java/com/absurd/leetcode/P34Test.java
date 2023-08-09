package com.absurd.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class P34Test {
    @Test
    public void searchRange(){
        P34 p = new P34();
        Assert.assertArrayEquals(p.searchRange(new int[]{5,7,7,8,8,10}, 8),new int[]{3,4});
    }
}
