package com.absurd.leetcode;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by wangwenwei on 17/8/9.
 */
public class P48Test {
    @Test
    public void rotate(){
        P48 p = new P48();
        int[][] mar = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        p.rotate(mar);
        System.out.println(Arrays.deepToString(mar));
    }
}
