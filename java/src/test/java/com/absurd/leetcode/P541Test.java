package com.absurd.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author wangwenwei
 * @time 2018/7/30
 */
public class P541Test {
    @Test
    public void reverseString(){
        P541 p = new P541();

        Assert.assertEquals(p.reverseStr("a",1),"a");
        Assert.assertEquals(p.reverseStr("abc", 2),"bac" );
        Assert.assertEquals(p.reverseStr("abcd", 2),"bacd" );
        Assert.assertEquals(p.reverseStr("abcde", 2),"bacde" );
        Assert.assertEquals(p.reverseStr("abcdef", 2),"bacdfe" );
        Assert.assertEquals(p.reverseStr("abcdefg", 2),"bacdfeg" );
        Assert.assertEquals(p.reverseStr("abcdefgabcdefg", 2),"bacdfegacbdegf" );



    }
}
