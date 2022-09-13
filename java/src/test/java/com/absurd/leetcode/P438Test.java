package com.absurd.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class P438Test {
    @Test
    public void findAnagrams(){
        P438 p = new P438();
        Assert.assertArrayEquals(p.findAnagrams("cbaebabacd", "abc").toArray(), new Integer[]{0, 6});

        Assert.assertArrayEquals(p.findAnagrams("abab", "ab").toArray(), new Integer[]{0, 1,2});

        Assert.assertArrayEquals(p.findAnagrams("aaaaaaaaaa", "aaaaaaaaaaaaa").toArray(), new Integer[]{});
    }

}
