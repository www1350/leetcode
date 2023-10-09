package com.absurd.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author absurd
 * @version P76Test.java, v 0.1 2023年10月09日 13:33 absurd
 */
public class P76Test {
    @Test
    public void minWindow(){
        P76 p76 = new P76();
        Assert.assertEquals(p76.minWindow("ADOBECODEBANC","ABC"),"BANC");
        Assert.assertEquals(p76.minWindow("a","a"),"a");
        Assert.assertEquals(p76.minWindow("a","aa"),"");
    }
}