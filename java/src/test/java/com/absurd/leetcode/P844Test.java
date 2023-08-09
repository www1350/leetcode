package com.absurd.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class P844Test {
    @Test
    public void backspaceCompare(){
        P844 p = new P844();
        Assert.assertTrue(p.backspaceCompare("ab#c","ad#c"));

        Assert.assertTrue(p.backspaceCompare("ab###","ad##"));
    }


}
