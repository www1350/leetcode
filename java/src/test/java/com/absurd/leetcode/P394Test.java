package com.absurd.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class P394Test {
    @Test
    public void decodeString(){
        P394 p394 = new P394();
        Assert.assertEquals(p394.decodeString("3[a]2[bc]"),"aaabcbc");
    }
}
