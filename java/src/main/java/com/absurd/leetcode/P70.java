package com.absurd.leetcode;

/**
 * https://leetcode.com/problems/climbing-stairs/description/
 * Created by wangwenwei on 17/8/8.
 */
public class P70 {
    /***
     * You are climbing a stair case. It takes n steps to reach to the top.
     * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
     * Note: Given n will be a positive integer.
     * 1 1 01
     * 2 (1,1 2)2 10
     * 3 (1,1,1 2,1 1,2)3 011
     * 4 (1,1,1,1   1,2,1  2,1,1   1,1,2 2,2  )5  (2[加两步]+3[加一步]) 101
     * 5 8 1000
     * 6 13 1101
     * 7     10101
     * @param n
     * @return
     */
    //DP
    public int climbStairs(int n) {
        int[] dp = new int[n];
        if (n<3) return n;
        dp[0] = 1;
        dp[1] = 2;
        for(int i = 2;i<n;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n-1];
    }
//    //减法代替交换
//    public int climbStairs(int n) {
//        if(n<3) return n;
//        int a = 1;
//        int b = 2;
//        //1 2 3 5 8
//        //1 2      1 3
//        for(int i = 0;i<n-2;i++){
//            b = a+b;
//            a = b-a;
//        }
//        return b;
//    }


    //循环，好处，比递归少用栈，缺点还是时间复杂度高
//    public int climbStairs(int n) {
//        if(n<3) return n;
//        int a = 1;
//        int b = 2;
//        //1 2 3 5 8
//        //01 10
//        //11 01 10
//        for(int i = 0;i<n-2;i++){
//            a = a^b;
//            b = a^b;
//            a = a^b;
//            b = a+b;
//        }
//        return b;
//
//    }

    //递归解法，缺点，重复运算比如算f6 ＝ f5+f4  f5=f4+f3 这里的f4就重复运算了
//    public int climbStairs(int n) {
//        if(n<3) return n;
//        return climbStairs(n-1)+climbStairs(n-2);
//    }
}
