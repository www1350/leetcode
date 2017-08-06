package com.absurd.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by wangwenwei on 17/8/6.
 */
public class P7Test {
    @Test
    public void reverse(){
        P7 p = new P7();
        int a = p.reverse(123);
        Assert.assertEquals(321,a);
        a = p.reverse(100);
        Assert.assertEquals(1,a);
        a = p.reverse(-123);
        Assert.assertEquals(-321,a);
        a = p.reverse(1000004);
        Assert.assertEquals(4000001,a);
        a = p.reverse(-2147483648);
        Assert.assertEquals(0,a);
        a = p.reverse(2147483646);
        Assert.assertEquals(0,a);
        a = p.reverse(1534236469);
        Assert.assertEquals(0,a);
        a = p.reverse(1000000003);
        Assert.assertEquals(0,a);
        a = p.reverse(0);
        Assert.assertEquals(0,a);
    }
}
