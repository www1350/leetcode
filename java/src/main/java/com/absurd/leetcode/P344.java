package com.absurd.leetcode;

/**
 * https://leetcode.com/problems/reverse-string/description/
 * Created by wangwenwei on 17/8/9.
 */
public class P344 {
    /***
     * Write a function that takes a string as input and returns the string reversed.

     Example:
     Given s = "hello", return "olleh".


     * @param s
     * @return
     */
    public String reverseString(String s) {
        int length = s.length();
        char[] arr = s.toCharArray();
        char tmp;
        for(int i=0;i<length/2;i++){
            tmp = arr[i];
            arr[i] = arr[length-i-1];
            arr[length-i-1] =tmp;
        }
        return String.valueOf(arr);
    }
}
