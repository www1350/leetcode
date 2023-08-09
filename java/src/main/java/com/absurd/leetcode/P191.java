package com.absurd.leetcode;

/***
 *
 */
public class P191 {
    public static void main(String[] args) {
        System.out.println((-3)>>1);
    }
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        while(n!=0){
            if((n & 1) == 1){
                count++;
            }
            n>>=1;
        }
        return count;
    }
}
