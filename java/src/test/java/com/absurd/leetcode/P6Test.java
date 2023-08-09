package com.absurd.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * P6Test
 *
 * @author Absurd
 * @version 2023/08/09 23:54
 **/
public class P6Test {
    @Test
    public void convert(){
        P6 p6 = new P6();
        Assert.assertEquals(p6.convert("ABC",2),"ACB");
        Assert.assertEquals(p6.convert("A",1),"A");
        Assert.assertEquals(p6.convert("PAYPALISHIRING",2),"PYAIHRNAPLSIIG");
        Assert.assertEquals(p6.convert("PAYPALISHIRING",3),"PAHNAPLSIIGYIR");
        Assert.assertEquals(p6.convert("PAYPALISHIRING",4),"PINALSIGYAHRPI");


    }
}
