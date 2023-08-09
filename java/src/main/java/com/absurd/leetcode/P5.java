package com.absurd.leetcode;

/***
 * 给你一个字符串 s，找到 s 中最长的回文子串。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：s = "babad"
 * 输出："bab"
 * 解释："aba" 同样是符合题意的答案。
 * 示例 2：
 *
 * 输入：s = "cbbd"
 * 输出："bb"
 *  
 *
 * 提示：
 *
 * 1 <= s.length <= 1000
 * s 仅由数字和英文字母组成
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/longest-palindromic-substring
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class P5 {
    public String longestPalindrome(String s) {
        if (s.isEmpty()){
            return s;
        }
        // 找中心
        // aracbcarafhdjsfisheiuhdsdfheu
        // aab
        int maxLength = 0;
        int start = 0;
        for(int i=0;i<s.length();i++){
            int lenOdd = findAroundCenter(s, i, i);
            int lenEve = findAroundCenter(s, i, i+1);
            int len = Math.max(lenOdd, lenEve);
            if (len > maxLength) {
                maxLength = len;
                start = i - (maxLength - 1) / 2;
            }
        }
        return s.substring(start, start+maxLength);

    }

    private int findAroundCenter(String s, int left, int right) {
        int minLeft = left;
        int maxRight = right;
        while (minLeft>=0 && maxRight<s.length() && s.charAt(minLeft)==s.charAt(maxRight) ){
            minLeft--;
            maxRight++;
        }
        return maxRight - minLeft -1;
    }
}
