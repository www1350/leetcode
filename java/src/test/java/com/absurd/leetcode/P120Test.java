package com.absurd.leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class P120Test {
    @Test
    public void minimumTotal(){
        P120 p = new P120();
        p.minimumTotal(buildList(new int[][]{new int[]{2},new int[]{3,4},new int[]{6,5,7},new int[]{4,1,8,3}}));
    }

    private List<List<Integer>> buildList(int[][] arr){
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            List<Integer> list = new ArrayList<>();
            res.add(list);
            for (int j = 0; j < arr[i].length; j++) {
                list.add(arr[i][j]);
            }
        }
        return res;
    }
}
