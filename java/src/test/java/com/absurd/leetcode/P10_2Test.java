package com.absurd.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author wangwenwei
 * @time 2017/12/9
 */
public class P10_2Test {
    @Test
    public void isMatch(){
        Assert.assertFalse(P10_2.isMatch("aa","a"));
        Assert.assertTrue(P10_2.isMatch("aa","aa"));
        Assert.assertFalse(P10_2.isMatch("aaa","aa"));
        Assert.assertTrue(P10_2.isMatch("aa", "a*"));
        Assert.assertTrue(P10_2.isMatch("aa", ".*"));
        Assert.assertTrue(P10_2.isMatch("ab", ".*"));
        Assert.assertTrue(P10_2.isMatch("aab", "c*a*b"));

    }
}
