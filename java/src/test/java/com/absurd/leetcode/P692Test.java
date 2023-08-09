package com.absurd.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class P692Test {
    @Test
    public void topKFrequent(){
        P692 p = new P692();
        Assert.assertArrayEquals(p.topKFrequent(new String[]{"i", "love", "leetcode", "i", "love", "coding"}, 2).toArray(), new String[]{"i", "love"});
        Assert.assertArrayEquals(p.topKFrequent(new String[]{"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"}, 4).toArray(), new String[]{"the", "is", "sunny", "day"});



    }
}
