package com.absurd.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author wangwenwei
 * @time 2017/12/10
 */
public class P13Test {
    @Test
    public void romanToInt(){
        Assert.assertEquals(P13.romanToInt("MCM"),1900);
        Assert.assertEquals(P13.romanToInt("MDC"),1600);
        Assert.assertEquals(P13.romanToInt("MDCCCLXXXVIII"),1888);
        Assert.assertEquals(P13.romanToInt("XVI"),16);
    }
}
