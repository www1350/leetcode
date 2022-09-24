package com.absurd.leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class P17Test {
    @Test
    public void letterCombinations(){
        P17 p17 = new P17();
        Assert.assertArrayEquals(p17.letterCombinations("23").toArray(), new String[]{"ad","ae","af","bd","be","bf","cd","ce","cf"});
    }
}
