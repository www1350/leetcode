package com.absurd.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class P844_2Test {
    @Test
    public void backspaceCompare(){
        P844_2 p = new P844_2();
        Assert.assertTrue(p.backspaceCompare("ab#c","ad#c"));

        Assert.assertTrue(p.backspaceCompare("ab###","ad##"));


        Assert.assertTrue(p.backspaceCompare("ab######","c#d#"));
    }


}
