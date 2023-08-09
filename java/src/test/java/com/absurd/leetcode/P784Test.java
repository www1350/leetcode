package com.absurd.leetcode;

import org.junit.Assert;
import org.junit.Test;


public class P784Test {

    @Test
    public void letterCasePermutation(){
        P784 p784 = new P784();
        Assert.assertEquals(p784.letterCasePermutation("a1b2").size(), 4);
    }
}
