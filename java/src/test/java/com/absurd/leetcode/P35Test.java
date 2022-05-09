package com.absurd.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author wangwenwei
 * @time 2018/7/31
 */
public class P35Test {
    P35 p35 = new P35();
    @Test
    public void searchInsert(){
        Assert.assertEquals(p35.searchInsert(new int[]{ 1,3,5,6},5) , 2);
        Assert.assertEquals(p35.searchInsert(new int[]{ 1,3,5,6},2) , 1);
        Assert.assertEquals(p35.searchInsert(new int[]{ 1,3,5,6},7) , 4);
        Assert.assertEquals(p35.searchInsert(new int[]{ 1,3,5,6},0) , 0);

    }
}
