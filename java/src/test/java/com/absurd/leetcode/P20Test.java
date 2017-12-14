package com.absurd.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author wangwenwei
 * @time 2017/12/11
 */
public class P20Test {
    @Test
    public void isValid(){
        Assert.assertTrue( P20.isValid("{{}}"));
        Assert.assertTrue( P20.isValid("{({[]})}"));

        Assert.assertTrue( P20.isValid("({}[]{})"));
        Assert.assertFalse( P20.isValid("{({[}])}"));
        Assert.assertFalse( P20.isValid("{{{]]]]]"));

    }
}
