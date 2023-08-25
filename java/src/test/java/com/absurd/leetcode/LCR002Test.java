package com.absurd.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Absurd
 * @version LCR002Test.java, v 0.1 2023年08月25日 16:23 Absurd
 */
public class LCR002Test {
    @Test
    public void addBinary(){
        LCR002 lcr002 = new LCR002();
        Assert.assertEquals(lcr002.addBinary("1","111"),"1000");
    }
}