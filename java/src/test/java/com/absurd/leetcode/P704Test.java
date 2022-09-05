package com.absurd.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class P704Test {

    @Test
    public void search(){
        P704 p704 = new P704();
        Assert.assertEquals(p704.search(new int[]{-1,0,3,5,9,12}, 2),-1);

        Assert.assertEquals(p704.search(new int[]{-1,0,3,5,9,12}, 9),4);

        Assert.assertEquals(p704.search(new int[]{5}, 5),0);


        Assert.assertEquals(p704.search(new int[]{2,5}, 5),1);
        Assert.assertEquals(p704.search(new int[]{2,5}, 2),0);
    }
}
