package com.absurd.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class P986Test {
    @Test
    public void intervalIntersection(){
        P986 p986 = new P986();
        Assert.assertEquals(p986.intervalIntersection(new int[][]{{0,2},{5,10},{13,23},{24,25}},new int[][]{
                {1,5},{8,12},{15,24},{25,26}}),new int[][]{{1,2},{5,5},{8,10},{15,23},{24,24},{25,25}});
        Assert.assertEquals(p986.intervalIntersection(new int[][]{{3,5},{9,20}},new int[][]{
                {4,5},{7,10},{11,12},{14,15},{16,20}}),new int[][]{{4,5},{9,10},{11,12},{14,15},{16,20}});
    }
}
