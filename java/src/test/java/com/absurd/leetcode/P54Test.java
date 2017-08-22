package com.absurd.leetcode;

import org.junit.Test;

import java.util.List;

/**
 * Created by wangwenwei on 2017/8/22.
 */
public class P54Test {
    @Test
    public void spiralOrder(){
        P54 p = new P54();
        int[][] matrix =  {
                { 1, 2, 3, 4 },
     { 5, 6, 7, 8},
     { 9, 10, 11, 12 },
     { 13, 14, 15, 16 }
    };
        List<Integer> list =  p.spiralOrder(matrix);
        System.out.println(list);
    }
}
