package com.absurd.leetcode;

import org.junit.Test;

import java.util.List;

/**
 * Created by wangwenwei on 17/8/7.
 */
public class P15Test {
    @Test
    public void threeSum() {
        int[] S = {-1, 0, 1, 2, -1, -4};
        P15 p = new P15();
        List<List<Integer>> all = p.threeSum(S);
        System.out.println(all);


        int[] SS = {0, 0, 0, 0,0, 0};
         all = p.threeSum(SS);
        System.out.println(all);


        int[] SSS = {0, 0};
        all = p.threeSum(SSS);
        System.out.println(all);

        int[] SSSS = {1,2,-2,-1};
        all = p.threeSum(SSSS);
        System.out.println(all);


        int[] SSSSS = {1,1,-2};
        all = p.threeSum(SSSSS);
        System.out.println(all);


        int[] SSSSSS = {-2,0,1,1,2};
        all = p.threeSum(SSSSSS);
        System.out.println(all);

        int[] SSSSSSS = {-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6};
        all = p.threeSum(SSSSSSS);
        System.out.println(all);

    }
}
