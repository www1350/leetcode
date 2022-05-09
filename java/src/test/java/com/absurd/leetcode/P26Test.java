package com.absurd.leetcode;

import org.junit.Assert;
import org.junit.Test;


/**
 * @author wangwenwei
 * @time 2017/12/17
 */
public class P26Test {
    @Test
    public void removeDuplicates(){
        int[] arr = new int[]{1,1,2};
        int size = P26.removeDuplicates(arr);
        int[] des = new int[size];
        System.arraycopy(arr,0,des,0,size);
        Assert.assertEquals(size,2);
        Assert.assertArrayEquals(des,new int[]{1,2});
    }
}
