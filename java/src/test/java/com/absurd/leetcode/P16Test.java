/*
 * Ant Group
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package com.absurd.leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Absurd
 * @version P16Test.java, v 0.1 2023年08月15日 16:46 Absurd
 */
public class P16Test {
    @Test
    public void threeSumClosest(){
        P16 p16 = new P16();
        Assert.assertEquals(p16.threeSumClosest(new int[]{-1,2,1,-4}, 1),2);

        Assert.assertEquals(p16.threeSumClosest(new int[]{0,0,0}, 1),0);

        Map<Character,Integer> map = new LinkedHashMap<>();


    }
}