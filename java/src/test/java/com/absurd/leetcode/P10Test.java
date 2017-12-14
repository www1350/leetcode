package com.absurd.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author wangwenwei
 * @time 2017/12/9
 */
public class P10Test {
    @Test
    public void isMatch(){
        Assert.assertFalse(P10.isMatch("aa","a"));
        Assert.assertTrue(P10.isMatch("aa","aa"));
        Assert.assertFalse(P10.isMatch("aaa","aa"));
        Assert.assertTrue(P10.isMatch("aa", "a*"));
        Assert.assertTrue(P10.isMatch("aa", ".*"));
        Assert.assertTrue(P10.isMatch("ab", ".*"));
        Assert.assertTrue(P10.isMatch("aab", "c*a*b"));

    }
}
