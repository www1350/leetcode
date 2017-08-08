package com.absurd.leetcode;

import org.junit.Test;

/**
 * Created by wangwenwei on 17/8/8.
 */
public class P28Test {
    @Test
    public void strStr(){
        P28 p = new P28();
        System.out.println(p.strStr("abcsdfdwsdwd","dwd"));
        System.out.println(p.strStr("",""));
        System.out.println(p.strStr("aaa","aaaa"));
        System.out.println(p.strStr("mississippi","issipi"));
        System.out.println("".indexOf(""));
    }
}
