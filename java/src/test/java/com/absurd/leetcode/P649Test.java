/*
 * Ant Group
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package com.absurd.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Absurd
 * @version P649Test.java, v 0.1 2023年08月18日 14:15 Absurd
 */
public class P649Test {
    @Test
    public void predictPartyVictory(){
        P649 p649 = new P649();
        Assert.assertEquals("Dire",p649.predictPartyVictory("DDRRR"));

        Assert.assertEquals("Dire",p649.predictPartyVictory("DR"));

        Assert.assertEquals("Radiant",p649.predictPartyVictory("DRR"));

        Assert.assertEquals("Dire",p649.predictPartyVictory("RDD"));
    }
}