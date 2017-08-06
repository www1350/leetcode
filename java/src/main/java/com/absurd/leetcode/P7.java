package com.absurd.leetcode;

/**
 * Created by wangwenwei on 17/8/6.
 */
public class P7 {

    /***
     * Reverse digits of an integer.
     * Example1: x = 123, return 321
     * Example2: x = -123, return -321
     * click to show spoilers.
     *
     * Note:
     * The input is assumed to be a 32-bit signed integer. Your function should return 0 when the reversed integer overflows.
     */
    public int reverse(int x) {
        boolean flag = false;
        int n = x ;
        if (x<0) {
            flag =true;
            n = -x;
        }

        long sum = 0;
        while(n>0){
            sum = sum * 10 + n%10;
            n = n/10;
        }


        if (flag) sum = - sum;
        if (sum > Integer.MAX_VALUE) return 0;
        if (sum < Integer.MIN_VALUE) return 0;
        return (int)sum;
    }
}
