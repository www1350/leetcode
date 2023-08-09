package com.absurd.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * P12Test
 *
 * @author Absurd
 * @version 2023/08/10 00:18
 **/
public class P12Test {
    @Test
    public void intToRoman(){
        P12 p12 = new P12();
        Assert.assertEquals(p12.intToRoman(1),"I");
        Assert.assertEquals(p12.intToRoman(2),"II");
        Assert.assertEquals(p12.intToRoman(3),"III");
        Assert.assertEquals(p12.intToRoman(4),"IV");
        Assert.assertEquals(p12.intToRoman(58),"LVIII");
        Assert.assertEquals(p12.intToRoman(1994),"MCMXCIV");
        Assert.assertEquals(p12.intToRoman(2058),"MMLVIII");
        Assert.assertEquals(p12.intToRoman(3999),"MMMCMXCIX");


    }
}
