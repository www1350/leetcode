package com.absurd.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class P62Test {
    @Test
    public void uniquePaths(){
        P62 p = new P62();
        Assert.assertEquals(p.uniquePaths(3,2),3);

        Assert.assertEquals(p.uniquePaths(3,7),28);
    }
}
