package com.absurd.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * P27Test
 *
 * @author Absurd
 * @version 2023/08/10 23:04
 **/
public class P27Test {
    @Test
    public void removeElement(){
        P27 p27 = new P27();
        Assert.assertEquals(p27.removeElement(new int[]{3,2,2,3}, 3),2);

        Assert.assertEquals(p27.removeElement(new int[]{0,1,2,2,3,0,4,2}, 2),5);
    }
}
