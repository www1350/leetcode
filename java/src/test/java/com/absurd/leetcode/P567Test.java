package com.absurd.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class P567Test {
    @Test
    public void checkInclusion(){
        P567 p = new P567();
        Assert.assertTrue(p.checkInclusion("abc","bbbca"));

        Assert.assertTrue(p.checkInclusion("ab","eidbaooo"));

        Assert.assertFalse(p.checkInclusion("ab","eidboaoo"));

        Assert.assertFalse(p.checkInclusion("hello","ooolleoooleh"));


    }
}
