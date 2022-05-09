package com.absurd.leetcode;

/**
 * Given a string and an integer k,
 * you need to reverse the first k characters for every 2k characters counting from the start of the string.
 * If there are less than k characters left, reverse all of them.
 * If there are less than 2k but greater than or equal to k characters,
 * then reverse the first k characters and left the other as original.
 * Input: s = "abcdefg", k = 2
 * Output: "bacdfeg"
 * Restrictions:
 * The string consists of lower English letters only.
 * Length of the given string and k will in the range [1, 10000]
 * @author wangwenwei
 * @time 2018/7/30
 */
public class P541 {

    public String reverseStr(String s, int k) {
        if (k == 0) {
            return s;
        }
        int length = s.length();
        char[] arr = s.toCharArray();
        int loop = length / (2 * k);
        for(int i=0;i <= loop;i++){
            int reverseLength = length < (i * 2+1) * k  ? length : (i * 2+1) * k ;
            int posStart = i * 2 * k;
            char tmp;
            for(int j = posStart,posEnd=reverseLength+posStart;j<posEnd/2;j++){
                tmp = arr[j];
                arr[j] = arr[posEnd-j-1];
                arr[posEnd-j-1] =tmp;
            }
        }
        return String.valueOf(arr);
    }
}
