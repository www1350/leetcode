package com.absurd.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * P14Test
 *
 * @author Absurd
 * @version 2023/08/10 22:42
 **/
public class P14Test {
    @Test
    public void longestCommonPrefix(){
        P14 p14 = new P14();
        Assert.assertEquals(p14.longestCommonPrefix(new String[]{"ab","a","a"}),"a");
        Assert.assertEquals(p14.longestCommonPrefix(new String[]{"flower","flow","flight"}),"fl");
        Assert.assertEquals(p14.longestCommonPrefix(new String[]{"dog","racecar","car"}),"");
        Assert.assertEquals(p14.longestCommonPrefix(new String[]{"aflower","bflow","cflight"}),"");
        Assert.assertEquals(p14.longestCommonPrefix(new String[]{"","flow","flight"}),"");
    }
}
