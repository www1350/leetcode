package com.absurd.leetcode;

/**
 * https://leetcode.com/problems/implement-strstr/description/
 * Created by wangwenwei on 17/8/8.
 */
public class P28 {

    /***
     * Implement strStr().
     * Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
     * @param haystack
     * @param needle
     * @return
     */
    public int strStr(String haystack, String needle) {
        int hySize = haystack.length();
        int ndSize = needle.length();
        if ("".equals(needle)) return 0;
        //abcsdfdwsdwd
        //dwd
        for(int i=0;i<hySize;i++){
            //剩余长度根本不可能匹配，跳出
            if (hySize-i<ndSize) break;
            //包含回溯
            for(int j=0;j<ndSize;j++){
                if (i+j>=hySize) break;
                if (haystack.charAt(i+j)!= needle.charAt(j)) break;
                if (j == ndSize -1) {
                    return i;
                }
            }
        }
        return -1;

    }
}
